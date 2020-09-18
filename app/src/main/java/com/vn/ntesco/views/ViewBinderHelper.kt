package com.vn.ntesco.views

import android.os.Bundle
import java.util.*

class ViewBinderHelper {
    private val BUNDLE_MAP_KEY = "ViewBinderHelper_Bundle_Map_Key"

    private var mapStates = Collections.synchronizedMap(HashMap<String, Int>())
    private val mapLayouts: MutableMap<String, NtescoRevealLayout?> = Collections.synchronizedMap<String, NtescoRevealLayout?>(HashMap<String, NtescoRevealLayout?>())
    private val lockedSwipeSet = Collections.synchronizedSet(HashSet<String>())

    @Volatile
    private var openOnlyOne = false
    private val stateChangeLock = Any()

    /**
     * Help to save and restore open/close state of the swipeLayout. Call this method
     * when you bind your view holder with the data object.
     *
     * @param swipeLayout swipeLayout of the current view.
     * @param id a string that uniquely defines the data object of the current view.
     */
    fun bind(swipeLayout: NtescoRevealLayout, id: String) {
        if (swipeLayout.shouldRequestLayout()) {
            swipeLayout.requestLayout()
        }
        mapLayouts.values.remove(swipeLayout)
        mapLayouts[id] = swipeLayout
        swipeLayout.abort()
        swipeLayout.setDragStateChangeListener(object : NtescoRevealLayout.DragStateChangeListener {
            override  fun onDragStateChanged(state: Int) {
                mapStates[id] = state
                if (openOnlyOne) {
                    closeOthers(id, swipeLayout)
                }
            }
        })

        // first time binding.
        if (!mapStates.containsKey(id)) {
            mapStates[id] = NtescoRevealLayout.STATE_CLOSE
            swipeLayout.close(false)
        } else {
            val state = mapStates[id]!!
            if (state == NtescoRevealLayout.STATE_CLOSE || state == NtescoRevealLayout.STATE_CLOSING || state == NtescoRevealLayout.STATE_DRAGGING) {
                swipeLayout.close(false)
            } else {
                swipeLayout.open(false)
            }
        }

        // set lock swipe
        swipeLayout.setLockDrag(lockedSwipeSet.contains(id))
    }

    /**
     * Only if you need to restore open/close state when the orientation is changed.
     * Call this method in [android.app.Activity.onSaveInstanceState]
     */
    fun saveStates(outState: Bundle?) {
        if (outState == null) return
        val statesBundle = Bundle()
        for ((key, value) in mapStates) {
            statesBundle.putInt(key, value)
        }
        outState.putBundle(BUNDLE_MAP_KEY, statesBundle)
    }


    /**
     * Only if you need to restore open/close state when the orientation is changed.
     * Call this method in [android.app.Activity.onRestoreInstanceState]
     */
    fun restoreStates(inState: Bundle?) {
        if (inState == null) return
        if (inState.containsKey(BUNDLE_MAP_KEY)) {
            val restoredMap = HashMap<String, Int>()
            val statesBundle = inState.getBundle(BUNDLE_MAP_KEY)
            val keySet = statesBundle.keySet()
            if (keySet != null) {
                for (key in keySet) {
                    restoredMap[key] = statesBundle.getInt(key)
                }
            }
            mapStates = restoredMap
        }
    }

    /**
     * Lock swipe for some layouts.
     * @param id a string that uniquely defines the data object.
     */
    fun lockSwipe(vararg id: String) {
        setLockSwipe(true, *id)
    }

    /**
     * Unlock swipe for some layouts.
     * @param id a string that uniquely defines the data object.
     */
    fun unlockSwipe(vararg id: String) {
        setLockSwipe(false, *id)
    }

    /**
     * @param openOnlyOne If set to true, then only one row can be opened at a time.
     */
    fun setOpenOnlyOne(openOnlyOne: Boolean) {
        this.openOnlyOne = openOnlyOne
    }

    /**
     * Open a specific layout.
     * @param id unique id which identifies the data object which is bind to the layout.
     */
    fun openLayout(id: String) {
        synchronized(stateChangeLock) {
            mapStates[id] = NtescoRevealLayout.STATE_OPEN
            if (mapLayouts.containsKey(id)) {
                val layout: NtescoRevealLayout? = mapLayouts[id]
                layout!!.open(true)
            } else if (openOnlyOne) {
                closeOthers(id, mapLayouts[id])
            }
        }
    }

    /**
     * Close a specific layout.
     * @param id unique id which identifies the data object which is bind to the layout.
     */
    fun closeLayout(id: String) {
        synchronized(stateChangeLock) {
            mapStates[id] = NtescoRevealLayout.STATE_CLOSE
            if (mapLayouts.containsKey(id)) {
                val layout: NtescoRevealLayout? = mapLayouts[id]
                layout?.close(true)
            }
        }
    }

    /**
     * Close others swipe layout.
     * @param id layout which bind with this data object id will be excluded.
     * @param swipeLayout will be excluded.
     */
    private fun closeOthers(id: String, swipeLayout: NtescoRevealLayout?) {
        synchronized(stateChangeLock) {
            // close other rows if openOnlyOne is true.
            if (getOpenCount() > 1) {
                for (entry in mapStates.entries) {
                    if (entry.key != id) {
                        entry.setValue(NtescoRevealLayout.STATE_CLOSE)
                    }
                }
                for (layout in mapLayouts.values) {
                    if (layout !== swipeLayout) {
                        layout?.close(true)
                    }
                }
            }
        }
    }

    private fun setLockSwipe(lock: Boolean, vararg id: String) {
        if (id == null || id.size == 0) return
        if (lock) lockedSwipeSet.addAll(Arrays.asList(*id)) else lockedSwipeSet.removeAll(Arrays.asList(*id))
        for (s in id) {
            val layout: NtescoRevealLayout? = mapLayouts[s]
            if (layout != null) {
                layout.setLockDrag(lock)
            }
        }
    }

    private fun getOpenCount(): Int {
        var total = 0
        for (state in mapStates.values) {
            if (state == NtescoRevealLayout.STATE_OPEN || state == NtescoRevealLayout.STATE_OPENING) {
                total++
            }
        }
        return total
    }
}
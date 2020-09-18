package com.vn.ntesco.views

import android.app.Activity
import android.content.Context
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import android.widget.TextView
import com.vn.ntesco.R


class NtescoInfoWindowAdapter(val address: String, val context: Activity) : GoogleMap.InfoWindowAdapter {


    override fun getInfoContents(p0: Marker?): View {
       val rootView = context.layoutInflater.inflate(R.layout.title_marker_layout, null);
        val tvTitle = rootView.findViewById(R.id.tvTitle) as TextView
        tvTitle.setText(address)
        return rootView
    }

    override fun getInfoWindow(p0: Marker?): View?{
        return null;
    }

}
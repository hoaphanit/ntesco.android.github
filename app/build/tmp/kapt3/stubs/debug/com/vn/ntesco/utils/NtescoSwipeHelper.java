package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001RB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u00106\u001a\u000207H\u0002J6\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010?\u001a\u000200H\u0002J\u0010\u0010@\u001a\u0002002\u0006\u0010A\u001a\u000200H\u0016J\u0010\u0010B\u001a\u0002002\u0006\u0010A\u001a\u000200H\u0016J\u001e\u0010C\u001a\u0002072\u0006\u0010D\u001a\u00020E2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J@\u0010F\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010D\u001a\u00020E2\u0006\u0010H\u001a\u0002002\u0006\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020\u00072\u0006\u0010K\u001a\u00020LH\u0016J \u0010M\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010D\u001a\u00020E2\u0006\u0010N\u001a\u00020EH\u0016J\u0018\u0010O\u001a\u0002072\u0006\u0010D\u001a\u00020E2\u0006\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u000207H\u0002R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070%X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010,\u00a8\u0006S"}, d2 = {"Lcom/vn/ntesco/utils/NtescoSwipeHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "context", "Landroid/content/Context;", "recyclerview", "Landroidx/recyclerview/widget/RecyclerView;", "widthButton", "", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView;I)V", "buttonBuffer", "", "", "Lcom/vn/ntesco/views/ItemButton;", "getButtonBuffer", "()Ljava/util/Map;", "setButtonBuffer", "(Ljava/util/Map;)V", "buttonList", "getButtonList", "()Ljava/util/List;", "setButtonList", "(Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "gestureDetector", "Landroid/view/GestureDetector;", "getGestureDetector", "()Landroid/view/GestureDetector;", "setGestureDetector", "(Landroid/view/GestureDetector;)V", "gestureListener", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getRecyclerview", "()Landroidx/recyclerview/widget/RecyclerView;", "removeQueue", "Ljava/util/LinkedList;", "getRemoveQueue", "()Ljava/util/LinkedList;", "setRemoveQueue", "(Ljava/util/LinkedList;)V", "swipePosition", "getSwipePosition", "()I", "setSwipePosition", "(I)V", "swipeThresold", "", "getSwipeThresold", "()F", "setSwipeThresold", "(F)V", "getWidthButton", "attachSwipe", "", "drawButton", "c", "Landroid/graphics/Canvas;", "itemView", "Landroid/view/View;", "buffer", "pos", "translationX", "getSwipeEscapeVelocity", "defaultValue", "getSwipeVelocityThreshold", "instantiateButton", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onChildDraw", "recyclerView", "dX", "dY", "actionState", "isCurrentlyActive", "", "onMove", "target", "onSwiped", "direction", "recoverSwipeItem", "IntLinkedList", "app_debug"})
public abstract class NtescoSwipeHelper extends androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.vn.ntesco.views.ItemButton> buttonList;
    @org.jetbrains.annotations.NotNull()
    public android.view.GestureDetector gestureDetector;
    private int swipePosition;
    private float swipeThresold;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Integer, java.util.List<com.vn.ntesco.views.ItemButton>> buttonBuffer;
    @org.jetbrains.annotations.NotNull()
    public java.util.LinkedList<java.lang.Integer> removeQueue;
    private final android.view.GestureDetector.SimpleOnGestureListener gestureListener = null;
    private final android.view.View.OnTouchListener onTouchListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView recyclerview = null;
    private final int widthButton = 0;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vn.ntesco.views.ItemButton> getButtonList() {
        return null;
    }
    
    public final void setButtonList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.views.ItemButton> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.GestureDetector getGestureDetector() {
        return null;
    }
    
    public final void setGestureDetector(@org.jetbrains.annotations.NotNull()
    android.view.GestureDetector p0) {
    }
    
    public final int getSwipePosition() {
        return 0;
    }
    
    public final void setSwipePosition(int p0) {
    }
    
    public final float getSwipeThresold() {
        return 0.0F;
    }
    
    public final void setSwipeThresold(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<com.vn.ntesco.views.ItemButton>> getButtonBuffer() {
        return null;
    }
    
    public final void setButtonBuffer(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.util.List<com.vn.ntesco.views.ItemButton>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedList<java.lang.Integer> getRemoveQueue() {
        return null;
    }
    
    public final void setRemoveQueue(@org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.Integer> p0) {
    }
    
    public abstract void instantiateButton(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.views.ItemButton> buffer);
    
    private final synchronized void recoverSwipeItem() {
    }
    
    private final void attachSwipe() {
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public float getSwipeEscapeVelocity(float defaultValue) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getSwipeVelocityThreshold(float defaultValue) {
        return 0.0F;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    private final void drawButton(android.graphics.Canvas c, android.view.View itemView, java.util.List<com.vn.ntesco.views.ItemButton> buffer, int pos, float translationX) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerview() {
        return null;
    }
    
    public final int getWidthButton() {
        return 0;
    }
    
    public NtescoSwipeHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerview, int widthButton) {
        super(0, 0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\r\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/vn/ntesco/utils/NtescoSwipeHelper$IntLinkedList;", "Ljava/util/LinkedList;", "", "()V", "add", "", "element", "contains", "indexOf", "lastIndexOf", "remove", "()Ljava/lang/Integer;", "app_debug"})
    public static final class IntLinkedList extends java.util.LinkedList<java.lang.Integer> {
        
        @java.lang.Override()
        public boolean contains(int element) {
            return false;
        }
        
        @java.lang.Override()
        public final boolean contains(java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int lastIndexOf(int element) {
            return 0;
        }
        
        @java.lang.Override()
        public final int lastIndexOf(java.lang.Object p0) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer remove() {
            return null;
        }
        
        @java.lang.Override()
        public int indexOf(int element) {
            return 0;
        }
        
        @java.lang.Override()
        public final int indexOf(java.lang.Object p0) {
            return 0;
        }
        
        @java.lang.Override()
        public boolean add(int element) {
            return false;
        }
        
        public IntLinkedList() {
            super();
        }
        
        @java.lang.Override()
        public boolean remove(java.lang.Integer p0) {
            return false;
        }
        
        @java.lang.Override()
        public final boolean remove(java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public java.lang.Integer removeAt(int p0) {
            return null;
        }
        
        @java.lang.Override()
        public final java.lang.Integer remove(int p0) {
            return null;
        }
        
        @java.lang.Override()
        public int getSize() {
            return 0;
        }
        
        @java.lang.Override()
        public final int size() {
            return 0;
        }
    }
}
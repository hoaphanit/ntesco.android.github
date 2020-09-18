package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/vn/ntesco/fragment/WorkaroundMapFragment;", "Lcom/google/android/gms/maps/SupportMapFragment;", "()V", "mListener", "Lcom/vn/ntesco/fragment/WorkaroundMapFragment$OnTouchListener;", "onCreateView", "Landroid/view/View;", "layoutInflater", "Landroid/view/LayoutInflater;", "viewGroup", "Landroid/view/ViewGroup;", "savedInstance", "Landroid/os/Bundle;", "setListener", "", "listener", "OnTouchListener", "TouchableWrapper", "app_debug"})
public final class WorkaroundMapFragment extends com.google.android.gms.maps.SupportMapFragment {
    private com.vn.ntesco.fragment.WorkaroundMapFragment.OnTouchListener mListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstance) {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.fragment.WorkaroundMapFragment.OnTouchListener listener) {
    }
    
    public WorkaroundMapFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/vn/ntesco/fragment/WorkaroundMapFragment$OnTouchListener;", "", "onTouch", "", "app_debug"})
    public static abstract interface OnTouchListener {
        
        public abstract void onTouch();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/fragment/WorkaroundMapFragment$TouchableWrapper;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Lcom/vn/ntesco/fragment/WorkaroundMapFragment;Landroid/content/Context;)V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "app_debug"})
    public final class TouchableWrapper extends android.widget.FrameLayout {
        private java.util.HashMap _$_findViewCache;
        
        @java.lang.Override()
        public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        public TouchableWrapper(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}
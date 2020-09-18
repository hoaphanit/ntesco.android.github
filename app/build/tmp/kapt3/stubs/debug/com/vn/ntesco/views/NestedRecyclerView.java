package com.vn.ntesco.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016J \u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010 \u001a\u00020\nH\u0016J \u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\rH\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/vn/ntesco/views/NestedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/core/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nestedScrollTarget", "Landroid/view/View;", "nestedScrollTargetIsBeingDragged", "", "nestedScrollTargetWasUnableToScroll", "skipsTouchInterception", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "e", "onNestedScroll", "", "target", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "nestedScrollAxes", "onStopNestedScroll", "app_debug"})
public class NestedRecyclerView extends androidx.recyclerview.widget.RecyclerView implements androidx.core.view.NestedScrollingParent {
    private android.view.View nestedScrollTarget;
    private boolean nestedScrollTargetIsBeingDragged;
    private boolean nestedScrollTargetWasUnableToScroll;
    private boolean skipsTouchInterception;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public void onNestedScroll(@org.jetbrains.annotations.NotNull()
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
    }
    
    @java.lang.Override()
    public void onNestedScrollAccepted(@org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int axes) {
    }
    
    @java.lang.Override()
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull()
    android.view.View child, @org.jetbrains.annotations.NotNull()
    android.view.View target, int nestedScrollAxes) {
        return false;
    }
    
    @java.lang.Override()
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull()
    android.view.View child) {
    }
    
    public NestedRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public NestedRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public NestedRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}
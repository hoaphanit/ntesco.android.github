package com.vn.ntesco.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u0006\u0010+\u001a\u00020)R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006,"}, d2 = {"Lcom/vn/ntesco/views/ViewPagerAutoScroll;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "DELAY", "", "getDELAY", "()J", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "handlerSwipe", "Landroid/os/Handler;", "getHandlerSwipe", "()Landroid/os/Handler;", "setHandlerSwipe", "(Landroid/os/Handler;)V", "isDragging", "", "()Z", "setDragging", "(Z)V", "runnable", "Ljava/lang/Runnable;", "getRunnable$app_debug", "()Ljava/lang/Runnable;", "setRunnable$app_debug", "(Ljava/lang/Runnable;)V", "swipeTimer", "Ljava/util/Timer;", "getSwipeTimer", "()Ljava/util/Timer;", "setSwipeTimer", "(Ljava/util/Timer;)V", "init", "", "startAutoScroll", "stopAutoScroll", "app_debug"})
public final class ViewPagerAutoScroll extends androidx.viewpager.widget.ViewPager {
    private boolean isDragging;
    private int currentPage;
    private final long DELAY = 3000L;
    @org.jetbrains.annotations.Nullable()
    private android.os.Handler handlerSwipe;
    @org.jetbrains.annotations.Nullable()
    private java.util.Timer swipeTimer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Runnable runnable;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isDragging() {
        return false;
    }
    
    public final void setDragging(boolean p0) {
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    public final long getDELAY() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.Handler getHandlerSwipe() {
        return null;
    }
    
    public final void setHandlerSwipe(@org.jetbrains.annotations.Nullable()
    android.os.Handler p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Timer getSwipeTimer() {
        return null;
    }
    
    public final void setSwipeTimer(@org.jetbrains.annotations.Nullable()
    java.util.Timer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Runnable getRunnable$app_debug() {
        return null;
    }
    
    public final void setRunnable$app_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Runnable p0) {
    }
    
    public final void init() {
    }
    
    public final void startAutoScroll() {
    }
    
    public final void stopAutoScroll() {
    }
    
    public ViewPagerAutoScroll(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
}
package com.vn.ntesco.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\u0006J\u000e\u0010)\u001a\u00020\'2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010*\u001a\u00020\'J\u0006\u0010+\u001a\u00020\'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f\u00a8\u0006-"}, d2 = {"Lcom/vn/ntesco/views/NTescoSwitchButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "clickListener", "Lcom/vn/ntesco/views/NTescoSwitchButton$ClickListener;", "getClickListener$app_debug", "()Lcom/vn/ntesco/views/NTescoSwitchButton$ClickListener;", "setClickListener$app_debug", "(Lcom/vn/ntesco/views/NTescoSwitchButton$ClickListener;)V", "isDisable", "", "()Z", "setDisable", "(Z)V", "isLeft", "setLeft", "tvCenter", "Landroid/widget/TextView;", "getTvCenter", "()Landroid/widget/TextView;", "setTvCenter", "(Landroid/widget/TextView;)V", "tvLeft", "getTvLeft", "setTvLeft", "tvRight", "getTvRight", "setTvRight", "init", "", "attr", "setClickListener", "setLeftSelect", "setRigtSelect", "ClickListener", "app_debug"})
public final class NTescoSwitchButton extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.views.NTescoSwitchButton.ClickListener clickListener;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvLeft;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvRight;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvCenter;
    private boolean isDisable;
    private boolean isLeft;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.views.NTescoSwitchButton.ClickListener getClickListener$app_debug() {
        return null;
    }
    
    public final void setClickListener$app_debug(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.views.NTescoSwitchButton.ClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvLeft() {
        return null;
    }
    
    public final void setTvLeft(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvRight() {
        return null;
    }
    
    public final void setTvRight(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvCenter() {
        return null;
    }
    
    public final void setTvCenter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    public final boolean isDisable() {
        return false;
    }
    
    public final void setDisable(boolean p0) {
    }
    
    public final boolean isLeft() {
        return false;
    }
    
    public final void setLeft(boolean p0) {
    }
    
    public final void setClickListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.views.NTescoSwitchButton.ClickListener clickListener) {
    }
    
    public final void init(@org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attr) {
    }
    
    public final void setLeftSelect() {
    }
    
    public final void setRigtSelect() {
    }
    
    public NTescoSwitchButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public NTescoSwitchButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public NTescoSwitchButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public NTescoSwitchButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vn/ntesco/views/NTescoSwitchButton$ClickListener;", "", "onCenterClick", "", "onLeftClick", "onRightClick", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onRightClick();
        
        public abstract void onLeftClick();
        
        public abstract void onCenterClick();
    }
}
package com.vn.ntesco.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u001e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010\u00a8\u0006*"}, d2 = {"Lcom/vn/ntesco/views/ItemButton;", "", "context", "Landroid/content/Context;", "text", "", "textSize", "", "imageRestId", "color", "itemButtonListener", "Lcom/vn/ntesco/listener/ItemButtonListener;", "(Landroid/content/Context;Ljava/lang/String;IIILcom/vn/ntesco/listener/ItemButtonListener;)V", "clickRegion", "Landroid/graphics/RectF;", "getColor", "()I", "getContext", "()Landroid/content/Context;", "getImageRestId", "getItemButtonListener", "()Lcom/vn/ntesco/listener/ItemButtonListener;", "position", "resource", "Landroid/content/res/Resources;", "getText", "()Ljava/lang/String;", "getTextSize", "drawableToBitmap", "Landroid/graphics/Bitmap;", "d", "Landroid/graphics/drawable/Drawable;", "onClick", "", "x", "", "y", "onDraw", "", "c", "Landroid/graphics/Canvas;", "rect", "app_debug"})
public final class ItemButton {
    private int position;
    private android.graphics.RectF clickRegion;
    private android.content.res.Resources resource;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String text = null;
    private final int textSize = 0;
    private final int imageRestId = 0;
    private final int color = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.vn.ntesco.listener.ItemButtonListener itemButtonListener = null;
    
    public final boolean onClick(float x, float y) {
        return false;
    }
    
    public final void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.graphics.RectF rect, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap drawableToBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable d) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getText() {
        return null;
    }
    
    public final int getTextSize() {
        return 0;
    }
    
    public final int getImageRestId() {
        return 0;
    }
    
    public final int getColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.listener.ItemButtonListener getItemButtonListener() {
        return null;
    }
    
    public ItemButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int textSize, int imageRestId, int color, @org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.ItemButtonListener itemButtonListener) {
        super();
    }
}
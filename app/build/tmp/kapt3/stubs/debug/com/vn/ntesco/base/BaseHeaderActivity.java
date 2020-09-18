package com.vn.ntesco.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020 H\u0014J\b\u0010%\u001a\u00020\u001dH&J\u0012\u0010&\u001a\u00020 2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020*H&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018\u00a8\u0006+"}, d2 = {"Lcom/vn/ntesco/base/BaseHeaderActivity;", "Lcom/vn/ntesco/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "headerLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getHeaderLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setHeaderLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "ivBack", "Landroid/widget/ImageView;", "getIvBack", "()Landroid/widget/ImageView;", "setIvBack", "(Landroid/widget/ImageView;)V", "ivLanguage", "getIvLanguage", "setIvLanguage", "titleHeader", "Landroid/widget/TextView;", "getTitleHeader", "()Landroid/widget/TextView;", "setTitleHeader", "(Landroid/widget/TextView;)V", "tvAdd", "getTvAdd", "setTvAdd", "getLayoutContent", "", "getLayoutResource", "onBackPressed", "", "onClick", "v", "Landroid/view/View;", "onResume", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "", "app_debug"})
public abstract class BaseHeaderActivity extends com.vn.ntesco.base.BaseActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView ivBack;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView ivLanguage;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView titleHeader;
    @org.jetbrains.annotations.NotNull()
    public androidx.constraintlayout.widget.ConstraintLayout headerLayout;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvAdd;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String setTitle();
    
    public abstract int getLayoutContent();
    
    public abstract int setBackgroundHeader();
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIvBack() {
        return null;
    }
    
    public final void setIvBack(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIvLanguage() {
        return null;
    }
    
    public final void setIvLanguage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitleHeader() {
        return null;
    }
    
    public final void setTitleHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintLayout getHeaderLayout() {
        return null;
    }
    
    public final void setHeaderLayout(@org.jetbrains.annotations.NotNull()
    androidx.constraintlayout.widget.ConstraintLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvAdd() {
        return null;
    }
    
    public final void setTvAdd(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public BaseHeaderActivity() {
        super();
    }
}
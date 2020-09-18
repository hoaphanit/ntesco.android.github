package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006H\u0002J\b\u0010.\u001a\u00020\u0006H\u0016J\u0010\u0010/\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010\u0018J\b\u00101\u001a\u00020,H\u0016J\u0012\u00102\u001a\u00020,2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u001a\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u00010\u00112\u0006\u00107\u001a\u00020\u0006H\u0016J\u0012\u00108\u001a\u00020,2\b\u00109\u001a\u0004\u0018\u00010:H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006;"}, d2 = {"Lcom/vn/ntesco/activity/DetailPostActivity;", "Lcom/vn/ntesco/base/BaseActivity;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "Landroid/view/View$OnClickListener;", "()V", "PERCENTAGE_TO_SHOW_BANNER", "", "bannerPost", "Landroid/widget/ImageView;", "getBannerPost", "()Landroid/widget/ImageView;", "setBannerPost", "(Landroid/widget/ImageView;)V", "ivBack", "getIvBack", "setIvBack", "mAppbar", "Lcom/google/android/material/appbar/AppBarLayout;", "getMAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "setMAppbar", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "mMaxScrollSize", "mPost", "Lcom/vn/ntesco/model/Post;", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "getMToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setMToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "main_collapsing", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "getMain_collapsing", "()Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "setMain_collapsing", "(Lcom/google/android/material/appbar/CollapsingToolbarLayout;)V", "typePost", "", "getTypePost", "()Ljava/lang/String;", "setTypePost", "(Ljava/lang/String;)V", "getDetailPost", "", "postId", "getLayoutResource", "initData", "post", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onOffsetChanged", "appBarLayout", "i", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DetailPostActivity extends com.vn.ntesco.base.BaseActivity implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.appbar.CollapsingToolbarLayout main_collapsing;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.appbar.AppBarLayout mAppbar;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.Toolbar mToolbar;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView ivBack;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView bannerPost;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String typePost;
    private com.vn.ntesco.model.Post mPost;
    private final int PERCENTAGE_TO_SHOW_BANNER = 40;
    private int mMaxScrollSize;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.appbar.CollapsingToolbarLayout getMain_collapsing() {
        return null;
    }
    
    public final void setMain_collapsing(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.CollapsingToolbarLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.appbar.AppBarLayout getMAppbar() {
        return null;
    }
    
    public final void setMAppbar(@org.jetbrains.annotations.NotNull()
    com.google.android.material.appbar.AppBarLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getMToolbar() {
        return null;
    }
    
    public final void setMToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIvBack() {
        return null;
    }
    
    public final void setIvBack(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getBannerPost() {
        return null;
    }
    
    public final void setBannerPost(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTypePost() {
        return null;
    }
    
    public final void setTypePost(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    public void onOffsetChanged(@org.jetbrains.annotations.Nullable()
    com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void initData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Post post) {
    }
    
    private final void getDetailPost(int postId) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public DetailPostActivity() {
        super();
    }
}
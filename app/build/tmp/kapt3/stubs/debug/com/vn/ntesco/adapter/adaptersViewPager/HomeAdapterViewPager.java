package com.vn.ntesco.adapter.adaptersViewPager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0016\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/vn/ntesco/adapter/adaptersViewPager/HomeAdapterViewPager;", "Landroidx/viewpager/widget/PagerAdapter;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bannerList", "", "Lcom/vn/ntesco/model/Banner;", "getBannerList", "()Ljava/util/List;", "setBannerList", "(Ljava/util/List;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "view", "isViewFromObject", "", "Landroid/view/View;", "app_debug"})
public final class HomeAdapterViewPager extends androidx.viewpager.widget.PagerAdapter {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.vn.ntesco.model.Banner> bannerList;
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vn.ntesco.model.Banner> getBannerList() {
        return null;
    }
    
    public final void setBannerList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.model.Banner> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup view, int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.Object object) {
        return false;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object object) {
    }
    
    public HomeAdapterViewPager(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}
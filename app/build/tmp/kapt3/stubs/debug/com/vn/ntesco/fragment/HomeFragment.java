package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020#H\u0016J$\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lcom/vn/ntesco/fragment/HomeFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "categoryAdapter", "Lcom/vn/ntesco/adapter/CategoryAdapter;", "getCategoryAdapter", "()Lcom/vn/ntesco/adapter/CategoryAdapter;", "setCategoryAdapter", "(Lcom/vn/ntesco/adapter/CategoryAdapter;)V", "circleIndicator", "Lcom/viewpagerindicator/CirclePageIndicator;", "getCircleIndicator", "()Lcom/viewpagerindicator/CirclePageIndicator;", "setCircleIndicator", "(Lcom/viewpagerindicator/CirclePageIndicator;)V", "homeAdapter", "Lcom/vn/ntesco/adapter/adaptersViewPager/HomeAdapterViewPager;", "getHomeAdapter", "()Lcom/vn/ntesco/adapter/adaptersViewPager/HomeAdapterViewPager;", "setHomeAdapter", "(Lcom/vn/ntesco/adapter/adaptersViewPager/HomeAdapterViewPager;)V", "homeViewPager", "Lcom/vn/ntesco/views/ViewPagerAutoScroll;", "getHomeViewPager", "()Lcom/vn/ntesco/views/ViewPagerAutoScroll;", "setHomeViewPager", "(Lcom/vn/ntesco/views/ViewPagerAutoScroll;)V", "rvCategoryHome", "Landroidx/recyclerview/widget/RecyclerView;", "getRvCategoryHome", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvCategoryHome", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getBanner", "", "getLayoutResource", "", "onClick", "v", "Landroid/view/View;", "onDestroy", "onSetBodyView", "view", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class HomeFragment extends com.vn.ntesco.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.adapter.adaptersViewPager.HomeAdapterViewPager homeAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.views.ViewPagerAutoScroll homeViewPager;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.CategoryAdapter categoryAdapter;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView rvCategoryHome;
    @org.jetbrains.annotations.NotNull()
    public com.viewpagerindicator.CirclePageIndicator circleIndicator;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.adapter.adaptersViewPager.HomeAdapterViewPager getHomeAdapter() {
        return null;
    }
    
    public final void setHomeAdapter(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.adapter.adaptersViewPager.HomeAdapterViewPager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.views.ViewPagerAutoScroll getHomeViewPager() {
        return null;
    }
    
    public final void setHomeViewPager(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.views.ViewPagerAutoScroll p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.CategoryAdapter getCategoryAdapter() {
        return null;
    }
    
    public final void setCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.CategoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvCategoryHome() {
        return null;
    }
    
    public final void setRvCategoryHome(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.viewpagerindicator.CirclePageIndicator getCircleIndicator() {
        return null;
    }
    
    public final void setCircleIndicator(@org.jetbrains.annotations.NotNull()
    com.viewpagerindicator.CirclePageIndicator p0) {
    }
    
    @java.lang.Override()
    public void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void getBanner() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public HomeFragment() {
        super();
    }
}
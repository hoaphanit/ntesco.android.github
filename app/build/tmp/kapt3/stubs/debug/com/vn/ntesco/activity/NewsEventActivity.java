package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/vn/ntesco/activity/NewsEventActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "()V", "endlessHotNewOnScrollListener", "Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "endlessPopularOnScrollListener", "hotNewsAdapter", "Lcom/vn/ntesco/adapter/HotNewsAdapter;", "hotNewsLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "popularNewLayoutManager", "popularNewsAdapter", "Lcom/vn/ntesco/adapter/PopularNewsAdapter;", "typePost", "", "getHotNews", "", "page", "", "getLayoutContent", "getPopularNews", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "app_debug"})
public final class NewsEventActivity extends com.vn.ntesco.base.BaseHeaderActivity {
    private com.vn.ntesco.adapter.HotNewsAdapter hotNewsAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager hotNewsLayoutManager;
    private androidx.recyclerview.widget.LinearLayoutManager popularNewLayoutManager;
    private com.vn.ntesco.adapter.PopularNewsAdapter popularNewsAdapter;
    private java.lang.String typePost;
    private com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessHotNewOnScrollListener;
    private com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessPopularOnScrollListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String setTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutContent() {
        return 0;
    }
    
    @java.lang.Override()
    public int setBackgroundHeader() {
        return 0;
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getHotNews(int page) {
    }
    
    private final void getPopularNews(int page) {
    }
    
    public NewsEventActivity() {
        super();
    }
}
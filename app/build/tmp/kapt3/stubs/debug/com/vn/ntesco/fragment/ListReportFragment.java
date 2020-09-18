package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020 H\u0016J$\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/vn/ntesco/fragment/ListReportFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "endlessRecyclerOnScrollListener", "Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "getEndlessRecyclerOnScrollListener", "()Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "setEndlessRecyclerOnScrollListener", "(Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;)V", "listReportAdapter", "Lcom/vn/ntesco/adapter/ListReportAdapter;", "listReportReceiver", "Landroid/content/BroadcastReceiver;", "getListReportReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setListReportReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "rvListReport", "Landroidx/recyclerview/widget/RecyclerView;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "tvNodata", "Landroid/widget/TextView;", "type", "", "getType", "()I", "setType", "(I)V", "getLayoutResource", "getReports", "", "page", "onDestroy", "onRefresh", "onSetBodyView", "view", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ListReportFragment extends com.vn.ntesco.base.BaseFragment implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.vn.ntesco.adapter.ListReportAdapter listReportAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private int type;
    private androidx.recyclerview.widget.RecyclerView rvListReport;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    private android.widget.TextView tvNodata;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver listReportReceiver;
    public static final com.vn.ntesco.fragment.ListReportFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.listener.EndlessRecyclerOnScrollListener getEndlessRecyclerOnScrollListener() {
        return null;
    }
    
    public final void setEndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.EndlessRecyclerOnScrollListener p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getListReportReceiver$app_debug() {
        return null;
    }
    
    public final void setListReportReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    private final void getReports(int page) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public ListReportFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/fragment/ListReportFragment$Companion;", "", "()V", "newInstance", "Lcom/vn/ntesco/fragment/ListReportFragment;", "type", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.fragment.ListReportFragment newInstance(int type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
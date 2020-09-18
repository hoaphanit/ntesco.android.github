package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0002J\b\u0010\'\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020%H\u0016J$\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\u0019\u00a8\u00061"}, d2 = {"Lcom/vn/ntesco/fragment/ListWorkFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "REQUEST_DETAIL_WORK", "", "getREQUEST_DETAIL_WORK", "()I", "endlessRecyclerOnScrollListener", "Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "getEndlessRecyclerOnScrollListener", "()Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "setEndlessRecyclerOnScrollListener", "(Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;)V", "listWorkAdapter", "Lcom/vn/ntesco/adapter/ListReportAdapter;", "listWorkReceiver", "Landroid/content/BroadcastReceiver;", "getListWorkReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setListWorkReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "positionSelected", "getPositionSelected", "setPositionSelected", "(I)V", "rvListWord", "Landroidx/recyclerview/widget/RecyclerView;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "tvNodata", "Landroid/widget/TextView;", "type", "getType", "setType", "getLayoutResource", "getListWorks", "", "page", "onDestroy", "onRefresh", "onSetBodyView", "view", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ListWorkFragment extends com.vn.ntesco.base.BaseFragment implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.vn.ntesco.adapter.ListReportAdapter listWorkAdapter;
    private androidx.recyclerview.widget.RecyclerView rvListWord;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    private android.widget.TextView tvNodata;
    private int type;
    private final int REQUEST_DETAIL_WORK = 123;
    private int positionSelected;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver listWorkReceiver;
    public static final com.vn.ntesco.fragment.ListWorkFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final int getREQUEST_DETAIL_WORK() {
        return 0;
    }
    
    public final int getPositionSelected() {
        return 0;
    }
    
    public final void setPositionSelected(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.listener.EndlessRecyclerOnScrollListener getEndlessRecyclerOnScrollListener() {
        return null;
    }
    
    public final void setEndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.EndlessRecyclerOnScrollListener p0) {
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
    
    private final void getListWorks(int page) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getListWorkReceiver$app_debug() {
        return null;
    }
    
    public final void setListWorkReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public ListWorkFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/fragment/ListWorkFragment$Companion;", "", "()V", "newInstance", "Lcom/vn/ntesco/fragment/ListWorkFragment;", "type", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.fragment.ListWorkFragment newInstance(int type) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
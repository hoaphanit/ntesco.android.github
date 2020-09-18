package com.vn.ntesco.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\tH&J \u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0016J\u0006\u0010-\u001a\u00020&R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012\u00a8\u0006/"}, d2 = {"Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "reverseScroll", "", "(Landroidx/recyclerview/widget/LinearLayoutManager;Z)V", "pager", "", "(Landroidx/recyclerview/widget/LinearLayoutManager;I)V", "Landroidx/recyclerview/widget/GridLayoutManager;", "(Landroidx/recyclerview/widget/GridLayoutManager;I)V", "currentPage", "firstVisibleItem", "getFirstVisibleItem$app_debug", "()I", "setFirstVisibleItem$app_debug", "(I)V", "isUseGridLayoutManager", "isUseLinearLayoutManager", "lastVisibleItem", "getLastVisibleItem$app_debug", "setLastVisibleItem$app_debug", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "loading", "previousTotal", "totalItemCount", "getTotalItemCount$app_debug", "setTotalItemCount$app_debug", "visibleItemCount", "getVisibleItemCount$app_debug", "setVisibleItemCount$app_debug", "onLoadMore", "", "current_page", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "resetCurrentPage", "Companion", "app_debug"})
public abstract class EndlessRecyclerOnScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private int previousTotal;
    private boolean loading;
    private int firstVisibleItem;
    private int lastVisibleItem;
    private int visibleItemCount;
    private int totalItemCount;
    private int currentPage;
    private boolean reverseScroll;
    private boolean isUseLinearLayoutManager;
    private boolean isUseGridLayoutManager;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView.LayoutManager linearLayoutManager;
    private static java.lang.String TAG;
    public static final com.vn.ntesco.listener.EndlessRecyclerOnScrollListener.Companion Companion = null;
    
    public final int getFirstVisibleItem$app_debug() {
        return 0;
    }
    
    public final void setFirstVisibleItem$app_debug(int p0) {
    }
    
    public final int getLastVisibleItem$app_debug() {
        return 0;
    }
    
    public final void setLastVisibleItem$app_debug(int p0) {
    }
    
    public final int getVisibleItemCount$app_debug() {
        return 0;
    }
    
    public final void setVisibleItemCount$app_debug(int p0) {
    }
    
    public final int getTotalItemCount$app_debug() {
        return 0;
    }
    
    public final void setTotalItemCount$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
    
    public final void resetCurrentPage() {
    }
    
    public abstract void onLoadMore(int current_page);
    
    public EndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        super();
    }
    
    public EndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, boolean reverseScroll) {
        super();
    }
    
    public EndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int pager) {
        super();
    }
    
    public EndlessRecyclerOnScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager linearLayoutManager, int pager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        public final java.lang.String getTAG() {
            return null;
        }
        
        public final void setTAG(java.lang.String p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
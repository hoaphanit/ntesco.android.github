package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0002J\"\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\"H\u0014J\u0012\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010(H\u0014J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\u0012\u00101\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\u001f\u00a8\u00067"}, d2 = {"Lcom/vn/ntesco/activity/ReportActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "CREATE_REPORT_REQUEST", "", "getCREATE_REPORT_REQUEST", "()I", "endlessRecyclerOnScrollListener", "Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "getEndlessRecyclerOnScrollListener", "()Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "setEndlessRecyclerOnScrollListener", "(Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;)V", "listReportAdapter", "Lcom/vn/ntesco/adapter/ListReportAdapter;", "listReportReceiver", "Landroid/content/BroadcastReceiver;", "getListReportReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setListReportReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "rvListReport", "Landroidx/recyclerview/widget/RecyclerView;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "tvNodata", "Landroid/widget/TextView;", "type", "getType", "setType", "(I)V", "getLayoutContent", "getReports", "", "page", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onDestroy", "onNewIntent", "intent", "onRefresh", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "", "startDetail", "app_debug"})
public final class ReportActivity extends com.vn.ntesco.base.BaseHeaderActivity implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.vn.ntesco.adapter.ListReportAdapter listReportAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private int type;
    private androidx.recyclerview.widget.RecyclerView rvListReport;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    private android.widget.TextView tvNodata;
    private final int CREATE_REPORT_REQUEST = 123;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver listReportReceiver;
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
    
    public final int getCREATE_REPORT_REQUEST() {
        return 0;
    }
    
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
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void startDetail(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
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
    protected void onDestroy() {
    }
    
    public ReportActivity() {
        super();
    }
}
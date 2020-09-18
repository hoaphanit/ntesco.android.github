package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\u001a\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%J\b\u0010\'\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\"H\u0016J$\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/vn/ntesco/fragment/NotificationFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "endlessRecyclerOnScrollListener", "Lcom/vn/ntesco/listener/EndlessRecyclerOnScrollListener;", "from_home", "", "getFrom_home", "()Z", "setFrom_home", "(Z)V", "isFromNotify", "setFromNotify", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "loginBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "getLoginBroadcastReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setLoginBroadcastReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "notificationAdapter", "Lcom/vn/ntesco/adapter/NotificationAdapter;", "notifyReceiver", "getNotifyReceiver$app_debug", "setNotifyReceiver$app_debug", "rvNotify", "Landroidx/recyclerview/widget/RecyclerView;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "tvNodata", "Landroid/widget/TextView;", "deleteAllNotify", "", "deleteNotification", "notifyId", "", "position", "getLayoutResource", "getNotification", "page", "onDestroy", "onRefresh", "onSetBodyView", "view", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendBroadcastNotify", "Companion", "app_debug"})
public final class NotificationFragment extends com.vn.ntesco.base.BaseFragment implements androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener {
    private com.vn.ntesco.adapter.NotificationAdapter notificationAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private androidx.recyclerview.widget.RecyclerView rvNotify;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    private com.vn.ntesco.listener.EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private android.widget.TextView tvNodata;
    private boolean from_home;
    private boolean isFromNotify;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver loginBroadcastReceiver;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver notifyReceiver;
    public static final com.vn.ntesco.fragment.NotificationFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getFrom_home() {
        return false;
    }
    
    public final void setFrom_home(boolean p0) {
    }
    
    public final boolean isFromNotify() {
        return false;
    }
    
    public final void setFromNotify(boolean p0) {
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
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    private final void getNotification(int page) {
    }
    
    public final void deleteAllNotify() {
    }
    
    public final void deleteNotification(int notifyId, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getLoginBroadcastReceiver$app_debug() {
        return null;
    }
    
    public final void setLoginBroadcastReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getNotifyReceiver$app_debug() {
        return null;
    }
    
    public final void setNotifyReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void sendBroadcastNotify() {
    }
    
    public NotificationFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/fragment/NotificationFragment$Companion;", "", "()V", "newInstance", "Lcom/vn/ntesco/fragment/NotificationFragment;", "fromHome", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.fragment.NotificationFragment newInstance(boolean fromHome) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
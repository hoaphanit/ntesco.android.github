package com.vn.ntesco.activity;

import java.lang.System;

@com.airbnb.deeplinkdispatch.DeepLink(value = {"ntesco://ntesco.vn/deepLink/"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001NB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020%H\u0016J\u0006\u0010.\u001a\u00020+J\b\u0010/\u001a\u00020+H\u0002J\u0006\u00100\u001a\u00020+J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0014J\u0012\u00103\u001a\u00020+2\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020%H\u0016J \u00108\u001a\u00020+2\u0006\u00107\u001a\u00020%2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%H\u0016J\u0010\u0010<\u001a\u00020+2\u0006\u00107\u001a\u00020%H\u0016J-\u0010=\u001a\u00020+2\u0006\u0010>\u001a\u00020%2\u000e\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020A0@2\u0006\u0010B\u001a\u00020#H\u0016\u00a2\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020+H\u0014J\b\u0010E\u001a\u00020+H\u0014J\u0012\u0010F\u001a\u00020+2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u000e\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020%J\u000e\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020MR\u001e\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006O"}, d2 = {"Lcom/vn/ntesco/activity/MainActivity;", "Lcom/vn/ntesco/base/BaseActivity;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "()V", "locationReceiver", "Lcom/vn/ntesco/activity/MainActivity$LocationReceiver;", "getLocationReceiver", "()Lcom/vn/ntesco/activity/MainActivity$LocationReceiver;", "setLocationReceiver", "(Lcom/vn/ntesco/activity/MainActivity$LocationReceiver;)V", "loginReceiver", "Landroid/content/BroadcastReceiver;", "getLoginReceiver", "()Landroid/content/BroadcastReceiver;", "mBound", "", "getMBound", "()Z", "setMBound", "(Z)V", "mMainAdapter", "Lcom/vn/ntesco/adapter/adaptersViewPager/MainAdapterViewPager;", "mService", "Lcom/vn/ntesco/utils/LocationUpdatesService;", "getMService", "()Lcom/vn/ntesco/utils/LocationUpdatesService;", "setMService", "(Lcom/vn/ntesco/utils/LocationUpdatesService;)V", "mServiceConnection", "Landroid/content/ServiceConnection;", "notifyReceiver", "getNotifyReceiver$app_debug", "setNotifyReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "tabIcons", "", "total", "", "getTotal", "()I", "setTotal", "(I)V", "checkVersion", "", "disableTab", "getLayoutResource", "getLocation", "getTotalNotifyUnread", "hideNumberUnread", "inintTabLayout", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "onPageScrollStateChanged", "p0", "onPageScrolled", "p1", "", "p2", "onPageSelected", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "(I[Ljava/lang/String;[I)V", "onResume", "onStart", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "showNumberUnread", "number", "updateLocation", "location", "Landroid/location/Location;", "LocationReceiver", "app_debug"})
public final class MainActivity extends com.vn.ntesco.base.BaseActivity implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private com.vn.ntesco.adapter.adaptersViewPager.MainAdapterViewPager mMainAdapter;
    private final int[] tabIcons = null;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.utils.LocationUpdatesService mService;
    private boolean mBound;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.activity.MainActivity.LocationReceiver locationReceiver;
    private int total;
    private final android.content.ServiceConnection mServiceConnection = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.BroadcastReceiver loginReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver notifyReceiver;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onPageScrollStateChanged(int p0) {
    }
    
    @java.lang.Override()
    public void onPageScrolled(int p0, float p1, int p2) {
    }
    
    @java.lang.Override()
    public void onPageSelected(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.utils.LocationUpdatesService getMService() {
        return null;
    }
    
    public final void setMService(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.LocationUpdatesService p0) {
    }
    
    public final boolean getMBound() {
        return false;
    }
    
    public final void setMBound(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.activity.MainActivity.LocationReceiver getLocationReceiver() {
        return null;
    }
    
    public final void setLocationReceiver(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.activity.MainActivity.LocationReceiver p0) {
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final void setTotal(int p0) {
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getLoginReceiver() {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void getLocation() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    private final void disableTab() {
    }
    
    private final void inintTabLayout() {
    }
    
    public final void updateLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void getTotalNotifyUnread() {
    }
    
    private final void checkVersion() {
    }
    
    public final void showNumberUnread(int number) {
    }
    
    public final void hideNumberUnread() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getNotifyReceiver$app_debug() {
        return null;
    }
    
    public final void setNotifyReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/activity/MainActivity$LocationReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/vn/ntesco/activity/MainActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class LocationReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public LocationReceiver() {
            super();
        }
    }
}
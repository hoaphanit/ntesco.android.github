package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u0003678B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010,\u001a\u00020-2\u0006\u0010\"\u001a\u00020#2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0006\u00101\u001a\u00020\u001eJ\u0006\u00102\u001a\u00020\u001eJ\u000e\u00103\u001a\u00020\b2\u0006\u00104\u001a\u000205R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00069"}, d2 = {"Lcom/vn/ntesco/utils/LocationUpdatesService;", "Landroid/app/Service;", "()V", "getLocationCallback", "Lcom/vn/ntesco/utils/LocationUpdatesService$GetLocationCallback;", "mBinder", "Lcom/vn/ntesco/utils/LocationUpdatesService$LocalBinder;", "mChangingConfiguration", "", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "mLocation", "Landroid/location/Location;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getMLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "setMLocationRequest", "(Lcom/google/android/gms/location/LocationRequest;)V", "mNotificationManager", "Landroid/app/NotificationManager;", "mServiceHandler", "Landroid/os/Handler;", "notification", "Landroid/app/Notification;", "getNotification", "()Landroid/app/Notification;", "createLocationRequest", "", "getLastLocation", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onDestroy", "onNewLocation", "location", "onRebind", "onStartCommand", "", "flags", "startId", "onUnbind", "removeLocationUpdates", "requestLocationUpdates", "serviceIsRunningInForeground", "context", "Landroid/content/Context;", "Companion", "GetLocationCallback", "LocalBinder", "app_debug"})
public final class LocationUpdatesService extends android.app.Service {
    private final com.vn.ntesco.utils.LocationUpdatesService.LocalBinder mBinder = null;
    
    /**
     * * Used to check whether the bound activity has really gone away and not unbound as part of an
     *     * orientation change. We create a foreground service notification only if the former takes
     *     * place.
     */
    private boolean mChangingConfiguration;
    private android.app.NotificationManager mNotificationManager;
    
    /**
     * * Contains parameters used by [com.google.android.gms.location.FusedLocationProviderApi].
     */
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    
    /**
     * * Provides access to the Fused Location Provider API.
     */
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    
    /**
     * * Callback for changes in location.
     */
    private com.google.android.gms.location.LocationCallback mLocationCallback;
    private android.os.Handler mServiceHandler;
    
    /**
     * * The current location.
     */
    private android.location.Location mLocation;
    private com.vn.ntesco.utils.LocationUpdatesService.GetLocationCallback getLocationCallback;
    private static final java.lang.String PACKAGE_NAME = "com.google.android.gms.location.sample.locationupdatesforegroundservice";
    private static final java.lang.String TAG = null;
    
    /**
     * * The name of the channel for notificationsList.
     */
    private static final java.lang.String CHANNEL_ID = "channel_01";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ACTION_BROADCAST = "com.google.android.gms.location.sample.locationupdatesforegroundservice.broadcast";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_LOCATION = "com.google.android.gms.location.sample.locationupdatesforegroundservice.location";
    private static final java.lang.String EXTRA_STARTED_FROM_NOTIFICATION = "com.google.android.gms.location.sample.locationupdatesforegroundservice.started_from_notification";
    
    /**
     * * The desired interval for location updates. Inexact. Updates may be more or less frequent.
     */
    private static final long UPDATE_INTERVAL_IN_MILLISECONDS = 10000L;
    
    /**
     * * The fastest rate for active location updates. Updates will never be more frequent
     *         * than this value.
     */
    private static final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 5000L;
    
    /**
     * * The identifier for the notification displayed for the foreground service.
     */
    private static final int NOTIFICATION_ID = 12345678;
    public static final com.vn.ntesco.utils.LocationUpdatesService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.LocationRequest getMLocationRequest() {
        return null;
    }
    
    public final void setMLocationRequest(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    private final android.app.Notification getNotification() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onRebind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * * Makes a request for location updates. Note that in this sample we merely com.vn.ntesco.utils.WriteLog the
     *     * [SecurityException].
     */
    public final void requestLocationUpdates() {
    }
    
    /**
     * * Removes location updates. Note that in this sample we merely com.vn.ntesco.utils.WriteLog the
     *     * [SecurityException].
     */
    public final void removeLocationUpdates() {
    }
    
    private final void getLastLocation() {
    }
    
    private final void onNewLocation(android.location.Location location) {
    }
    
    /**
     * * Sets the location request parameters.
     */
    private final void createLocationRequest() {
    }
    
    /**
     * * Returns true if this is a foreground service.
     *     *
     *     * @param context The [Context].
     */
    public final boolean serviceIsRunningInForeground(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public LocationUpdatesService() {
        super();
    }
    
    /**
     * * Class used for the client Binder.  Since this service runs in the same process as its
     *     * clients, we don't need to deal with IPC.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/utils/LocationUpdatesService$LocalBinder;", "Landroid/os/Binder;", "(Lcom/vn/ntesco/utils/LocationUpdatesService;)V", "service", "Lcom/vn/ntesco/utils/LocationUpdatesService;", "getService$app_debug", "()Lcom/vn/ntesco/utils/LocationUpdatesService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.LocationUpdatesService getService$app_debug() {
            return null;
        }
        
        public LocalBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/vn/ntesco/utils/LocationUpdatesService$GetLocationCallback;", "", "onGetLocationFaild", "", "app_debug"})
    public static abstract interface GetLocationCallback {
        
        public abstract void onGetLocationFaild();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/vn/ntesco/utils/LocationUpdatesService$Companion;", "", "()V", "ACTION_BROADCAST", "", "getACTION_BROADCAST", "()Ljava/lang/String;", "CHANNEL_ID", "EXTRA_LOCATION", "getEXTRA_LOCATION", "EXTRA_STARTED_FROM_NOTIFICATION", "FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS", "", "NOTIFICATION_ID", "", "PACKAGE_NAME", "TAG", "kotlin.jvm.PlatformType", "UPDATE_INTERVAL_IN_MILLISECONDS", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getACTION_BROADCAST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_LOCATION() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
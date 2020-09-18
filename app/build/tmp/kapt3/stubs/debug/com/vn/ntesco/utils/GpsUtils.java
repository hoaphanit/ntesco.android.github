package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/vn/ntesco/utils/GpsUtils;", "", "context", "Landroid/content/Context;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "(Landroid/content/Context;Lcom/google/android/gms/location/LocationRequest;)V", "locationManager", "Landroid/location/LocationManager;", "mLocationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "mSettingsClient", "Lcom/google/android/gms/location/SettingsClient;", "turnGPSOn", "", "onGpsListener", "Lcom/vn/ntesco/utils/GpsUtils$onGpsListener;", "app_debug"})
public final class GpsUtils {
    private android.content.Context context;
    private com.google.android.gms.location.SettingsClient mSettingsClient;
    private com.google.android.gms.location.LocationSettingsRequest mLocationSettingsRequest;
    private android.location.LocationManager locationManager;
    
    public final void turnGPSOn(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.GpsUtils.onGpsListener onGpsListener) {
    }
    
    public GpsUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.LocationRequest locationRequest) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vn/ntesco/utils/GpsUtils$onGpsListener;", "", "gpsStatus", "", "isGPSEnable", "", "app_debug"})
    public static abstract interface onGpsListener {
        
        public abstract void gpsStatus(boolean isGPSEnable);
    }
}
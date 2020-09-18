package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0015J)\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010\u0015J\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/vn/ntesco/utils/GetLocationDetail;", "", "addressCallBack", "Lcom/vn/ntesco/utils/LocationData$AddressCallBack;", "context", "Landroid/content/Context;", "(Lcom/vn/ntesco/utils/LocationData$AddressCallBack;Landroid/content/Context;)V", "BASE_URL", "", "getAddressCallBack", "()Lcom/vn/ntesco/utils/LocationData$AddressCallBack;", "getContext", "()Landroid/content/Context;", "retrofit", "Lretrofit2/Retrofit;", "getAddress", "", "latitude", "", "longitude", "key", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getAddressFromApi", "getRetrofitInstance", "DataService", "app_debug"})
public final class GetLocationDetail {
    private final java.lang.String BASE_URL = "https://maps.googleapis.com/maps/";
    private retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    private final com.vn.ntesco.utils.LocationData.AddressCallBack addressCallBack = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getRetrofitInstance() {
        return null;
    }
    
    public final void getAddress(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    private final void getAddressFromApi(java.lang.Double latitude, java.lang.Double longitude, java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.utils.LocationData.AddressCallBack getAddressCallBack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public GetLocationDetail(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.utils.LocationData.AddressCallBack addressCallBack, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004H\'\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/utils/GetLocationDetail$DataService;", "", "getData", "Lretrofit2/Call;", "", "latLong", "sensor", "", "key", "app_debug"})
    static abstract interface DataService {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "api/geocode/json")
        public abstract retrofit2.Call<java.lang.String> getData(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "latlng")
        java.lang.String latLong, @retrofit2.http.Query(value = "sensor")
        boolean sensor, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "key")
        java.lang.String key);
    }
}
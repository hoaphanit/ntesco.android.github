package com.vn.ntesco.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0006H\u0004\u00a8\u0006\u0013"}, d2 = {"Lcom/vn/ntesco/network/ServiceFactory;", "", "()V", "getHttpInterceptor", "Lokhttp3/Interceptor;", "isMultiPart", "", "getRetrofit", "Lretrofit2/Retrofit;", "endPoint", "", "sendBroadcast", "", "showAlert", "activity", "Lcom/vn/ntesco/base/BaseActivity;", "message", "isFinish", "Companion", "app_debug"})
public final class ServiceFactory {
    @org.jetbrains.annotations.Nullable()
    private static final com.vn.ntesco.network.ServiceFactory serviceFactory = null;
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofitMultiPart;
    public static final com.vn.ntesco.network.ServiceFactory.Companion Companion = null;
    
    private final okhttp3.Interceptor getHttpInterceptor(boolean isMultiPart) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String endPoint, boolean isMultiPart) {
        return null;
    }
    
    protected final void showAlert(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.base.BaseActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String message, boolean isFinish) {
    }
    
    private final void sendBroadcast() {
    }
    
    private ServiceFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\'\u0010\u0019\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006\u00a8\u0006\u001a"}, d2 = {"Lcom/vn/ntesco/network/ServiceFactory$Companion;", "", "()V", "instance", "Lcom/vn/ntesco/network/ServiceFactory;", "getInstance", "()Lcom/vn/ntesco/network/ServiceFactory;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "retrofitMultiPart", "getRetrofitMultiPart", "setRetrofitMultiPart", "serviceFactory", "getServiceFactory", "createRetrofitMultiPartService", "T", "clazz", "Ljava/lang/Class;", "endPoint", "", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "createRetrofitService", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.vn.ntesco.network.ServiceFactory getServiceFactory() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        public final void setRetrofit(@org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetrofitMultiPart() {
            return null;
        }
        
        public final void setRetrofitMultiPart(@org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.network.ServiceFactory getInstance() {
            return null;
        }
        
        public final <T extends java.lang.Object>T createRetrofitService(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
        java.lang.String endPoint) {
            return null;
        }
        
        public final <T extends java.lang.Object>T createRetrofitMultiPartService(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
        java.lang.String endPoint) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
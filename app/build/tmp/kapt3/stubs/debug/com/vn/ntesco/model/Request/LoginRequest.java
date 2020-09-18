package com.vn.ntesco.model.Request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/vn/ntesco/model/Request/LoginRequest;", "Lcom/vn/ntesco/model/Request/NTescoRequestPOST;", "()V", "deviceToken", "", "getDeviceToken", "()Ljava/lang/String;", "setDeviceToken", "(Ljava/lang/String;)V", "device_id", "getDevice_id", "setDevice_id", "device_type", "", "getDevice_type", "()I", "setDevice_type", "(I)V", "password", "getPassword", "setPassword", "userName", "getUserName", "setUserName", "app_debug"})
public final class LoginRequest extends com.vn.ntesco.model.Request.NTescoRequestPOST {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "username")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "password")
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "device_token")
    private java.lang.String deviceToken;
    @com.google.gson.annotations.SerializedName(value = "device_type")
    private int device_type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "device_id")
    private java.lang.String device_id;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getDevice_type() {
        return 0;
    }
    
    public final void setDevice_type(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDevice_id() {
        return null;
    }
    
    public final void setDevice_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public LoginRequest() {
        super();
    }
}
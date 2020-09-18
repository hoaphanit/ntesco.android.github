package com.vn.ntesco.model.Request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0014\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/vn/ntesco/model/Request/CheckListRequest;", "Lcom/vn/ntesco/model/Request/NTescoRequestPOST;", "()V", "attributess", "", "", "getAttributess", "()Ljava/util/List;", "setAttributess", "(Ljava/util/List;)V", "children", "getChildren", "setChildren", "id", "", "getId", "()I", "setId", "(I)V", "statusList", "", "getStatusList", "setStatusList", "app_debug"})
public final class CheckListRequest extends com.vn.ntesco.model.Request.NTescoRequestPOST {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "attributess")
    private java.util.List<java.lang.String> attributess;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "children")
    private java.util.List<? extends java.util.List<java.lang.String>> children;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.util.List<java.util.List<java.lang.String>> statusList;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAttributess() {
        return null;
    }
    
    public final void setAttributess(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.util.List<java.lang.String>> getChildren() {
        return null;
    }
    
    public final void setChildren(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.util.List<java.lang.String>> getStatusList() {
        return null;
    }
    
    public final void setStatusList(@org.jetbrains.annotations.Nullable()
    java.util.List<java.util.List<java.lang.String>> p0) {
    }
    
    public CheckListRequest() {
        super();
    }
}
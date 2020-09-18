package com.vn.ntesco.model.Request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/vn/ntesco/model/Request/AssignRequest;", "Lcom/vn/ntesco/model/Request/NTescoRequestPOST;", "()V", "guarantee", "", "", "getGuarantee", "()Ljava/util/List;", "setGuarantee", "(Ljava/util/List;)V", "handleFormality", "getHandleFormality", "setHandleFormality", "app_debug"})
public final class AssignRequest extends com.vn.ntesco.model.Request.NTescoRequestPOST {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "handle_formality")
    private java.util.List<java.lang.Integer> handleFormality;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "guarantee")
    private java.util.List<java.lang.Integer> guarantee;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getHandleFormality() {
        return null;
    }
    
    public final void setHandleFormality(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Integer> getGuarantee() {
        return null;
    }
    
    public final void setGuarantee(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> p0) {
    }
    
    public AssignRequest() {
        super();
    }
}
package com.vn.ntesco.model.Response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vn/ntesco/model/Response/OfficesResponse;", "Lcom/vn/ntesco/model/Response/NTescoResponse;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/vn/ntesco/model/Office;", "getData", "()Ljava/util/ArrayList;", "app_debug"})
public final class OfficesResponse extends com.vn.ntesco.model.Response.NTescoResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.ArrayList<com.vn.ntesco.model.Office> data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.vn.ntesco.model.Office> getData() {
        return null;
    }
    
    public OfficesResponse() {
        super(null, null);
    }
}
package com.vn.ntesco.model.Response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/model/Response/ProductDetailResponse;", "Lcom/vn/ntesco/model/Response/NTescoResponse;", "()V", "data", "Lcom/vn/ntesco/model/ProductDetail;", "getData", "()Lcom/vn/ntesco/model/ProductDetail;", "setData", "(Lcom/vn/ntesco/model/ProductDetail;)V", "app_debug"})
public final class ProductDetailResponse extends com.vn.ntesco.model.Response.NTescoResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private com.vn.ntesco.model.ProductDetail data;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.ProductDetail getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.ProductDetail p0) {
    }
    
    public ProductDetailResponse() {
        super(null, null);
    }
}
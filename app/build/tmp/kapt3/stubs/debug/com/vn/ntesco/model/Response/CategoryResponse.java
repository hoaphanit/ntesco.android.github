package com.vn.ntesco.model.Response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/vn/ntesco/model/Response/CategoryResponse;", "Lcom/vn/ntesco/model/Response/NTescoResponse;", "()V", "data", "Ljava/util/ArrayList;", "Lcom/vn/ntesco/model/Category;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "app_debug"})
public final class CategoryResponse extends com.vn.ntesco.model.Response.NTescoResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "data")
    private java.util.ArrayList<com.vn.ntesco.model.Category> data;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.vn.ntesco.model.Category> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vn.ntesco.model.Category> p0) {
    }
    
    public CategoryResponse() {
        super(null, null);
    }
}
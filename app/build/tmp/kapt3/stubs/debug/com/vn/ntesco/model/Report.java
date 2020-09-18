package com.vn.ntesco.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bS\u0018\u00002\u00020\u0001B\u00e1\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010%R \u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R \u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\'\"\u0004\b-\u0010)R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\'\"\u0004\b/\u0010)R\"\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b5\u00101\"\u0004\b6\u00103R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\'\"\u0004\b8\u0010)R \u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\'\"\u0004\b:\u0010)R&\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010<\"\u0004\b@\u0010>R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR.\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR2\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010F\"\u0004\bJ\u0010HR2\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR.\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010F\"\u0004\bN\u0010HR\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\bO\u00101\"\u0004\bP\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\bQ\u00101\"\u0004\bR\u00103R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR \u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\'\"\u0004\bX\u0010)R \u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\'\"\u0004\bZ\u0010)R$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\'\"\u0004\b^\u0010)R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010<\"\u0004\b`\u0010>R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010e\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR \u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\'\"\u0004\bg\u0010)R \u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\'\"\u0004\bi\u0010)R \u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\'\"\u0004\bk\u0010)\u00a8\u0006l"}, d2 = {"Lcom/vn/ntesco/model/Report;", "Ljava/io/Serializable;", "id", "", "image", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "customerName", "error", "publishDate", "status", "userName", "lat", "", "lng", "address", "fromDate", "toDate", "rawWaterType", "", "Lcom/vn/ntesco/model/RawWaterType;", "products", "images", "mine", "", "createdAt", "employeeLat", "employeeLng", "handleFormality", "guarantee", "technical", "imageProcessingStatus", "noteProcessingStatus", "imageProcessed", "noteProcessed", "customerComment", "(ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "getCustomerComment", "setCustomerComment", "getCustomerName", "setCustomerName", "getEmployeeLat", "()Ljava/lang/Double;", "setEmployeeLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getEmployeeLng", "setEmployeeLng", "getError", "setError", "getFromDate", "setFromDate", "getGuarantee", "()Ljava/util/List;", "setGuarantee", "(Ljava/util/List;)V", "getHandleFormality", "setHandleFormality", "getId", "()I", "setId", "(I)V", "getImage", "()Ljava/util/ArrayList;", "setImage", "(Ljava/util/ArrayList;)V", "getImageProcessed", "setImageProcessed", "getImageProcessingStatus", "setImageProcessingStatus", "getImages", "setImages", "getLat", "setLat", "getLng", "setLng", "getMine", "()Z", "setMine", "(Z)V", "getNoteProcessed", "setNoteProcessed", "getNoteProcessingStatus", "setNoteProcessingStatus", "getProducts", "setProducts", "getPublishDate", "setPublishDate", "getRawWaterType", "setRawWaterType", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTechnical", "setTechnical", "getToDate", "setToDate", "getUserName", "setUserName", "app_debug"})
public final class Report implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "image")
    private java.util.ArrayList<java.lang.String> image;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customer_name")
    private java.lang.String customerName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "error")
    private java.lang.String error;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "publish_date")
    private java.lang.String publishDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.Integer status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "username")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lat")
    private java.lang.Double lat;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lng")
    private java.lang.Double lng;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "from_date")
    private java.lang.String fromDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "to_date")
    private java.lang.String toDate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "raw_water_type")
    private java.util.List<com.vn.ntesco.model.RawWaterType> rawWaterType;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "product")
    private java.util.List<com.vn.ntesco.model.RawWaterType> products;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "images")
    private java.util.ArrayList<java.lang.String> images;
    @com.google.gson.annotations.SerializedName(value = "mine")
    private boolean mine;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "employee_lat")
    private java.lang.Double employeeLat;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "employee_lng")
    private java.lang.Double employeeLng;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "handle_formality")
    private java.util.List<com.vn.ntesco.model.RawWaterType> handleFormality;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "guarantee")
    private java.util.List<com.vn.ntesco.model.RawWaterType> guarantee;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "technical")
    private java.lang.String technical;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "image_processing_status")
    private java.util.ArrayList<java.lang.String> imageProcessingStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "note_processing_status")
    private java.lang.String noteProcessingStatus;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "image_processed")
    private java.util.ArrayList<java.lang.String> imageProcessed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "note_processed")
    private java.lang.String noteProcessed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "comment_service_completed")
    private java.lang.String customerComment;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPublishDate() {
        return null;
    }
    
    public final void setPublishDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLng() {
        return null;
    }
    
    public final void setLng(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFromDate() {
        return null;
    }
    
    public final void setFromDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToDate() {
        return null;
    }
    
    public final void setToDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getRawWaterType() {
        return null;
    }
    
    public final void setRawWaterType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final boolean getMine() {
        return false;
    }
    
    public final void setMine(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEmployeeLat() {
        return null;
    }
    
    public final void setEmployeeLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEmployeeLng() {
        return null;
    }
    
    public final void setEmployeeLng(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getHandleFormality() {
        return null;
    }
    
    public final void setHandleFormality(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.model.RawWaterType> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getGuarantee() {
        return null;
    }
    
    public final void setGuarantee(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.model.RawWaterType> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTechnical() {
        return null;
    }
    
    public final void setTechnical(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getImageProcessingStatus() {
        return null;
    }
    
    public final void setImageProcessingStatus(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoteProcessingStatus() {
        return null;
    }
    
    public final void setNoteProcessingStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getImageProcessed() {
        return null;
    }
    
    public final void setImageProcessed(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNoteProcessed() {
        return null;
    }
    
    public final void setNoteProcessed(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerComment() {
        return null;
    }
    
    public final void setCustomerComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Report(int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> image, @org.jetbrains.annotations.Nullable()
    java.lang.String customerName, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.Nullable()
    java.lang.String publishDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Double lng, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String fromDate, @org.jetbrains.annotations.Nullable()
    java.lang.String toDate, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> rawWaterType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> products, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> images, boolean mine, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Double employeeLat, @org.jetbrains.annotations.Nullable()
    java.lang.Double employeeLng, @org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.model.RawWaterType> handleFormality, @org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.model.RawWaterType> guarantee, @org.jetbrains.annotations.Nullable()
    java.lang.String technical, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> imageProcessingStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String noteProcessingStatus, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> imageProcessed, @org.jetbrains.annotations.Nullable()
    java.lang.String noteProcessed, @org.jetbrains.annotations.Nullable()
    java.lang.String customerComment) {
        super();
    }
}
package com.vn.ntesco.model.Request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR \u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\b\u00a8\u0006."}, d2 = {"Lcom/vn/ntesco/model/Request/NTescoRequestPOST;", "", "()V", "chemicalName", "", "getChemicalName", "()Ljava/lang/String;", "setChemicalName", "(Ljava/lang/String;)V", "comment_service", "getComment_service", "setComment_service", "concentration", "getConcentration", "setConcentration", "cost", "getCost", "setCost", "currency", "getCurrency", "setCurrency", "fromDate", "getFromDate", "setFromDate", "required", "getRequired", "setRequired", "specificGravity", "getSpecificGravity", "setSpecificGravity", "stockSolution", "getStockSolution", "setStockSolution", "technicalId", "", "getTechnicalId", "()Ljava/lang/Integer;", "setTechnicalId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "toDate", "getToDate", "setToDate", "waterFlowRate", "getWaterFlowRate", "setWaterFlowRate", "app_debug"})
public class NTescoRequestPOST {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "chemical_name")
    private java.lang.String chemicalName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "concentration")
    private java.lang.String concentration;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cost")
    private java.lang.String cost;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "required")
    private java.lang.String required;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "specific_gravity")
    private java.lang.String specificGravity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stock_solution")
    private java.lang.String stockSolution;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "water_flow_rate")
    private java.lang.String waterFlowRate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "from_date")
    private java.lang.String fromDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "to_date")
    private java.lang.String toDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "technical_id")
    private java.lang.Integer technicalId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "comment_service")
    private java.lang.String comment_service;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "currency")
    private java.lang.String currency;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChemicalName() {
        return null;
    }
    
    public final void setChemicalName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConcentration() {
        return null;
    }
    
    public final void setConcentration(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCost() {
        return null;
    }
    
    public final void setCost(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRequired() {
        return null;
    }
    
    public final void setRequired(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSpecificGravity() {
        return null;
    }
    
    public final void setSpecificGravity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStockSolution() {
        return null;
    }
    
    public final void setStockSolution(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWaterFlowRate() {
        return null;
    }
    
    public final void setWaterFlowRate(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTechnicalId() {
        return null;
    }
    
    public final void setTechnicalId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComment_service() {
        return null;
    }
    
    public final void setComment_service(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public NTescoRequestPOST() {
        super();
    }
}
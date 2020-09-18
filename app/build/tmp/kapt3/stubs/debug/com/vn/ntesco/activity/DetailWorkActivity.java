package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010DJ\u0006\u0010E\u001a\u00020FJ\u0015\u0010G\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010DJ\u0015\u0010H\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010DJ\b\u0010I\u001a\u00020\u0006H\u0016J\u0006\u0010J\u001a\u00020BJ\u0017\u0010K\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010DJ\u001c\u0010L\u001a\u00020B2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010N\u001a\u00020FJ\u0010\u0010O\u001a\u00020B2\b\u0010M\u001a\u0004\u0018\u00010)J\u0010\u0010P\u001a\u00020B2\b\u0010M\u001a\u0004\u0018\u00010)J\u0010\u0010Q\u001a\u00020B2\u0006\u0010R\u001a\u00020SH\u0016J\u0012\u0010T\u001a\u00020B2\b\u0010U\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010V\u001a\u00020B2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u000e\u0010[\u001a\u00020B2\u0006\u0010\\\u001a\u00020\u0006J\b\u0010]\u001a\u00020\u0006H\u0016J\u0012\u0010^\u001a\u00020B2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\b\u0010a\u001a\u00020ZH\u0016J\u0010\u0010b\u001a\u00020B2\b\u0010M\u001a\u0004\u0018\u00010)J\u001f\u0010c\u001a\u00020B2\b\u0010*\u001a\u0004\u0018\u00010\u00062\u0006\u0010d\u001a\u00020\u0006H\u0002\u00a2\u0006\u0002\u0010eJ\u001d\u0010f\u001a\u00020B2\b\u0010*\u001a\u0004\u0018\u00010\u00062\u0006\u0010d\u001a\u00020\u0006\u00a2\u0006\u0002\u0010eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u000fR\u001a\u0010>\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010%\"\u0004\b@\u0010\'\u00a8\u0006g"}, d2 = {"Lcom/vn/ntesco/activity/DetailWorkActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/vn/ntesco/utils/ImagePicker$OnSingleImageSelectedListener;", "()V", "ZOOM_VALUE", "", "completedStatus", "Landroid/widget/ImageView;", "confirmStatus", "formsProcessingAdapter", "Lcom/vn/ntesco/adapter/ReportCheckAdapter;", "getFormsProcessingAdapter", "()Lcom/vn/ntesco/adapter/ReportCheckAdapter;", "setFormsProcessingAdapter", "(Lcom/vn/ntesco/adapter/ReportCheckAdapter;)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "newStatus", "posSelect", "getPosSelect", "()I", "setPosSelect", "(I)V", "processedImageAdapter", "Lcom/vn/ntesco/adapter/WorkImageAdapter;", "getProcessedImageAdapter", "()Lcom/vn/ntesco/adapter/WorkImageAdapter;", "setProcessedImageAdapter", "(Lcom/vn/ntesco/adapter/WorkImageAdapter;)V", "processingStatus", "processingStatusImageAdapter", "getProcessingStatusImageAdapter", "setProcessingStatusImageAdapter", "productTypeAdapter", "Lcom/vn/ntesco/adapter/WorkCheckAdapter;", "getProductTypeAdapter", "()Lcom/vn/ntesco/adapter/WorkCheckAdapter;", "setProductTypeAdapter", "(Lcom/vn/ntesco/adapter/WorkCheckAdapter;)V", "report", "Lcom/vn/ntesco/model/Report;", "reportId", "reportImageAdapter", "getReportImageAdapter", "setReportImageAdapter", "reportUploadImagesAdapter", "Lcom/vn/ntesco/adapter/ReportUploadImages;", "getReportUploadImagesAdapter", "()Lcom/vn/ntesco/adapter/ReportUploadImages;", "setReportUploadImagesAdapter", "(Lcom/vn/ntesco/adapter/ReportUploadImages;)V", "technicalAdapter", "Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;", "Lcom/vn/ntesco/model/User;", "getTechnicalAdapter", "()Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;", "setTechnicalAdapter", "(Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;)V", "warrantyStatusAdapter", "getWarrantyStatusAdapter", "setWarrantyStatusAdapter", "waterTypeAdapter", "getWaterTypeAdapter", "setWaterTypeAdapter", "assignReport", "", "id", "(Ljava/lang/Integer;)V", "checkValidate", "", "completeReport", "confirmReport", "getLayoutContent", "getListTechnicals", "getReportDetail", "initAssignData", "reportDetail", "isDisable", "initData", "initProcessingData", "onClick", "v", "Landroid/view/View;", "onMapReady", "googleMap", "onSingleImageSelected", "uri", "Landroid/net/Uri;", "tag", "", "sendBroadcast", "status", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "showProcessedUploadInfo", "uploadProductProcessingReport", "type", "(Ljava/lang/Integer;I)V", "uploadProductProcessingReportNew", "app_debug"})
public final class DetailWorkActivity extends com.vn.ntesco.base.BaseHeaderActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.vn.ntesco.utils.ImagePicker.OnSingleImageSelectedListener {
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkCheckAdapter waterTypeAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkCheckAdapter productTypeAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportCheckAdapter formsProcessingAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportCheckAdapter warrantyStatusAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkImageAdapter reportImageAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.User> technicalAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportUploadImages reportUploadImagesAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkImageAdapter processingStatusImageAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkImageAdapter processedImageAdapter;
    private com.vn.ntesco.model.Report report;
    private com.google.android.gms.maps.GoogleMap mMap;
    private final int ZOOM_VALUE = 15;
    private int reportId;
    private android.widget.ImageView newStatus;
    private android.widget.ImageView confirmStatus;
    private android.widget.ImageView processingStatus;
    private android.widget.ImageView completedStatus;
    private int posSelect;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkCheckAdapter getWaterTypeAdapter() {
        return null;
    }
    
    public final void setWaterTypeAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkCheckAdapter getProductTypeAdapter() {
        return null;
    }
    
    public final void setProductTypeAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportCheckAdapter getFormsProcessingAdapter() {
        return null;
    }
    
    public final void setFormsProcessingAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportCheckAdapter getWarrantyStatusAdapter() {
        return null;
    }
    
    public final void setWarrantyStatusAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkImageAdapter getReportImageAdapter() {
        return null;
    }
    
    public final void setReportImageAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.User> getTechnicalAdapter() {
        return null;
    }
    
    public final void setTechnicalAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportUploadImages getReportUploadImagesAdapter() {
        return null;
    }
    
    public final void setReportUploadImagesAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportUploadImages p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkImageAdapter getProcessingStatusImageAdapter() {
        return null;
    }
    
    public final void setProcessingStatusImageAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkImageAdapter getProcessedImageAdapter() {
        return null;
    }
    
    public final void setProcessedImageAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkImageAdapter p0) {
    }
    
    public final int getPosSelect() {
        return 0;
    }
    
    public final void setPosSelect(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String setTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutContent() {
        return 0;
    }
    
    @java.lang.Override()
    public int setBackgroundHeader() {
        return 0;
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void getReportDetail(java.lang.Integer id) {
    }
    
    public final void initData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Report reportDetail) {
    }
    
    public final void initAssignData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Report reportDetail, boolean isDisable) {
    }
    
    public final void initProcessingData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Report reportDetail) {
    }
    
    public final void showProcessedUploadInfo(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Report reportDetail) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public final void confirmReport(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
    
    public final void assignReport(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
    
    public final void completeReport(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
    
    public final void getListTechnicals() {
    }
    
    public final boolean checkValidate() {
        return false;
    }
    
    public final void sendBroadcast(int status) {
    }
    
    @java.lang.Override()
    public void onSingleImageSelected(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    private final void uploadProductProcessingReport(java.lang.Integer reportId, int type) {
    }
    
    public final void uploadProductProcessingReportNew(@org.jetbrains.annotations.Nullable()
    java.lang.Integer reportId, int type) {
    }
    
    public DetailWorkActivity() {
        super();
    }
}
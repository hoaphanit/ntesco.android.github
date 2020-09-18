package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001pB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010L\u001a\u00020\u001bJ\u0006\u0010M\u001a\u00020NJ\b\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u0007H\u0002J\u0012\u0010R\u001a\u00020N2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\"\u0010T\u001a\u00020N2\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00072\b\u0010V\u001a\u0004\u0018\u00010WH\u0014J\b\u0010X\u001a\u00020NH\u0014J-\u0010Y\u001a\u00020N2\u0006\u0010Q\u001a\u00020\u00072\u000e\u0010Z\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150[2\u0006\u0010\\\u001a\u00020]H\u0016\u00a2\u0006\u0002\u0010^J\b\u0010_\u001a\u00020NH\u0014J\u001c\u0010`\u001a\u00020N2\b\u0010a\u001a\u0004\u0018\u00010b2\b\u0010c\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010d\u001a\u00020N2\b\u0010e\u001a\u0004\u0018\u00010f2\b\u0010g\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010h\u001a\u00020NH\u0014J\b\u0010i\u001a\u00020NH\u0014J\b\u0010j\u001a\u00020\u0007H\u0016J\u0012\u0010k\u001a\u00020N2\b\u0010l\u001a\u0004\u0018\u00010mH\u0016J\b\u0010n\u001a\u00020\u0015H\u0016J\b\u0010o\u001a\u00020NH\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R\u001a\u0010(\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u000604R\u00020\u0000X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010B\u00a8\u0006q"}, d2 = {"Lcom/vn/ntesco/activity/CreateReportActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Lcom/vn/ntesco/utils/LocationData$AddressCallBack;", "Lcom/vn/ntesco/utils/ImagePicker$OnSingleImageSelectedListener;", "()V", "WRITE_EXTERNAL_STORAGE_CODE", "", "getWRITE_EXTERNAL_STORAGE_CODE", "()I", "edtContent", "Landroid/widget/EditText;", "getEdtContent", "()Landroid/widget/EditText;", "setEdtContent", "(Landroid/widget/EditText;)V", "edtCustomerName", "getEdtCustomerName", "setEdtCustomerName", "imagesList", "Ljava/util/ArrayList;", "", "getImagesList", "()Ljava/util/ArrayList;", "setImagesList", "(Ljava/util/ArrayList;)V", "isDetail", "", "()Z", "setDetail", "(Z)V", "lat", "", "getLat", "()D", "setLat", "(D)V", "lng", "getLng", "setLng", "mBound", "getMBound", "setMBound", "mService", "Lcom/vn/ntesco/utils/LocationUpdatesService;", "getMService", "()Lcom/vn/ntesco/utils/LocationUpdatesService;", "setMService", "(Lcom/vn/ntesco/utils/LocationUpdatesService;)V", "mServiceConnection", "Landroid/content/ServiceConnection;", "myReceiver", "Lcom/vn/ntesco/activity/CreateReportActivity$MyReceiver;", "getMyReceiver", "()Lcom/vn/ntesco/activity/CreateReportActivity$MyReceiver;", "setMyReceiver", "(Lcom/vn/ntesco/activity/CreateReportActivity$MyReceiver;)V", "posSelect", "getPosSelect", "setPosSelect", "(I)V", "productTypeAdapter", "Lcom/vn/ntesco/adapter/ReportCheckAdapter;", "getProductTypeAdapter", "()Lcom/vn/ntesco/adapter/ReportCheckAdapter;", "setProductTypeAdapter", "(Lcom/vn/ntesco/adapter/ReportCheckAdapter;)V", "reportUploadImages", "Lcom/vn/ntesco/adapter/ReportUploadImages;", "getReportUploadImages", "()Lcom/vn/ntesco/adapter/ReportUploadImages;", "setReportUploadImages", "(Lcom/vn/ntesco/adapter/ReportUploadImages;)V", "waterTypeAdapter", "getWaterTypeAdapter", "setWaterTypeAdapter", "checkValidate", "createReport", "", "getLayoutContent", "hasStoragePermission", "requestCode", "locationData", "Lcom/vn/ntesco/utils/LocationData;", "onActivityResult", "resultCode", "data", "Landroid/content/Intent;", "onPause", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onSingleImageSelected", "uri", "Landroid/net/Uri;", "tag", "onStart", "onStop", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "uploadReport", "MyReceiver", "app_debug"})
public final class CreateReportActivity extends com.vn.ntesco.base.BaseHeaderActivity implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, com.vn.ntesco.utils.LocationData.AddressCallBack, com.vn.ntesco.utils.ImagePicker.OnSingleImageSelectedListener {
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportCheckAdapter waterTypeAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportCheckAdapter productTypeAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.ReportUploadImages reportUploadImages;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtCustomerName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtContent;
    private boolean isDetail;
    private int posSelect;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.activity.CreateReportActivity.MyReceiver myReceiver;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.utils.LocationUpdatesService mService;
    private boolean mBound;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imagesList;
    private double lat;
    private double lng;
    private final int WRITE_EXTERNAL_STORAGE_CODE = 111;
    private final android.content.ServiceConnection mServiceConnection = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportCheckAdapter getWaterTypeAdapter() {
        return null;
    }
    
    public final void setWaterTypeAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportCheckAdapter getProductTypeAdapter() {
        return null;
    }
    
    public final void setProductTypeAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportCheckAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.ReportUploadImages getReportUploadImages() {
        return null;
    }
    
    public final void setReportUploadImages(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.ReportUploadImages p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtCustomerName() {
        return null;
    }
    
    public final void setEdtCustomerName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtContent() {
        return null;
    }
    
    public final void setEdtContent(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    public final boolean isDetail() {
        return false;
    }
    
    public final void setDetail(boolean p0) {
    }
    
    public final int getPosSelect() {
        return 0;
    }
    
    public final void setPosSelect(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.activity.CreateReportActivity.MyReceiver getMyReceiver() {
        return null;
    }
    
    public final void setMyReceiver(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.activity.CreateReportActivity.MyReceiver p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.utils.LocationUpdatesService getMService() {
        return null;
    }
    
    public final void setMService(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.LocationUpdatesService p0) {
    }
    
    public final boolean getMBound() {
        return false;
    }
    
    public final void setMBound(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImagesList() {
        return null;
    }
    
    public final void setImagesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final void setLat(double p0) {
    }
    
    public final double getLng() {
        return 0.0;
    }
    
    public final void setLng(double p0) {
    }
    
    public final int getWRITE_EXTERNAL_STORAGE_CODE() {
        return 0;
    }
    
    @java.lang.Override()
    public int getLayoutContent() {
        return 0;
    }
    
    @java.lang.Override()
    public int setBackgroundHeader() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String setTitle() {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    /**
     * * Returns the current state of the permissions needed.
     */
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onSingleImageSelected(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    private final void uploadReport() {
    }
    
    private final boolean hasStoragePermission(int requestCode) {
        return false;
    }
    
    public final void createReport() {
    }
    
    @java.lang.Override()
    public void locationData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.LocationData locationData) {
    }
    
    public final boolean checkValidate() {
        return false;
    }
    
    public CreateReportActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/activity/CreateReportActivity$MyReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/vn/ntesco/activity/CreateReportActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    public final class MyReceiver extends android.content.BroadcastReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
        }
        
        public MyReceiver() {
            super();
        }
    }
}
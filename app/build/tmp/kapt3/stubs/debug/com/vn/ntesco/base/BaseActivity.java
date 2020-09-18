package com.vn.ntesco.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0004J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u000fH\u0004J\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\nJ\u0010\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\nH\u0014J\u0010\u0010!\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0006\u0010\"\u001a\u00020\nJ\u0012\u0010#\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\u000e\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0011J\u0012\u0010&\u001a\u00020\n2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0004J\u001a\u0010)\u001a\u00020\n2\b\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020+H\u0004J\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\nJ\u000e\u0010/\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/vn/ntesco/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "REQUEST_PERMISSIONS_REQUEST_CODE", "", "getREQUEST_PERMISSIONS_REQUEST_CODE", "()I", "progressDialog", "Lcom/kaopiz/kprogresshud/KProgressHUD;", "addFragment", "", "fragment", "Lcom/vn/ntesco/base/BaseFragment;", "attachBaseContext", "newBase", "Landroid/content/Context;", "checkPermissions", "", "finish", "getFormsProcessingAndGuarantees", "getFragmentContainerViewId", "getLayoutResource", "getMyContext", "getProduct", "getRawWaterType", "isAvailableActivity", "activity", "Landroid/app/Activity;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "replaceFragment", "requestPermissions", "setBody", "setLoading", "isLoading", "showAlert", "message", "", "showAlertCallback", "callbackDialog", "Lcom/vn/ntesco/utils/DialogUtils$CallbackDialog;", "startFirstFragment", "Landroidx/fragment/app/Fragment;", "switchLanguage", "verifyAvailableNetwork", "Companion", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.kaopiz.kprogresshud.KProgressHUD progressDialog;
    private final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    @org.jetbrains.annotations.Nullable()
    private static com.vn.ntesco.base.BaseActivity baseActivity;
    public static final com.vn.ntesco.base.BaseActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getLayoutResource();
    
    public abstract void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public final int getREQUEST_PERMISSIONS_REQUEST_CODE() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void addFragment(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.base.BaseFragment fragment) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment startFirstFragment() {
        return null;
    }
    
    public final void replaceFragment(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.base.BaseFragment fragment) {
    }
    
    public final int getFragmentContainerViewId() {
        return 0;
    }
    
    public final boolean isAvailableActivity(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
        return false;
    }
    
    public final void setLoading(boolean isLoading) {
    }
    
    public final void getRawWaterType() {
    }
    
    public final void getProduct() {
    }
    
    public final void getFormsProcessingAndGuarantees() {
    }
    
    public final void switchLanguage() {
    }
    
    protected final void showAlert(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    protected final void showAlertCallback(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.vn.ntesco.utils.DialogUtils.CallbackDialog callbackDialog) {
    }
    
    public final boolean verifyAvailableNetwork(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity activity) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    public final boolean checkPermissions() {
        return false;
    }
    
    public final void requestPermissions() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.Context getMyContext() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/base/BaseActivity$Companion;", "", "()V", "baseActivity", "Lcom/vn/ntesco/base/BaseActivity;", "getBaseActivity", "()Lcom/vn/ntesco/base/BaseActivity;", "setBaseActivity", "(Lcom/vn/ntesco/base/BaseActivity;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.vn.ntesco.base.BaseActivity getBaseActivity() {
            return null;
        }
        
        public final void setBaseActivity(@org.jetbrains.annotations.Nullable()
        com.vn.ntesco.base.BaseActivity p0) {
        }
        
        private Companion() {
            super();
        }
    }
}
package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/vn/ntesco/fragment/LoginFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "edtPassword", "Landroid/widget/EditText;", "edtUserName", "goToService", "", "getGoToService", "()Z", "setGoToService", "(Z)V", "ivPassword", "Landroid/widget/ImageView;", "ivUserName", "tvForgotPass", "Landroid/widget/TextView;", "checkValidate", "getLayoutResource", "", "login", "", "onClick", "v", "Landroid/view/View;", "onSetBodyView", "view", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendBroadcast", "Companion", "app_debug"})
public final class LoginFragment extends com.vn.ntesco.base.BaseFragment implements android.view.View.OnClickListener {
    private android.widget.EditText edtUserName;
    private android.widget.EditText edtPassword;
    private android.widget.ImageView ivUserName;
    private android.widget.ImageView ivPassword;
    private android.widget.TextView tvForgotPass;
    private boolean goToService;
    public static final com.vn.ntesco.fragment.LoginFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getGoToService() {
        return false;
    }
    
    public final void setGoToService(boolean p0) {
    }
    
    @java.lang.Override()
    public void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void login() {
    }
    
    private final boolean checkValidate() {
        return false;
    }
    
    private final void sendBroadcast() {
    }
    
    public LoginFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.vn.ntesco.fragment.LoginFragment newInstance(boolean gotoService) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/fragment/LoginFragment$Companion;", "", "()V", "newInstance", "Lcom/vn/ntesco/fragment/LoginFragment;", "gotoService", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.fragment.LoginFragment newInstance(boolean gotoService) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
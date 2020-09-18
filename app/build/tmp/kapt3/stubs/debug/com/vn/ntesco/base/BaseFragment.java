package com.vn.ntesco.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0004J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aH\u0004J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0004J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006$"}, d2 = {"Lcom/vn/ntesco/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "progressDialog", "Lcom/kaopiz/kprogresshud/KProgressHUD;", "getProgressDialog", "()Lcom/kaopiz/kprogresshud/KProgressHUD;", "setProgressDialog", "(Lcom/kaopiz/kprogresshud/KProgressHUD;)V", "getLayoutResource", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSetBodyView", "", "view", "registerBroadcast", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "filter", "", "setLoading", "isLoading", "", "showAlert", "message", "showAlertCallback", "callbackDialog", "Lcom/vn/ntesco/utils/DialogUtils$CallbackDialog;", "unregisterBroadcast", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.kaopiz.kprogresshud.KProgressHUD progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    public abstract int getLayoutResource();
    
    public abstract void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @org.jetbrains.annotations.NotNull()
    public final com.kaopiz.kprogresshud.KProgressHUD getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    com.kaopiz.kprogresshud.KProgressHUD p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setLoading(boolean isLoading) {
    }
    
    protected final void showAlert(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected final void showAlertCallback(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    com.vn.ntesco.utils.DialogUtils.CallbackDialog callbackDialog) {
    }
    
    protected final void registerBroadcast(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver broadcastReceiver, @org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    protected final void unregisterBroadcast(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver broadcastReceiver) {
    }
    
    public BaseFragment() {
        super();
    }
}
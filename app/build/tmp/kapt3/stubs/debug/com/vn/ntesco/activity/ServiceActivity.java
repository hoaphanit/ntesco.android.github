package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\tJ\b\u0010\u001d\u001a\u00020\u0015H\u0002J\"\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0014J\u001c\u0010\'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\u0012\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0017H\u0016J\u0010\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u0017H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u00063"}, d2 = {"Lcom/vn/ntesco/activity/ServiceActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "Lcom/vn/ntesco/utils/ImagePicker$OnSingleImageSelectedListener;", "()V", "REQUEST_EDIT_PROFILE", "", "getREQUEST_EDIT_PROFILE", "()I", "mUser", "Lcom/vn/ntesco/model/User;", "getMUser", "()Lcom/vn/ntesco/model/User;", "setMUser", "(Lcom/vn/ntesco/model/User;)V", "notifyReceiver", "Landroid/content/BroadcastReceiver;", "getNotifyReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setNotifyReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "changeAvatar", "", "path", "", "getLayoutContent", "getProfile", "getTotalNotifyUnread", "initData", "user", "logOut", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "v", "Landroid/view/View;", "onDestroy", "onSingleImageSelected", "uri", "Landroid/net/Uri;", "tag", "sendBroadcast", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "uploadPhoto", "file", "app_debug"})
public final class ServiceActivity extends com.vn.ntesco.base.BaseHeaderActivity implements com.vn.ntesco.utils.ImagePicker.OnSingleImageSelectedListener {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.model.User mUser;
    private final int REQUEST_EDIT_PROFILE = 102;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver notifyReceiver;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.User getMUser() {
        return null;
    }
    
    public final void setMUser(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User p0) {
    }
    
    public final int getREQUEST_EDIT_PROFILE() {
        return 0;
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
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void getProfile() {
    }
    
    private final void logOut() {
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
    
    public final void initData(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User user) {
    }
    
    private final void uploadPhoto(java.lang.String file) {
    }
    
    public final void changeAvatar(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    private final void sendBroadcast() {
    }
    
    private final void getTotalNotifyUnread() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getNotifyReceiver$app_debug() {
        return null;
    }
    
    public final void setNotifyReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public ServiceActivity() {
        super();
    }
}
package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ0\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ,\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ8\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0017\u001a\u00020\u0018R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/vn/ntesco/utils/Navigator;", "", "()V", "FRAGMENT_CLASS_NAME_START", "", "getFRAGMENT_CLASS_NAME_START", "()Ljava/lang/String;", "startActivity", "", "context", "Landroid/content/Context;", "activityClass", "Ljava/lang/Class;", "data", "Landroid/os/Bundle;", "startFragment", "Landroidx/fragment/app/FragmentActivity;", "fragmentClassName", "startFragmentIntent", "intent", "Landroid/content/Intent;", "startFragmentWithResult", "Landroid/app/Activity;", "request", "", "app_debug"})
public final class Navigator {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FRAGMENT_CLASS_NAME_START = "FRAGMENT_CLASS_NAME_START";
    public static final com.vn.ntesco.utils.Navigator INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFRAGMENT_CLASS_NAME_START() {
        return null;
    }
    
    public final void startActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> activityClass, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data) {
    }
    
    public final void startFragmentIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String fragmentClassName, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data) {
    }
    
    public final void startFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.Nullable()
    java.lang.String fragmentClassName, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> activityClass, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data) {
    }
    
    public final void startFragmentWithResult(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.Nullable()
    java.lang.String fragmentClassName, @org.jetbrains.annotations.Nullable()
    java.lang.Class<?> activityClass, @org.jetbrains.annotations.Nullable()
    android.os.Bundle data, int request) {
    }
    
    private Navigator() {
        super();
    }
}
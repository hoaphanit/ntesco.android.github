package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ<\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ,\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J*\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/vn/ntesco/utils/DialogUtils;", "", "()V", "dialog", "Landroid/app/Dialog;", "showDialog", "", "activity", "Landroid/app/Activity;", "title", "", "callback", "Lcom/vn/ntesco/utils/DialogUtils$CallbackDialog;", "showDialogConfirm", "btnOk", "btnCancel", "isShowCancelButton", "", "showDialogPickFromDate", "calendar", "Ljava/util/Calendar;", "Lcom/vn/ntesco/utils/DialogUtils$CallbackPickDateDialog;", "toCalendar", "showDialogPickToDate", "fromCalendar", "CallbackDialog", "CallbackPickDateDialog", "app_debug"})
public final class DialogUtils {
    private static android.app.Dialog dialog;
    public static final com.vn.ntesco.utils.DialogUtils INSTANCE = null;
    
    public final void showDialog(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.DialogUtils.CallbackDialog callback) {
    }
    
    public final void showDialogConfirm(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String btnOk, @org.jetbrains.annotations.NotNull()
    java.lang.String btnCancel, boolean isShowCancelButton, @org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.DialogUtils.CallbackDialog callback) {
    }
    
    public final void showDialogPickFromDate(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.util.Calendar calendar, @org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.DialogUtils.CallbackPickDateDialog callback, @org.jetbrains.annotations.Nullable()
    java.util.Calendar toCalendar) {
    }
    
    public final void showDialogPickToDate(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.util.Calendar calendar, @org.jetbrains.annotations.Nullable()
    com.vn.ntesco.utils.DialogUtils.CallbackPickDateDialog callback, @org.jetbrains.annotations.NotNull()
    java.util.Calendar fromCalendar) {
    }
    
    private DialogUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/vn/ntesco/utils/DialogUtils$CallbackPickDateDialog;", "", "onPick", "", "view", "Landroid/widget/DatePicker;", "year", "", "monthOfYear", "dayOfMonth", "app_debug"})
    public static abstract interface CallbackPickDateDialog {
        
        public abstract void onPick(@org.jetbrains.annotations.NotNull()
        android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/vn/ntesco/utils/DialogUtils$CallbackDialog;", "", "onAccept", "", "onCancel", "app_debug"})
    public static abstract interface CallbackDialog {
        
        public abstract void onAccept();
        
        public abstract void onCancel();
    }
}
package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\b\u0010(\u001a\u00020\rH\u0016J \u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002J\u001e\u0010.\u001a\u00020%2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rJ0\u00100\u001a\u00020%2\f\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u0001022\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020\r2\u0006\u00106\u001a\u000207H\u0016J\u0016\u00108\u001a\u00020%2\f\u00101\u001a\b\u0012\u0002\b\u0003\u0018\u000102H\u0016J\b\u00109\u001a\u00020%H\u0016J\u0012\u0010:\u001a\u00020%2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0006\u0010=\u001a\u00020%R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006>"}, d2 = {"Lcom/vn/ntesco/activity/WorkScheduleActivity;", "Lcom/vn/ntesco/base/BaseActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "cacheCalendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "isFirstLoad", "", "()Z", "setFirstLoad", "(Z)V", "month", "", "getMonth", "()I", "setMonth", "(I)V", "spnMonth", "Landroid/widget/Spinner;", "getSpnMonth", "()Landroid/widget/Spinner;", "setSpnMonth", "(Landroid/widget/Spinner;)V", "spnWeek", "getSpnWeek", "setSpnWeek", "spnYear", "getSpnYear", "setSpnYear", "workScheduleAdapter", "Lcom/vn/ntesco/adapter/WorkScheduleAdapter;", "getWorkScheduleAdapter", "()Lcom/vn/ntesco/adapter/WorkScheduleAdapter;", "setWorkScheduleAdapter", "(Lcom/vn/ntesco/adapter/WorkScheduleAdapter;)V", "getAllWorkInMonth", "", "currentDate", "Ljava/util/Date;", "getLayoutResource", "getSchedules", "year", "", "start", "end", "getWorkInWeek", "weekInMonth", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "onNothingSelected", "onUserInteraction", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setupData", "app_debug"})
public final class WorkScheduleActivity extends com.vn.ntesco.base.BaseActivity implements android.widget.AdapterView.OnItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.WorkScheduleAdapter workScheduleAdapter;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner spnYear;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner spnMonth;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner spnWeek;
    private boolean isFirstLoad;
    private int month;
    private final java.util.Calendar cacheCalendar = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.WorkScheduleAdapter getWorkScheduleAdapter() {
        return null;
    }
    
    public final void setWorkScheduleAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkScheduleAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpnYear() {
        return null;
    }
    
    public final void setSpnYear(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpnMonth() {
        return null;
    }
    
    public final void setSpnMonth(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpnWeek() {
        return null;
    }
    
    public final void setSpnWeek(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    public final boolean isFirstLoad() {
        return false;
    }
    
    public final void setFirstLoad(boolean p0) {
    }
    
    public final int getMonth() {
        return 0;
    }
    
    public final void setMonth(int p0) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setupData() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    public final void getAllWorkInMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date currentDate) {
    }
    
    public final void getWorkInWeek(int year, int month, int weekInMonth) {
    }
    
    private final void getSchedules(java.lang.String year, java.lang.String start, java.lang.String end) {
    }
    
    @java.lang.Override()
    public void onUserInteraction() {
    }
    
    public WorkScheduleActivity() {
        super();
    }
}
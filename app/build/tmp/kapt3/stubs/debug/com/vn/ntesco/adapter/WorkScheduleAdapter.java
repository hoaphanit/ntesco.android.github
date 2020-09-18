package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0014\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/vn/ntesco/adapter/WorkScheduleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/WorkScheduleAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "currentCalendar", "Ljava/util/Calendar;", "getCurrentCalendar", "()Ljava/util/Calendar;", "setCurrentCalendar", "(Ljava/util/Calendar;)V", "dataSchedule", "", "Lcom/vn/ntesco/model/DataSchedule;", "getDataSchedule", "()Ljava/util/List;", "setDataSchedule", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setData", "dateList", "ViewHolder", "app_debug"})
public final class WorkScheduleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.WorkScheduleAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.vn.ntesco.model.DataSchedule> dataSchedule;
    @org.jetbrains.annotations.Nullable()
    private java.util.Calendar currentCalendar;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.DataSchedule> getDataSchedule() {
        return null;
    }
    
    public final void setDataSchedule(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.DataSchedule> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getCurrentCalendar() {
        return null;
    }
    
    public final void setCurrentCalendar(@org.jetbrains.annotations.Nullable()
    java.util.Calendar p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.DataSchedule> dateList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkScheduleAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.WorkScheduleAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public WorkScheduleAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/vn/ntesco/adapter/WorkScheduleAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "tvDate", "Landroid/widget/TextView;", "getTvDate", "()Landroid/widget/TextView;", "setTvDate", "(Landroid/widget/TextView;)V", "workChildList", "Landroidx/recyclerview/widget/RecyclerView;", "getWorkChildList", "()Landroidx/recyclerview/widget/RecyclerView;", "setWorkChildList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "workScheduleChildAdapter", "Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter;", "getWorkScheduleChildAdapter", "()Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter;", "setWorkScheduleChildAdapter", "(Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDate;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView workChildList;
        @org.jetbrains.annotations.NotNull()
        public com.vn.ntesco.adapter.WorkScheduleChildAdapter workScheduleChildAdapter;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDate() {
            return null;
        }
        
        public final void setTvDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getWorkChildList() {
            return null;
        }
        
        public final void setWorkChildList(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.adapter.WorkScheduleChildAdapter getWorkScheduleChildAdapter() {
            return null;
        }
        
        public final void setWorkScheduleChildAdapter(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.adapter.WorkScheduleChildAdapter p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
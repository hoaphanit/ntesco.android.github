package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "reportSchedules", "", "Lcom/vn/ntesco/model/ReportSchedule;", "getReportSchedules", "()Ljava/util/List;", "setReportSchedules", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class WorkScheduleChildAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.WorkScheduleChildAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.vn.ntesco.model.ReportSchedule> reportSchedules;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.ReportSchedule> getReportSchedules() {
        return null;
    }
    
    public final void setReportSchedules(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.ReportSchedule> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.WorkScheduleChildAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.WorkScheduleChildAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public WorkScheduleChildAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/vn/ntesco/adapter/WorkScheduleChildAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "setDivider", "tvScheduleWork", "Landroid/widget/TextView;", "getTvScheduleWork", "()Landroid/widget/TextView;", "setTvScheduleWork", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvScheduleWork;
        @org.jetbrains.annotations.NotNull()
        private android.view.View divider;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvScheduleWork() {
            return null;
        }
        
        public final void setTvScheduleWork(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getDivider() {
            return null;
        }
        
        public final void setDivider(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
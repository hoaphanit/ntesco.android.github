package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0016H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/vn/ntesco/adapter/CheckListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/CheckListAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Lcom/vn/ntesco/model/CheckListModel;", "checkListModel", "getCheckListModel", "()Lcom/vn/ntesco/model/CheckListModel;", "setCheckListModel", "(Lcom/vn/ntesco/model/CheckListModel;)V", "itemClickListener", "Lcom/vn/ntesco/listener/ItemClickListener;", "getItemClickListener", "()Lcom/vn/ntesco/listener/ItemClickListener;", "setItemClickListener", "(Lcom/vn/ntesco/listener/ItemClickListener;)V", "getMContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class CheckListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.CheckListAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.listener.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.model.CheckListModel checkListModel;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.listener.ItemClickListener getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.listener.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.CheckListModel getCheckListModel() {
        return null;
    }
    
    public final void setCheckListModel(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.CheckListModel value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.CheckListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.CheckListAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public CheckListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010 \u001a\u00020\u001dR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Lcom/vn/ntesco/adapter/CheckListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "attributesAdapter", "Lcom/vn/ntesco/adapter/CheckListAttributesAdapter;", "getAttributesAdapter", "()Lcom/vn/ntesco/adapter/CheckListAttributesAdapter;", "setAttributesAdapter", "(Lcom/vn/ntesco/adapter/CheckListAttributesAdapter;)V", "rvAttributes", "Landroidx/recyclerview/widget/RecyclerView;", "getRvAttributes", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvAttributes", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tvAttributes", "Landroid/widget/TextView;", "getTvAttributes", "()Landroid/widget/TextView;", "setTvAttributes", "(Landroid/widget/TextView;)V", "initRecyclerView", "", "dataList", "", "", "inputList", "", "attribute", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAttributes;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvAttributes;
        @org.jetbrains.annotations.NotNull()
        private com.vn.ntesco.adapter.CheckListAttributesAdapter attributesAdapter;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAttributes() {
            return null;
        }
        
        public final void setTvAttributes(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvAttributes() {
            return null;
        }
        
        public final void setRvAttributes(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.adapter.CheckListAttributesAdapter getAttributesAdapter() {
            return null;
        }
        
        public final void setAttributesAdapter(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.adapter.CheckListAttributesAdapter p0) {
        }
        
        public final void initRecyclerView(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> dataList, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> inputList, @org.jetbrains.annotations.NotNull()
        java.lang.String attribute) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}
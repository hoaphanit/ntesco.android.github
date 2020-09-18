package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/vn/ntesco/adapter/CheckListGroupAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/CheckListGroupAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemClickListener", "Lcom/vn/ntesco/listener/ItemClickListener;", "getItemClickListener", "()Lcom/vn/ntesco/listener/ItemClickListener;", "setItemClickListener", "(Lcom/vn/ntesco/listener/ItemClickListener;)V", "value", "", "Lcom/vn/ntesco/model/CheckListModel;", "listGroupCheckListModel", "getListGroupCheckListModel", "()Ljava/util/List;", "setListGroupCheckListModel", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolder", "app_debug"})
public final class CheckListGroupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.CheckListGroupAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.listener.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.vn.ntesco.model.CheckListModel> listGroupCheckListModel;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.listener.ItemClickListener getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.listener.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.CheckListModel> getListGroupCheckListModel() {
        return null;
    }
    
    public final void setListGroupCheckListModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.CheckListModel> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.CheckListGroupAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.CheckListGroupAdapter.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public CheckListGroupAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020#R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\f\u00a8\u0006("}, d2 = {"Lcom/vn/ntesco/adapter/CheckListGroupAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "btnSend", "Landroid/widget/TextView;", "getBtnSend", "()Landroid/widget/TextView;", "setBtnSend", "(Landroid/widget/TextView;)V", "checkListAdapter", "Lcom/vn/ntesco/adapter/CheckListAdapter;", "getCheckListAdapter", "()Lcom/vn/ntesco/adapter/CheckListAdapter;", "setCheckListAdapter", "(Lcom/vn/ntesco/adapter/CheckListAdapter;)V", "ivArrow", "Landroid/widget/ImageView;", "getIvArrow", "()Landroid/widget/ImageView;", "setIvArrow", "(Landroid/widget/ImageView;)V", "rvCheckList", "Landroidx/recyclerview/widget/RecyclerView;", "getRvCheckList", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvCheckList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tvProduct", "getTvProduct", "setTvProduct", "hideCheckList", "", "initRecyclerView", "checkListModel", "Lcom/vn/ntesco/model/CheckListModel;", "showCheckList", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvProduct;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView btnSend;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivArrow;
        @org.jetbrains.annotations.NotNull()
        private com.vn.ntesco.adapter.CheckListAdapter checkListAdapter;
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvCheckList;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvProduct() {
            return null;
        }
        
        public final void setTvProduct(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBtnSend() {
            return null;
        }
        
        public final void setBtnSend(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvArrow() {
            return null;
        }
        
        public final void setIvArrow(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.adapter.CheckListAdapter getCheckListAdapter() {
            return null;
        }
        
        public final void setCheckListAdapter(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.adapter.CheckListAdapter p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvCheckList() {
            return null;
        }
        
        public final void setRvCheckList(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        public final void initRecyclerView(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.model.CheckListModel checkListModel) {
        }
        
        public final void hideCheckList() {
        }
        
        public final void showCheckList() {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
    }
}
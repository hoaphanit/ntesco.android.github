package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u001e\u0010#\u001a\u00020\u001d2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`%J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/vn/ntesco/adapter/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/CategoryAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemClickListener", "Lcom/vn/ntesco/listener/ItemClickListener;", "getItemClickListener", "()Lcom/vn/ntesco/listener/ItemClickListener;", "setItemClickListener", "(Lcom/vn/ntesco/listener/ItemClickListener;)V", "listCategory", "Ljava/util/ArrayList;", "Lcom/vn/ntesco/model/Category;", "getListCategory", "()Ljava/util/ArrayList;", "setListCategory", "(Ljava/util/ArrayList;)V", "getMContext", "()Landroid/content/Context;", "type", "", "getType", "()I", "setType", "(I)V", "getItemCount", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setData", "list", "Lkotlin/collections/ArrayList;", "setOnItemClickListener", "ViewHolder", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.CategoryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.listener.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.vn.ntesco.model.Category> listCategory;
    private int type;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.listener.ItemClickListener getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.vn.ntesco.model.Category> getListCategory() {
        return null;
    }
    
    public final void setListCategory(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vn.ntesco.model.Category> p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.vn.ntesco.model.Category> list) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.CategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.CategoryAdapter.ViewHolder viewHolder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.ItemClickListener itemClickListener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public CategoryAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/vn/ntesco/adapter/CategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "ivCategory", "Landroid/widget/ImageView;", "getIvCategory", "()Landroid/widget/ImageView;", "setIvCategory", "(Landroid/widget/ImageView;)V", "tvCategoryName", "Landroid/widget/TextView;", "getTvCategoryName", "()Landroid/widget/TextView;", "setTvCategoryName", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivCategory;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvCategoryName;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvCategory() {
            return null;
        }
        
        public final void setIvCategory(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvCategoryName() {
            return null;
        }
        
        public final void setTvCategoryName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
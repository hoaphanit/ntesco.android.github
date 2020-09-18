package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\"H\u0016J\u0018\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\"H\u0016J\u000e\u0010*\u001a\u00020$2\u0006\u0010\f\u001a\u00020\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006,"}, d2 = {"Lcom/vn/ntesco/adapter/NotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/NotificationAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "itemButtonClickListener", "Lcom/vn/ntesco/listener/ItemButtonClickListener;", "getItemButtonClickListener", "()Lcom/vn/ntesco/listener/ItemButtonClickListener;", "setItemButtonClickListener", "(Lcom/vn/ntesco/listener/ItemButtonClickListener;)V", "itemClickListener", "Lcom/vn/ntesco/listener/ItemClickListener;", "getItemClickListener", "()Lcom/vn/ntesco/listener/ItemClickListener;", "setItemClickListener", "(Lcom/vn/ntesco/listener/ItemClickListener;)V", "getMContext", "()Landroid/content/Context;", "notificationsList", "", "Lcom/vn/ntesco/model/Notification;", "getNotificationsList", "()Ljava/util/List;", "setNotificationsList", "(Ljava/util/List;)V", "viewBinderHelper", "Lcom/vn/ntesco/views/ViewBinderHelper;", "getViewBinderHelper", "()Lcom/vn/ntesco/views/ViewBinderHelper;", "setViewBinderHelper", "(Lcom/vn/ntesco/views/ViewBinderHelper;)V", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setOnItemClickListener", "ViewHolder", "app_debug"})
public final class NotificationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.NotificationAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.listener.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.listener.ItemButtonClickListener itemButtonClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.vn.ntesco.model.Notification> notificationsList;
    @org.jetbrains.annotations.NotNull()
    private com.vn.ntesco.views.ViewBinderHelper viewBinderHelper;
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.listener.ItemClickListener getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.listener.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.listener.ItemButtonClickListener getItemButtonClickListener() {
        return null;
    }
    
    public final void setItemButtonClickListener(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.listener.ItemButtonClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.Notification> getNotificationsList() {
        return null;
    }
    
    public final void setNotificationsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.Notification> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.views.ViewBinderHelper getViewBinderHelper() {
        return null;
    }
    
    public final void setViewBinderHelper(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.views.ViewBinderHelper p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.NotificationAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.NotificationAdapter.ViewHolder viewHolder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.listener.ItemClickListener itemClickListener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public NotificationAdapter(@org.jetbrains.annotations.Nullable()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a\u00a8\u0006!"}, d2 = {"Lcom/vn/ntesco/adapter/NotificationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "dragItem", "getDragItem", "()Landroid/view/View;", "setDragItem", "ivNotify", "Landroid/widget/ImageView;", "getIvNotify", "()Landroid/widget/ImageView;", "setIvNotify", "(Landroid/widget/ImageView;)V", "swipeRevealLayout", "Lcom/vn/ntesco/views/NtescoRevealLayout;", "getSwipeRevealLayout", "()Lcom/vn/ntesco/views/NtescoRevealLayout;", "setSwipeRevealLayout", "(Lcom/vn/ntesco/views/NtescoRevealLayout;)V", "tvDateCreated", "Landroid/widget/TextView;", "getTvDateCreated", "()Landroid/widget/TextView;", "setTvDateCreated", "(Landroid/widget/TextView;)V", "tvDelete", "getTvDelete", "setTvDelete", "tvTitle", "getTvTitle", "setTvTitle", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTitle;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDateCreated;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDelete;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivNotify;
        @org.jetbrains.annotations.NotNull()
        private com.vn.ntesco.views.NtescoRevealLayout swipeRevealLayout;
        @org.jetbrains.annotations.NotNull()
        private android.view.View dragItem;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        public final void setTvTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDateCreated() {
            return null;
        }
        
        public final void setTvDateCreated(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDelete() {
            return null;
        }
        
        public final void setTvDelete(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvNotify() {
            return null;
        }
        
        public final void setIvNotify(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.views.NtescoRevealLayout getSwipeRevealLayout() {
            return null;
        }
        
        public final void setSwipeRevealLayout(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.views.NtescoRevealLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getDragItem() {
            return null;
        }
        
        public final void setDragItem(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
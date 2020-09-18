package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00142\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/vn/ntesco/adapter/MessageChatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "messageList", "", "Lcom/vn/ntesco/model/MessageChat;", "getMessageList", "()Ljava/util/List;", "setMessageList", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "setData", "Companion", "RecipientViewHolder", "SenderViewHolder", "app_debug"})
public final class MessageChatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vn.ntesco.model.MessageChat> messageList;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    private static final int SENDER = 0;
    private static final int RECIPIENT = 1;
    public static final com.vn.ntesco.adapter.MessageChatAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.MessageChat> getMessageList() {
        return null;
    }
    
    public final void setMessageList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.MessageChat> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.MessageChat> messageList) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public MessageChatAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/vn/ntesco/adapter/MessageChatAdapter$SenderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "tvSenderMessage", "Landroid/widget/TextView;", "getTvSenderMessage", "()Landroid/widget/TextView;", "setTvSenderMessage", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class SenderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public android.widget.TextView tvSenderMessage;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvSenderMessage() {
            return null;
        }
        
        public final void setTvSenderMessage(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public SenderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/vn/ntesco/adapter/MessageChatAdapter$RecipientViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "ivAvatar", "Landroid/widget/ImageView;", "getIvAvatar", "()Landroid/widget/ImageView;", "setIvAvatar", "(Landroid/widget/ImageView;)V", "tvRecipientMessage", "Landroid/widget/TextView;", "getTvRecipientMessage", "()Landroid/widget/TextView;", "setTvRecipientMessage", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class RecipientViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        public android.widget.TextView tvRecipientMessage;
        @org.jetbrains.annotations.NotNull()
        public android.widget.ImageView ivAvatar;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvRecipientMessage() {
            return null;
        }
        
        public final void setTvRecipientMessage(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvAvatar() {
            return null;
        }
        
        public final void setIvAvatar(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public RecipientViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/adapter/MessageChatAdapter$Companion;", "", "()V", "RECIPIENT", "", "getRECIPIENT", "()I", "SENDER", "getSENDER", "app_debug"})
    public static final class Companion {
        
        public final int getSENDER() {
            return 0;
        }
        
        public final int getRECIPIENT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}
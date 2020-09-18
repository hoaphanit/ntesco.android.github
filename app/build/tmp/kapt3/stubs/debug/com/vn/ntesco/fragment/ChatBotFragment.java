package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010D\u001a\u00020EH\u0016J\u0012\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020GH\u0016J$\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020I2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020GH\u0002J\b\u0010R\u001a\u00020GH\u0002J\u0006\u0010S\u001a\u00020GJ\b\u0010T\u001a\u00020GH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u00020<8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u00020<8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@\u00a8\u0006U"}, d2 = {"Lcom/vn/ntesco/fragment/ChatBotFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "chatRef", "Lcom/google/firebase/firestore/CollectionReference;", "getChatRef", "()Lcom/google/firebase/firestore/CollectionReference;", "setChatRef", "(Lcom/google/firebase/firestore/CollectionReference;)V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getDb", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setDb", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "edtSendMessage", "Landroid/widget/EditText;", "getEdtSendMessage", "()Landroid/widget/EditText;", "setEdtSendMessage", "(Landroid/widget/EditText;)V", "ivSend", "Landroid/widget/ImageView;", "getIvSend", "()Landroid/widget/ImageView;", "setIvSend", "(Landroid/widget/ImageView;)V", "listener", "Lcom/google/firebase/firestore/ListenerRegistration;", "getListener", "()Lcom/google/firebase/firestore/ListenerRegistration;", "setListener", "(Lcom/google/firebase/firestore/ListenerRegistration;)V", "loginBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "getLoginBroadcastReceiver$app_debug", "()Landroid/content/BroadcastReceiver;", "setLoginBroadcastReceiver$app_debug", "(Landroid/content/BroadcastReceiver;)V", "messageChatAdapter", "Lcom/vn/ntesco/adapter/MessageChatAdapter;", "getMessageChatAdapter", "()Lcom/vn/ntesco/adapter/MessageChatAdapter;", "setMessageChatAdapter", "(Lcom/vn/ntesco/adapter/MessageChatAdapter;)V", "messageList", "", "Lcom/vn/ntesco/model/MessageChat;", "getMessageList", "()Ljava/util/List;", "setMessageList", "(Ljava/util/List;)V", "rvMessage", "Landroidx/recyclerview/widget/RecyclerView;", "getRvMessage", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvMessage", "(Landroidx/recyclerview/widget/RecyclerView;)V", "senderName", "", "getSenderName", "()Ljava/lang/String;", "setSenderName", "(Ljava/lang/String;)V", "userId", "getUserId", "setUserId", "getLayoutResource", "", "onClick", "", "v", "Landroid/view/View;", "onDestroy", "onSetBodyView", "view", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "realtimeUpdateListener", "sendBroadcast", "sendMessage", "sendMessageApi", "app_debug"})
public final class ChatBotFragment extends com.vn.ntesco.base.BaseFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.firestore.FirebaseFirestore db;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtSendMessage;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView ivSend;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vn.ntesco.model.MessageChat> messageList;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.MessageChatAdapter messageChatAdapter;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView rvMessage;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.firestore.CollectionReference chatRef;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.firestore.ListenerRegistration listener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String senderName;
    @org.jetbrains.annotations.NotNull()
    private android.content.BroadcastReceiver loginBroadcastReceiver;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtSendMessage() {
        return null;
    }
    
    public final void setEdtSendMessage(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getIvSend() {
        return null;
    }
    
    public final void setIvSend(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.MessageChat> getMessageList() {
        return null;
    }
    
    public final void setMessageList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.MessageChat> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.MessageChatAdapter getMessageChatAdapter() {
        return null;
    }
    
    public final void setMessageChatAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.MessageChatAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvMessage() {
        return null;
    }
    
    public final void setRvMessage(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.CollectionReference getChatRef() {
        return null;
    }
    
    public final void setChatRef(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.CollectionReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.ListenerRegistration p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSenderName() {
        return null;
    }
    
    public final void setSenderName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final void sendMessage() {
    }
    
    private final void realtimeUpdateListener() {
    }
    
    private final void sendMessageApi() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.BroadcastReceiver getLoginBroadcastReceiver$app_debug() {
        return null;
    }
    
    public final void setLoginBroadcastReceiver$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.BroadcastReceiver p0) {
    }
    
    private final void sendBroadcast() {
    }
    
    public ChatBotFragment() {
        super();
    }
}
package com.vn.ntesco.notification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/vn/ntesco/notification/NtescoMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "generateRandom", "", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "sendBroadcast", "sendNotification", "messageBody", "app_debug"})
public final class NtescoMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void sendNotification(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage messageBody) {
    }
    
    public final int generateRandom() {
        return 0;
    }
    
    private final void sendBroadcast() {
    }
    
    public NtescoMessagingService() {
        super();
    }
}
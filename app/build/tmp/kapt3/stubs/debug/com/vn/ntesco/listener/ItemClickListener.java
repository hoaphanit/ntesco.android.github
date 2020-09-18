package com.vn.ntesco.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u0002H\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/listener/ItemClickListener;", "", "onItemClick", "", "T", "item", "position", "", "(Ljava/lang/Object;I)V", "app_debug"})
public abstract interface ItemClickListener {
    
    public abstract <T extends java.lang.Object>void onItemClick(@org.jetbrains.annotations.NotNull()
    T item, int position);
}
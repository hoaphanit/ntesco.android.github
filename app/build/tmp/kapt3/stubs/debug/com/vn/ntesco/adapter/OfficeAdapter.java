package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/vn/ntesco/adapter/OfficeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "listOffice", "Ljava/util/ArrayList;", "Lcom/vn/ntesco/model/Office;", "Lkotlin/collections/ArrayList;", "getListOffice", "()Ljava/util/ArrayList;", "setListOffice", "(Ljava/util/ArrayList;)V", "getMContext", "()Landroid/app/Activity;", "getItemCount", "", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "ViewHolderGroup", "ViewHolderItem", "app_debug"})
public final class OfficeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.vn.ntesco.model.Office> listOffice;
    @org.jetbrains.annotations.Nullable()
    private final android.app.Activity mContext = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.vn.ntesco.model.Office> getListOffice() {
        return null;
    }
    
    public final void setListOffice(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.vn.ntesco.model.Office> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getMContext() {
        return null;
    }
    
    public OfficeAdapter(@org.jetbrains.annotations.Nullable()
    android.app.Activity mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/vn/ntesco/adapter/OfficeAdapter$ViewHolderGroup;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "txtGroupName", "Landroid/widget/TextView;", "getTxtGroupName", "()Landroid/widget/TextView;", "setTxtGroupName", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class ViewHolderGroup extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtGroupName;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtGroupName() {
            return null;
        }
        
        public final void setTxtGroupName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public ViewHolderGroup(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/vn/ntesco/adapter/OfficeAdapter$ViewHolderItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "setTvTitle", "(Landroid/widget/TextView;)V", "txtAddress", "getTxtAddress", "setTxtAddress", "txtEmail", "getTxtEmail", "setTxtEmail", "txtFax", "getTxtFax", "setTxtFax", "txtMobile", "getTxtMobile", "setTxtMobile", "txtName", "getTxtName", "setTxtName", "txtWebsite", "getTxtWebsite", "setTxtWebsite", "app_debug"})
    public static final class ViewHolderItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtAddress;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtEmail;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtMobile;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtFax;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtWebsite;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvTitle;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtAddress() {
            return null;
        }
        
        public final void setTxtAddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtEmail() {
            return null;
        }
        
        public final void setTxtEmail(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtMobile() {
            return null;
        }
        
        public final void setTxtMobile(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtFax() {
            return null;
        }
        
        public final void setTxtFax(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtWebsite() {
            return null;
        }
        
        public final void setTxtWebsite(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        public final void setTvTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public ViewHolderItem(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}
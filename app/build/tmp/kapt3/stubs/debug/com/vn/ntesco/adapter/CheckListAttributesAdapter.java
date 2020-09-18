package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020%H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020%H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006/"}, d2 = {"Lcom/vn/ntesco/adapter/CheckListAttributesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/CheckListAttributesAdapter$ViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attribute", "", "getAttribute", "()Ljava/lang/String;", "setAttribute", "(Ljava/lang/String;)V", "attributeList", "", "getAttributeList", "()Ljava/util/List;", "setAttributeList", "(Ljava/util/List;)V", "value", "", "inputAttributeList", "getInputAttributeList", "setInputAttributeList", "isFilled", "", "()Z", "setFilled", "(Z)V", "itemClickListener", "Lcom/vn/ntesco/listener/ItemClickListener;", "getItemClickListener", "()Lcom/vn/ntesco/listener/ItemClickListener;", "setItemClickListener", "(Lcom/vn/ntesco/listener/ItemClickListener;)V", "getMContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CheckListAttributesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.CheckListAttributesAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.listener.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> attributeList;
    private boolean isFilled;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> inputAttributeList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String attribute;
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
    public final java.util.List<java.lang.String> getAttributeList() {
        return null;
    }
    
    public final void setAttributeList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean isFilled() {
        return false;
    }
    
    public final void setFilled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getInputAttributeList() {
        return null;
    }
    
    public final void setInputAttributeList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAttribute() {
        return null;
    }
    
    public final void setAttribute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.CheckListAttributesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.CheckListAttributesAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public CheckListAttributesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/vn/ntesco/adapter/CheckListAttributesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "inputList", "", "", "(Landroid/view/View;Ljava/util/List;)V", "edtInputAttribute", "Landroid/widget/EditText;", "getEdtInputAttribute", "()Landroid/widget/EditText;", "setEdtInputAttribute", "(Landroid/widget/EditText;)V", "inputTextWatcher", "Landroid/text/TextWatcher;", "getInputTextWatcher", "()Landroid/text/TextWatcher;", "setInputTextWatcher", "(Landroid/text/TextWatcher;)V", "tvAttributesLabel", "Landroid/widget/TextView;", "getTvAttributesLabel", "()Landroid/widget/TextView;", "setTvAttributesLabel", "(Landroid/widget/TextView;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvAttributesLabel;
        @org.jetbrains.annotations.NotNull()
        private android.widget.EditText edtInputAttribute;
        @org.jetbrains.annotations.NotNull()
        private android.text.TextWatcher inputTextWatcher;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAttributesLabel() {
            return null;
        }
        
        public final void setTvAttributesLabel(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.EditText getEdtInputAttribute() {
            return null;
        }
        
        public final void setEdtInputAttribute(@org.jetbrains.annotations.NotNull()
        android.widget.EditText p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.TextWatcher getInputTextWatcher() {
            return null;
        }
        
        public final void setInputTextWatcher(@org.jetbrains.annotations.NotNull()
        android.text.TextWatcher p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> inputList) {
            super(null);
        }
    }
}
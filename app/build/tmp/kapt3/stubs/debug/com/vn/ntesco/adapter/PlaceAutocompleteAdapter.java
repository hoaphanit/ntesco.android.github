package com.vn.ntesco.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0003567B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010$\u001a\u00020%J\u001c\u0010&\u001a\u000e\u0012\b\u0012\u00060\u0019R\u00020\u0000\u0018\u00010\u00182\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0012\u0010+\u001a\u00060\u0019R\u00020\u00002\u0006\u0010,\u001a\u00020\u0007J\b\u0010-\u001a\u00020\u0007H\u0016J\u001c\u0010.\u001a\u00020%2\n\u0010/\u001a\u00060\u0002R\u00020\u00002\u0006\u00100\u001a\u00020\u0007H\u0016J\u001c\u00101\u001a\u00060\u0002R\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\b\u0012\u00060\u0019R\u00020\u0000\u0018\u00010\u0018X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010#\u00a8\u00068"}, d2 = {"Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceViewHolder;", "Landroid/widget/Filterable;", "mContext", "Landroid/content/Context;", "layout", "", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "mListener", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutoCompleteInterface;", "(Landroid/content/Context;ILcom/google/android/libraries/places/api/net/PlacesClient;Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutoCompleteInterface;)V", "STYLE_BOLD", "Landroid/text/style/StyleSpan;", "TAG", "", "getLayout", "()I", "getMContext", "()Landroid/content/Context;", "getMListener", "()Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutoCompleteInterface;", "mResultList", "", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutocomplete;", "getMResultList$app_debug", "()Ljava/util/List;", "setMResultList$app_debug", "(Ljava/util/List;)V", "getPlacesClient", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "positionSelected", "getPositionSelected", "setPositionSelected", "(I)V", "clearList", "", "getAutocomplete", "constraint", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemCount", "onBindViewHolder", "mPredictionHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "PlaceAutoCompleteInterface", "PlaceAutocomplete", "PlaceViewHolder", "app_debug"})
public final class PlaceAutocompleteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceViewHolder> implements android.widget.Filterable {
    private final java.lang.String TAG = "PlaceAutocompleteAdapter";
    private final android.text.style.StyleSpan STYLE_BOLD = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete> mResultList;
    private int positionSelected;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    private final int layout = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.libraries.places.api.net.PlacesClient placesClient = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutoCompleteInterface mListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete> getMResultList$app_debug() {
        return null;
    }
    
    public final void setMResultList$app_debug(@org.jetbrains.annotations.Nullable()
    java.util.List<com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete> p0) {
    }
    
    public final int getPositionSelected() {
        return 0;
    }
    
    public final void setPositionSelected(int p0) {
    }
    
    public final void clearList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    private final java.util.List<com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete> getAutocomplete(java.lang.CharSequence constraint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceViewHolder mPredictionHolder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete getItem(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final int getLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.libraries.places.api.net.PlacesClient getPlacesClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutoCompleteInterface getMListener() {
        return null;
    }
    
    public PlaceAutocompleteAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, int layout, @org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.net.PlacesClient placesClient, @org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutoCompleteInterface mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005R\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutoCompleteInterface;", "", "onPlaceClick", "", "place", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutocomplete;", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;", "app_debug"})
    public static abstract interface PlaceAutoCompleteInterface {
        
        public abstract void onPlaceClick(@org.jetbrains.annotations.NotNull()
        com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete place);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;Landroid/view/View;)V", "mAddress", "Landroid/widget/TextView;", "getMAddress", "()Landroid/widget/TextView;", "setMAddress", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class PlaceViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView mAddress;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMAddress() {
            return null;
        }
        
        public final void setMAddress(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public PlaceViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    /**
     * * Holder for Places Geo Data Autocomplete API results.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutocomplete;", "", "placeId", "", "description", "isSelected", "", "(Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V", "getDescription", "()Ljava/lang/CharSequence;", "setDescription", "(Ljava/lang/CharSequence;)V", "()Z", "setSelected", "(Z)V", "getPlaceId", "setPlaceId", "toString", "", "app_debug"})
    public final class PlaceAutocomplete {
        @org.jetbrains.annotations.NotNull()
        private java.lang.CharSequence placeId;
        @org.jetbrains.annotations.NotNull()
        private java.lang.CharSequence description;
        private boolean isSelected;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence getPlaceId() {
            return null;
        }
        
        public final void setPlaceId(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.CharSequence getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence p0) {
        }
        
        public final boolean isSelected() {
            return false;
        }
        
        public final void setSelected(boolean p0) {
        }
        
        public PlaceAutocomplete(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence placeId, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence description, boolean isSelected) {
            super();
        }
    }
}
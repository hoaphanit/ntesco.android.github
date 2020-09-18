package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00101\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002002\u0006\u00101\u001a\u000206H\u0016J\u0012\u00107\u001a\u0002002\b\u00108\u001a\u0004\u0018\u000102H\u0014J\u0014\u00109\u001a\u0002002\n\u0010:\u001a\u00060;R\u00020\fH\u0016J\b\u0010<\u001a\u000200H\u0014J\b\u0010=\u001a\u000200H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006>"}, d2 = {"Lcom/vn/ntesco/activity/AddAddressDialog;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutoCompleteInterface;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "()V", "isSelected", "", "()Z", "setSelected", "(Z)V", "mAdapter", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;", "getMAdapter$app_debug", "()Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;", "setMAdapter$app_debug", "(Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter;)V", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMGoogleApiClient", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMGoogleApiClient", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "placeAddress", "", "getPlaceAddress", "()Ljava/lang/String;", "setPlaceAddress", "(Ljava/lang/String;)V", "placeDetail", "Lcom/google/android/libraries/places/api/model/Place;", "getPlaceDetail", "()Lcom/google/android/libraries/places/api/model/Place;", "setPlaceDetail", "(Lcom/google/android/libraries/places/api/model/Place;)V", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "getPlacesClient", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "setPlacesClient", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "txtAddress", "Landroid/widget/EditText;", "getTxtAddress", "()Landroid/widget/EditText;", "setTxtAddress", "(Landroid/widget/EditText;)V", "onConnected", "", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "", "onCreate", "savedInstanceState", "onPlaceClick", "place", "Lcom/vn/ntesco/adapter/PlaceAutocompleteAdapter$PlaceAutocomplete;", "onStart", "onStop", "app_debug"})
public final class AddAddressDialog extends androidx.fragment.app.FragmentActivity implements com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutoCompleteInterface, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.adapter.PlaceAutocompleteAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.libraries.places.api.net.PlacesClient placesClient;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText txtAddress;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.libraries.places.api.model.Place placeDetail;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String placeAddress;
    private boolean isSelected;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.adapter.PlaceAutocompleteAdapter getMAdapter$app_debug() {
        return null;
    }
    
    public final void setMAdapter$app_debug(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.adapter.PlaceAutocompleteAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.libraries.places.api.net.PlacesClient getPlacesClient() {
        return null;
    }
    
    public final void setPlacesClient(@org.jetbrains.annotations.NotNull()
    com.google.android.libraries.places.api.net.PlacesClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.common.api.GoogleApiClient getMGoogleApiClient() {
        return null;
    }
    
    public final void setMGoogleApiClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTxtAddress() {
        return null;
    }
    
    public final void setTxtAddress(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.libraries.places.api.model.Place getPlaceDetail() {
        return null;
    }
    
    public final void setPlaceDetail(@org.jetbrains.annotations.Nullable()
    com.google.android.libraries.places.api.model.Place p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaceAddress() {
        return null;
    }
    
    public final void setPlaceAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onPlaceClick(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.PlaceAutocompleteAdapter.PlaceAutocomplete place) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
    }
    
    public AddAddressDialog() {
        super();
    }
}
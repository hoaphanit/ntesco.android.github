package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010>\u001a\u00020?J\b\u0010@\u001a\u00020\nH\u0016J\u0006\u0010A\u001a\u00020BJ\u0006\u0010.\u001a\u00020BJ\u0010\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010\u0006J\u000e\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020GJ\u0012\u0010H\u001a\u00020B2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010K\u001a\u00020B2\u0006\u0010L\u001a\u00020!H\u0016J$\u0010M\u001a\u00020B2\u0006\u0010N\u001a\u00020J2\b\u0010O\u001a\u0004\u0018\u00010P2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0006\u0010S\u001a\u00020BR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010R\u001a\u00105\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R\u001a\u00108\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R\u001a\u0010;\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010\u00a8\u0006T"}, d2 = {"Lcom/vn/ntesco/fragment/ContactFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Landroid/view/View$OnClickListener;", "()V", "FACEBOOK_URL", "", "getFACEBOOK_URL", "()Ljava/lang/String;", "ZOOM_VALUE", "", "btnSend", "Landroid/widget/TextView;", "getBtnSend", "()Landroid/widget/TextView;", "setBtnSend", "(Landroid/widget/TextView;)V", "edtContent", "Landroid/widget/EditText;", "getEdtContent", "()Landroid/widget/EditText;", "setEdtContent", "(Landroid/widget/EditText;)V", "edtEmai", "getEdtEmai", "setEdtEmai", "edtFullName", "getEdtFullName", "setEdtFullName", "edtTitle", "getEdtTitle", "setEdtTitle", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "getMMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "setScrollView", "(Landroid/widget/ScrollView;)V", "socialNetworks", "Lcom/vn/ntesco/model/SocialNetworks;", "getSocialNetworks", "()Lcom/vn/ntesco/model/SocialNetworks;", "setSocialNetworks", "(Lcom/vn/ntesco/model/SocialNetworks;)V", "tvFacebook", "getTvFacebook", "setTvFacebook", "tvLinked", "getTvLinked", "setTvLinked", "tvTwitter", "getTvTwitter", "setTvTwitter", "tvYoutube", "getTvYoutube", "setTvYoutube", "checkValidate", "", "getLayoutResource", "getOffices", "", "goToFaceBookApp", "url", "initMarkerInMap", "officesResponse", "Lcom/vn/ntesco/model/Response/OfficesResponse;", "onClick", "v", "Landroid/view/View;", "onMapReady", "googleMap", "onSetBodyView", "view", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "sendContact", "app_debug"})
public final class ContactFragment extends com.vn.ntesco.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback, android.view.View.OnClickListener {
    private final int ZOOM_VALUE = 15;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ScrollView scrollView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtFullName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtEmai;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtTitle;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtContent;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView btnSend;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvFacebook;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvLinked;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvTwitter;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvYoutube;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.model.SocialNetworks socialNetworks;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FACEBOOK_URL = "https://www.facebook.com/";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getMMap() {
        return null;
    }
    
    public final void setMMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ScrollView getScrollView() {
        return null;
    }
    
    public final void setScrollView(@org.jetbrains.annotations.NotNull()
    android.widget.ScrollView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtFullName() {
        return null;
    }
    
    public final void setEdtFullName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtEmai() {
        return null;
    }
    
    public final void setEdtEmai(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtTitle() {
        return null;
    }
    
    public final void setEdtTitle(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtContent() {
        return null;
    }
    
    public final void setEdtContent(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBtnSend() {
        return null;
    }
    
    public final void setBtnSend(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvFacebook() {
        return null;
    }
    
    public final void setTvFacebook(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvLinked() {
        return null;
    }
    
    public final void setTvLinked(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTwitter() {
        return null;
    }
    
    public final void setTvTwitter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvYoutube() {
        return null;
    }
    
    public final void setTvYoutube(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.SocialNetworks getSocialNetworks() {
        return null;
    }
    
    public final void setSocialNetworks(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.SocialNetworks p0) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public int getLayoutResource() {
        return 0;
    }
    
    @java.lang.Override()
    public void onSetBodyView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void sendContact() {
    }
    
    public final boolean checkValidate() {
        return false;
    }
    
    public final void getOffices() {
    }
    
    public final void getSocialNetworks() {
    }
    
    public final void initMarkerInMap(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.model.Response.OfficesResponse officesResponse) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFACEBOOK_URL() {
        return null;
    }
    
    public final void goToFaceBookApp(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public ContactFragment() {
        super();
    }
}
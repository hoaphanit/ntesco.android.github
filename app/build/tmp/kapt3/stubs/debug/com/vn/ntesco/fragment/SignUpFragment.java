package com.vn.ntesco.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 e2\u00020\u0001:\u0001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010S\u001a\u000201H\u0002J\b\u0010T\u001a\u00020\u0004H\u0016J\"\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u00042\u0006\u0010X\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J$\u0010[\u001a\u00020V2\u0006\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0006\u0010b\u001a\u00020VJ\u0006\u0010c\u001a\u00020VJ\u0006\u0010d\u001a\u00020VR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\'\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001a\u0010G\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u00108\"\u0004\bI\u0010:R\u001a\u0010J\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u00108\"\u0004\bL\u0010:R\u001a\u0010M\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u00108\"\u0004\bO\u0010:R\u001a\u0010P\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:\u00a8\u0006f"}, d2 = {"Lcom/vn/ntesco/fragment/SignUpFragment;", "Lcom/vn/ntesco/base/BaseFragment;", "()V", "REGISTER_REQUEST_CODE", "", "getREGISTER_REQUEST_CODE", "()I", "setREGISTER_REQUEST_CODE", "(I)V", "btnSignUp", "Landroidx/cardview/widget/CardView;", "getBtnSignUp", "()Landroidx/cardview/widget/CardView;", "setBtnSignUp", "(Landroidx/cardview/widget/CardView;)V", "edtCompany", "Landroid/widget/EditText;", "getEdtCompany", "()Landroid/widget/EditText;", "setEdtCompany", "(Landroid/widget/EditText;)V", "edtCountry", "getEdtCountry", "setEdtCountry", "edtEmail", "getEdtEmail", "setEdtEmail", "edtFirstName", "getEdtFirstName", "setEdtFirstName", "edtLastName", "getEdtLastName", "setEdtLastName", "edtLocation", "getEdtLocation", "setEdtLocation", "edtPassword", "getEdtPassword", "setEdtPassword", "edtPhone", "getEdtPhone", "setEdtPhone", "edtRePassword", "getEdtRePassword", "setEdtRePassword", "edtUserName", "getEdtUserName", "setEdtUserName", "isUpdate", "", "()Z", "setUpdate", "(Z)V", "labelPass", "Landroid/widget/TextView;", "getLabelPass", "()Landroid/widget/TextView;", "setLabelPass", "(Landroid/widget/TextView;)V", "labelRePass", "getLabelRePass", "setLabelRePass", "mUser", "Lcom/vn/ntesco/model/User;", "getMUser", "()Lcom/vn/ntesco/model/User;", "setMUser", "(Lcom/vn/ntesco/model/User;)V", "tvChangePass", "getTvChangePass", "setTvChangePass", "tvEmail", "getTvEmail", "setTvEmail", "tvPhone", "getTvPhone", "setTvPhone", "tvSignUp", "getTvSignUp", "setTvSignUp", "tvUserName", "getTvUserName", "setTvUserName", "checkValidate", "getLayoutResource", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onSetBodyView", "view", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "signUp", "updateProfile", "verifyPhone", "Companion", "app_debug"})
public final class SignUpFragment extends com.vn.ntesco.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtFirstName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtLastName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtUserName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtPassword;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtRePassword;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtEmail;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtPhone;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtCompany;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtCountry;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText edtLocation;
    @org.jetbrains.annotations.NotNull()
    public androidx.cardview.widget.CardView btnSignUp;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvSignUp;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvChangePass;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView labelPass;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView labelRePass;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvUserName;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvPhone;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvEmail;
    private int REGISTER_REQUEST_CODE;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.model.User mUser;
    private boolean isUpdate;
    public static final com.vn.ntesco.fragment.SignUpFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtFirstName() {
        return null;
    }
    
    public final void setEdtFirstName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtLastName() {
        return null;
    }
    
    public final void setEdtLastName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtUserName() {
        return null;
    }
    
    public final void setEdtUserName(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtPassword() {
        return null;
    }
    
    public final void setEdtPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtRePassword() {
        return null;
    }
    
    public final void setEdtRePassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtEmail() {
        return null;
    }
    
    public final void setEdtEmail(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtPhone() {
        return null;
    }
    
    public final void setEdtPhone(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtCompany() {
        return null;
    }
    
    public final void setEdtCompany(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtCountry() {
        return null;
    }
    
    public final void setEdtCountry(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEdtLocation() {
        return null;
    }
    
    public final void setEdtLocation(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.cardview.widget.CardView getBtnSignUp() {
        return null;
    }
    
    public final void setBtnSignUp(@org.jetbrains.annotations.NotNull()
    androidx.cardview.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvSignUp() {
        return null;
    }
    
    public final void setTvSignUp(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvChangePass() {
        return null;
    }
    
    public final void setTvChangePass(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLabelPass() {
        return null;
    }
    
    public final void setLabelPass(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getLabelRePass() {
        return null;
    }
    
    public final void setLabelRePass(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvUserName() {
        return null;
    }
    
    public final void setTvUserName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvPhone() {
        return null;
    }
    
    public final void setTvPhone(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvEmail() {
        return null;
    }
    
    public final void setTvEmail(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    public final int getREGISTER_REQUEST_CODE() {
        return 0;
    }
    
    public final void setREGISTER_REQUEST_CODE(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.User getMUser() {
        return null;
    }
    
    public final void setMUser(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User p0) {
    }
    
    public final boolean isUpdate() {
        return false;
    }
    
    public final void setUpdate(boolean p0) {
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
    
    public final void signUp() {
    }
    
    public final void updateProfile() {
    }
    
    public final void verifyPhone() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final boolean checkValidate() {
        return false;
    }
    
    public SignUpFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.vn.ntesco.fragment.SignUpFragment newInstance(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User user) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/fragment/SignUpFragment$Companion;", "", "()V", "newInstance", "Lcom/vn/ntesco/fragment/SignUpFragment;", "user", "Lcom/vn/ntesco/model/User;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.fragment.SignUpFragment newInstance(@org.jetbrains.annotations.Nullable()
        com.vn.ntesco.model.User user) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
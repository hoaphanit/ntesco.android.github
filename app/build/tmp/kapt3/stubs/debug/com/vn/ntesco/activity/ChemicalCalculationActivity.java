package com.vn.ntesco.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0002J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020&H\u0016J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020&H\u0016J\u0012\u00107\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006;"}, d2 = {"Lcom/vn/ntesco/activity/ChemicalCalculationActivity;", "Lcom/vn/ntesco/base/BaseHeaderActivity;", "()V", "chemicalSelected", "Lcom/vn/ntesco/model/Chemicals;", "getChemicalSelected", "()Lcom/vn/ntesco/model/Chemicals;", "setChemicalSelected", "(Lcom/vn/ntesco/model/Chemicals;)V", "chemicalsAdapter", "Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;", "getChemicalsAdapter", "()Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;", "setChemicalsAdapter", "(Lcom/vn/ntesco/adapter/adaptersSpinner/DataSpinnerAdapter;)V", "currencyAdapter", "", "getCurrencyAdapter", "setCurrencyAdapter", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "setScrollView", "(Landroid/widget/ScrollView;)V", "switchButton", "Lcom/vn/ntesco/views/NTescoSwitchButton;", "getSwitchButton", "()Lcom/vn/ntesco/views/NTescoSwitchButton;", "setSwitchButton", "(Lcom/vn/ntesco/views/NTescoSwitchButton;)V", "tvCalculator", "Landroid/widget/TextView;", "getTvCalculator", "()Landroid/widget/TextView;", "setTvCalculator", "(Landroid/widget/TextView;)V", "type", "", "getType", "()I", "setType", "(I)V", "calculatorLiquidChemicals", "", "calculatorPowderChemicals", "checkValidate", "", "clearEnterText", "getChemicals", "getLayoutContent", "onClick", "v", "Landroid/view/View;", "setBackgroundHeader", "setBody", "savedInstanceState", "Landroid/os/Bundle;", "setTitle", "app_debug"})
public final class ChemicalCalculationActivity extends com.vn.ntesco.base.BaseHeaderActivity {
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.views.NTescoSwitchButton switchButton;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ScrollView scrollView;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView tvCalculator;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.Chemicals> chemicalsAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<java.lang.String> currencyAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.vn.ntesco.model.Chemicals chemicalSelected;
    private int type;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.views.NTescoSwitchButton getSwitchButton() {
        return null;
    }
    
    public final void setSwitchButton(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.views.NTescoSwitchButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ScrollView getScrollView() {
        return null;
    }
    
    public final void setScrollView(@org.jetbrains.annotations.NotNull()
    android.widget.ScrollView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvCalculator() {
        return null;
    }
    
    public final void setTvCalculator(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.Chemicals> getChemicalsAdapter() {
        return null;
    }
    
    public final void setChemicalsAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<com.vn.ntesco.model.Chemicals> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<java.lang.String> getCurrencyAdapter() {
        return null;
    }
    
    public final void setCurrencyAdapter(@org.jetbrains.annotations.NotNull()
    com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.Chemicals getChemicalSelected() {
        return null;
    }
    
    public final void setChemicalSelected(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.Chemicals p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String setTitle() {
        return null;
    }
    
    @java.lang.Override()
    public int getLayoutContent() {
        return 0;
    }
    
    @java.lang.Override()
    public int setBackgroundHeader() {
        return 0;
    }
    
    @java.lang.Override()
    public void setBody(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void getChemicals() {
    }
    
    private final void calculatorPowderChemicals() {
    }
    
    private final void calculatorLiquidChemicals() {
    }
    
    private final void clearEnterText() {
    }
    
    private final boolean checkValidate() {
        return false;
    }
    
    public ChemicalCalculationActivity() {
        super();
    }
}
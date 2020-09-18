package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\tJ\u0016\u0010\u001c\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\rJ\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000fJ\u0016\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tJ\u0014\u0010\"\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010%\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010&\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/vn/ntesco/utils/PrefUtils;", "", "()V", "prefUtils", "preferences", "Landroid/content/SharedPreferences;", "checkForNullKey", "", "key", "", "checkForNullValue", "value", "getBoolean", "", "getInt", "", "getLanguage", "getListFormsProcessing", "", "Lcom/vn/ntesco/model/RawWaterType;", "getListGuarantees", "getListProduct", "getListWarrantyStatus", "context", "Landroid/content/Context;", "getListWaterType", "getString", "getTokenFirebase", "putBoolean", "b", "putInt", "putString", "saveLanguage", "language", "saveListFormsProcessing", "modelList", "saveListGuarantees", "saveListProduct", "saveListWaterType", "saveTokenFirebase", "token", "Companion", "Holder", "app_debug"})
public final class PrefUtils {
    private com.vn.ntesco.utils.PrefUtils prefUtils;
    private android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String NTESCO = "NTESCO";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER = "USER";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WATER_TYPE = "WATER_TYPE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PRODUCTS = "PRODUCTS";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ABOUT = "ABOUT";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String OFFICES = "OFFICES";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CATEGORY = "CATEGORY";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TOKEN_FIREBASE = "TOKEN_FIREBASE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOLUTION_PRODUCT = "SOLUTION_PRODUCT";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PRODUCT_DETAIL_LIST = "PRODUCT_DETAIL_LIST";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LANGUAGE = "LANGUAGE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BANNER_SOLUTION = "BANNER_SOLUTION";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String FORMS_PROCESSING = "FORMS_PROCESSING";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String GUARANTEES = "GUARANTEES";
    @org.jetbrains.annotations.Nullable()
    private static com.vn.ntesco.utils.PrefUtils pref;
    public static final com.vn.ntesco.utils.PrefUtils.Companion Companion = null;
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean b) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    public final void saveListWaterType(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> modelList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getListWaterType() {
        return null;
    }
    
    public final void saveListProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> modelList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getListProduct() {
        return null;
    }
    
    public final void saveListFormsProcessing(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> modelList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getListFormsProcessing() {
        return null;
    }
    
    public final void saveListGuarantees(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vn.ntesco.model.RawWaterType> modelList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getListGuarantees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vn.ntesco.model.RawWaterType> getListWarrantyStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void saveTokenFirebase(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenFirebase() {
        return null;
    }
    
    public final void saveLanguage(@org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    /**
     * * null keys would corrupt the shared pref file and make them unreadable this is a preventive measure
     *     *
     *     * @param key pref key
     */
    public final void checkForNullKey(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    /**
     * * null keys would corrupt the shared pref file and make them unreadable this is a preventive measure
     *     *
     *     * @param value pref key
     */
    public final void checkForNullValue(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public PrefUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.vn.ntesco.utils.PrefUtils getInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vn/ntesco/utils/PrefUtils$Holder;", "", "()V", "INSTANCE", "Lcom/vn/ntesco/utils/PrefUtils;", "getINSTANCE", "()Lcom/vn/ntesco/utils/PrefUtils;", "app_debug"})
    static final class Holder {
        @org.jetbrains.annotations.NotNull()
        private static final com.vn.ntesco.utils.PrefUtils INSTANCE = null;
        public static final com.vn.ntesco.utils.PrefUtils.Holder INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.PrefUtils getINSTANCE() {
            return null;
        }
        
        private Holder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\'\u001a\u00020\"H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006("}, d2 = {"Lcom/vn/ntesco/utils/PrefUtils$Companion;", "", "()V", "ABOUT", "", "getABOUT", "()Ljava/lang/String;", "BANNER_SOLUTION", "getBANNER_SOLUTION", "CATEGORY", "getCATEGORY", "FORMS_PROCESSING", "getFORMS_PROCESSING", "GUARANTEES", "getGUARANTEES", "LANGUAGE", "getLANGUAGE", "NTESCO", "getNTESCO", "OFFICES", "getOFFICES", "PRODUCTS", "getPRODUCTS", "PRODUCT_DETAIL_LIST", "getPRODUCT_DETAIL_LIST", "SOLUTION_PRODUCT", "getSOLUTION_PRODUCT", "TOKEN_FIREBASE", "getTOKEN_FIREBASE", "USER", "getUSER", "WATER_TYPE", "getWATER_TYPE", "pref", "Lcom/vn/ntesco/utils/PrefUtils;", "getPref", "()Lcom/vn/ntesco/utils/PrefUtils;", "setPref", "(Lcom/vn/ntesco/utils/PrefUtils;)V", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNTESCO() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWATER_TYPE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPRODUCTS() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getABOUT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOFFICES() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCATEGORY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTOKEN_FIREBASE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSOLUTION_PRODUCT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPRODUCT_DETAIL_LIST() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLANGUAGE() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBANNER_SOLUTION() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFORMS_PROCESSING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGUARANTEES() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.vn.ntesco.utils.PrefUtils getPref() {
            return null;
        }
        
        public final void setPref(@org.jetbrains.annotations.Nullable()
        com.vn.ntesco.utils.PrefUtils p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.PrefUtils getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}
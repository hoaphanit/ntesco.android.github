package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/vn/ntesco/utils/UserCache;", "", "()V", "userInfo", "Lcom/vn/ntesco/model/User;", "getUserInfo", "()Lcom/vn/ntesco/model/User;", "setUserInfo", "(Lcom/vn/ntesco/model/User;)V", "getColorUser", "", "isCustomerUser", "", "isEmployee", "isLogin", "isManager", "isTechnical", "saveUserInfo", "", "app_debug"})
public final class UserCache {
    @org.jetbrains.annotations.Nullable()
    private static com.vn.ntesco.model.User userInfo;
    public static final com.vn.ntesco.utils.UserCache INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.vn.ntesco.model.User getUserInfo() {
        return null;
    }
    
    public final void setUserInfo(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User p0) {
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    public final int getColorUser() {
        return 0;
    }
    
    public final boolean isCustomerUser() {
        return false;
    }
    
    public final boolean isManager() {
        return false;
    }
    
    public final boolean isTechnical() {
        return false;
    }
    
    public final boolean isEmployee() {
        return false;
    }
    
    /**
     * * Store new_process user info into cache
     */
    public final void saveUserInfo(@org.jetbrains.annotations.Nullable()
    com.vn.ntesco.model.User userInfo) {
    }
    
    private UserCache() {
        super();
    }
}
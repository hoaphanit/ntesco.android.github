package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/vn/ntesco/utils/PdfUtils;", "", "()V", "getSeekableFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "activity", "Landroid/app/Activity;", "file", "Ljava/io/File;", "openPdfFromUrl", "", "pdfUrl", "", "pdfDownloadListener", "Lcom/vn/ntesco/utils/PdfUtils$PdfDownloadlistener;", "PdfDownloadlistener", "app_debug"})
public final class PdfUtils {
    public static final com.vn.ntesco.utils.PdfUtils INSTANCE = null;
    
    public final void openPdfFromUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String pdfUrl, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.vn.ntesco.utils.PdfUtils.PdfDownloadlistener pdfDownloadListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.ParcelFileDescriptor getSeekableFileDescriptor(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private PdfUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/utils/PdfUtils$PdfDownloadlistener;", "", "onError", "", "error", "", "onSuccess", "file", "Ljava/io/File;", "app_debug"})
    public static abstract interface PdfDownloadlistener {
        
        public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
        java.io.File file);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
    }
}
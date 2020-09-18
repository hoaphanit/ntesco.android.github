package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/vn/ntesco/utils/ImageUtils;", "", "()V", "REQUIRED_SIZE", "", "decodeAndResizeFile", "Landroid/graphics/Bitmap;", "photoPath", "", "getPathImage", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "isDownloadsDocument", "", "isExternalStorageDocument", "isMediaDocument", "resizeBitmap", "rotateBitmap", "bitmap", "degrees", "app_debug"})
public final class ImageUtils {
    private static final int REQUIRED_SIZE = 500000;
    public static final com.vn.ntesco.utils.ImageUtils INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap decodeAndResizeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String photoPath) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap resizeBitmap(@org.jetbrains.annotations.NotNull()
    java.lang.String photoPath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap rotateBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, int degrees) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"NewApi"})
    public final java.lang.String getPathImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) throws java.net.URISyntaxException {
        return null;
    }
    
    /**
     * * @param uri The Uri to check.
     *     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    public final boolean isExternalStorageDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * * @param uri The Uri to check.
     *     * @return Whether the Uri authority is DownloadsProvider.
     */
    public final boolean isDownloadsDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    /**
     * * @param uri The Uri to check.
     *     * @return Whether the Uri authority is MediaProvider.
     */
    public final boolean isMediaDocument(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return false;
    }
    
    private ImageUtils() {
        super();
    }
}
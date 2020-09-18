package com.vn.ntesco.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 _2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004^_`aB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\bH\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\b\u00105\u001a\u00020/H\u0002J\u0012\u00106\u001a\u00020/2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\"\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u00152\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@H\u0016J\u0012\u0010A\u001a\u00020/2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u0010B\u001a\u00020C2\b\u00107\u001a\u0004\u0018\u000108H\u0016J \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030E2\u0006\u0010F\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u000108H\u0016J&\u0010H\u001a\u0004\u0018\u00010\b2\u0006\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u00107\u001a\u0004\u0018\u000108H\u0016J \u0010M\u001a\u00020/2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00030E2\b\u0010O\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010P\u001a\u00020/2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030EH\u0016J+\u0010R\u001a\u00020/2\u0006\u0010:\u001a\u00020\u00152\f\u0010S\u001a\b\u0012\u0004\u0012\u00020$0T2\u0006\u0010U\u001a\u00020VH\u0016\u00a2\u0006\u0002\u0010WJ\u0010\u0010X\u001a\u00020/2\u0006\u0010Y\u001a\u000208H\u0016J\u0010\u0010Z\u001a\u00020/2\u0006\u00100\u001a\u00020\bH\u0002J\b\u0010[\u001a\u00020/H\u0002J\b\u0010)\u001a\u00020/H\u0002J\u0010\u0010\\\u001a\u00020/2\u0006\u0010]\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006b"}, d2 = {"Lcom/vn/ntesco/utils/ImagePicker;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Landroid/database/Cursor;", "()V", "adapter", "Lcom/asksira/bsimagepicker/ImageTileAdapter;", "bottomBarView", "Landroid/view/View;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "currentPhotoUri", "Landroid/net/Uri;", "dismissOnSelect", "", "<set-?>", "Landroid/widget/TextView;", "emptyTextView", "getEmptyTextView", "()Landroid/widget/TextView;", "gridSpacing", "", "isMultiSelection", "maximumDisplayingImages", "maximumMultiSelectCount", "minimumMultiSelectCount", "multiSelectBarBgColor", "multiSelectDoneTextColor", "multiSelectTextColor", "onMultiImageSelectedListener", "Lcom/vn/ntesco/utils/ImagePicker$OnMultiImageSelectedListener;", "onSingleImageSelectedListener", "Lcom/vn/ntesco/utils/ImagePicker$OnSingleImageSelectedListener;", "overSelectTextColor", "peekHeight", "providerAuthority", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "showCameraTile", "showGalleryTile", "showOverSelectMessage", "spanCount", "tag1", "tvDone", "tvMultiSelectMessage", "bindViews", "", "rootView", "createImageFile", "Ljava/io/File;", "launchCamera", "loadConfigFromBuilder", "notifyGallery", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateLoader", "Landroidx/loader/content/Loader;", "id", "args", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadFinished", "loader", "cursor", "onLoaderReset", "p0", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "setupBottomBar", "setupRecyclerView", "updateSelectCount", "newCount", "Builder", "Companion", "OnMultiImageSelectedListener", "OnSingleImageSelectedListener", "app_debug"})
public final class ImagePicker extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements androidx.loader.app.LoaderManager.LoaderCallbacks<android.database.Cursor> {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private android.view.View bottomBarView;
    private android.widget.TextView tvDone;
    private android.widget.TextView tvMultiSelectMessage;
    
    /**
     * * Returns the TextView that appears when there is no item,
     *     * So that user can customize its styles, etc.
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView emptyTextView;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<?> bottomSheetBehavior;
    private com.asksira.bsimagepicker.ImageTileAdapter adapter;
    private java.lang.String tag1;
    private com.vn.ntesco.utils.ImagePicker.OnSingleImageSelectedListener onSingleImageSelectedListener;
    private com.vn.ntesco.utils.ImagePicker.OnMultiImageSelectedListener onMultiImageSelectedListener;
    private boolean isMultiSelection;
    private boolean dismissOnSelect;
    private android.net.Uri currentPhotoUri;
    private int maximumDisplayingImages;
    private int peekHeight;
    private int minimumMultiSelectCount;
    private int maximumMultiSelectCount;
    private java.lang.String providerAuthority;
    private boolean showCameraTile;
    private boolean showGalleryTile;
    private int spanCount;
    private int gridSpacing;
    private int multiSelectBarBgColor;
    private int multiSelectTextColor;
    private int multiSelectDoneTextColor;
    private boolean showOverSelectMessage;
    private int overSelectTextColor;
    private static final int LOADER_ID = 1000;
    private static final int PERMISSION_READ_STORAGE = 2001;
    private static final int PERMISSION_CAMERA = 2002;
    private static final int PERMISSION_WRITE_STORAGE = 2003;
    private static final int REQUEST_TAKE_PHOTO = 3001;
    private static final int REQUEST_SELECT_FROM_GALLERY = 3002;
    public static final com.vn.ntesco.utils.ImagePicker.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getEmptyTextView() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * * Here we make the bottom bar fade out when the Dialog is being slided down.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * * Here we create and setup the bottom bar if in multi-selection mode.
     */
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.loader.content.Loader<android.database.Cursor> onCreateLoader(int id, @org.jetbrains.annotations.Nullable()
    android.os.Bundle args) {
        return null;
    }
    
    @java.lang.Override()
    public void onLoadFinished(@org.jetbrains.annotations.NotNull()
    androidx.loader.content.Loader<android.database.Cursor> loader, @org.jetbrains.annotations.Nullable()
    android.database.Cursor cursor) {
    }
    
    @java.lang.Override()
    public void onLoaderReset(@org.jetbrains.annotations.NotNull()
    androidx.loader.content.Loader<android.database.Cursor> p0) {
    }
    
    private final void loadConfigFromBuilder() {
    }
    
    private final void bindViews(android.view.View rootView) {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupBottomBar(android.view.View rootView) {
    }
    
    private final void launchCamera() {
    }
    
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    private final void notifyGallery() {
    }
    
    private final void updateSelectCount(int newCount) {
    }
    
    private final void showOverSelectMessage() {
    }
    
    public ImagePicker() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/vn/ntesco/utils/ImagePicker$OnSingleImageSelectedListener;", "", "onSingleImageSelected", "", "uri", "Landroid/net/Uri;", "tag", "", "app_debug"})
    public static abstract interface OnSingleImageSelectedListener {
        
        public abstract void onSingleImageSelected(@org.jetbrains.annotations.Nullable()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String tag);
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lcom/vn/ntesco/utils/ImagePicker$OnMultiImageSelectedListener;", "", "onMultiImageSelected", "", "uriList", "", "Landroid/net/Uri;", "tag", "", "app_debug"})
    public static abstract interface OnMultiImageSelectedListener {
        
        public abstract void onMultiImageSelected(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends android.net.Uri> uriList, @org.jetbrains.annotations.Nullable()
        java.lang.String tag);
    }
    
    /**
     * * Builder of the BSImagePicker.
     *     * Caller should always create the dialog using this builder.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0000J\u0006\u0010\u001c\u001a\u00020\u0000J\u0006\u0010\t\u001a\u00020\u0000J\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\bJ\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\bJ\u0010\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\bJ\u0010\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\bJ\u0010\u0010%\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\bJ\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/vn/ntesco/utils/ImagePicker$Builder;", "", "providerAuthority", "", "(Ljava/lang/String;)V", "dismissOnSelect", "", "gridSpacing", "", "isMultiSelect", "maximumDisplayingImages", "maximumMultiSelectCount", "minimumMultiSelectCount", "multiSelectBarBgColor", "multiSelectDoneTextColor", "multiSelectTextColor", "overSelectTextColor", "peekHeight", "showCameraTile", "showGalleryTile", "showOverSelectMessage", "spanCount", "tag", "build", "Lcom/vn/ntesco/utils/ImagePicker;", "disableOverSelectionMessage", "dontDismissOnSelect", "hideCameraTile", "hideGalleryTile", "setGridSpacing", "setMaximumDisplayingImages", "setMaximumMultiSelectCount", "setMinimumMultiSelectCount", "setMultiSelectBarBgColor", "setMultiSelectDoneTextColor", "setMultiSelectTextColor", "setOverSelectTextColor", "setPeekHeight", "setSpanCount", "setTag", "app_debug"})
    public static final class Builder {
        private java.lang.String tag;
        private boolean isMultiSelect;
        private boolean dismissOnSelect;
        private int maximumDisplayingImages;
        private int minimumMultiSelectCount;
        private int maximumMultiSelectCount;
        private boolean showCameraTile;
        private boolean showGalleryTile;
        private int peekHeight;
        private int spanCount;
        private int gridSpacing;
        private int multiSelectBarBgColor;
        private int multiSelectTextColor;
        private int multiSelectDoneTextColor;
        private boolean showOverSelectMessage;
        private int overSelectTextColor;
        private final java.lang.String providerAuthority = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder isMultiSelect() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder dontDismissOnSelect() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMaximumDisplayingImages(int maximumDisplayingImages) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMinimumMultiSelectCount(int minimumMultiSelectCount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMaximumMultiSelectCount(int maximumMultiSelectCount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setGridSpacing(@androidx.annotation.Px()
        int gridSpacing) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMultiSelectBarBgColor(@androidx.annotation.ColorRes()
        int multiSelectBarBgColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setTag(@org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMultiSelectDoneTextColor(@androidx.annotation.ColorRes()
        int multiSelectDoneTextColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setMultiSelectTextColor(@androidx.annotation.ColorRes()
        int multiSelectTextColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setOverSelectTextColor(@androidx.annotation.ColorRes()
        int overSelectTextColor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setPeekHeight(@androidx.annotation.Px()
        int peekHeight) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder hideCameraTile() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder hideGalleryTile() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder disableOverSelectionMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker.Builder setSpanCount(int spanCount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vn.ntesco.utils.ImagePicker build() {
            return null;
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        java.lang.String providerAuthority) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/vn/ntesco/utils/ImagePicker$Companion;", "", "()V", "LOADER_ID", "", "PERMISSION_CAMERA", "PERMISSION_READ_STORAGE", "PERMISSION_WRITE_STORAGE", "REQUEST_SELECT_FROM_GALLERY", "REQUEST_TAKE_PHOTO", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.vn.ntesco.utils

import android.annotation.SuppressLint
import android.content.ContentUris
import android.content.Context
import android.database.Cursor
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.DocumentsContract
import android.provider.MediaStore
import java.io.*
import java.net.URISyntaxException

object ImageUtils {
    private val REQUIRED_SIZE = 500000
    fun decodeAndResizeFile(photoPath: String): Bitmap? {
        try {
            // Decode image size
            val o = BitmapFactory.Options()
            o.inJustDecodeBounds = true
            BitmapFactory.decodeFile(photoPath, o)
            o.inJustDecodeBounds = false
            // The new size we want to scale to
            val REQUIRED_SIZE = 600
            // Find the correct scale value. It should be the power of 2.
            var width_tmp = o.outWidth
            var height_tmp = o.outHeight
            var scale = 1
            while (true) {
                if (width_tmp / 2 < REQUIRED_SIZE || height_tmp / 2 < REQUIRED_SIZE) break
                width_tmp /= 2
                height_tmp /= 2
                scale *= 2
            }
            val o2 = BitmapFactory.Options()
            o2.inSampleSize = scale
            return  BitmapFactory.decodeFile(photoPath, o2)

        } catch (e: FileNotFoundException) {
        }
        return null
    }
    fun resizeBitmap(photoPath: String): Bitmap? {
//        val bmOptions = BitmapFactory.Options()
//        bmOptions.inJustDecodeBounds = true
//        BitmapFactory.decodeFile(photoPath, bmOptions)
//        bmOptions.inJustDecodeBounds = false
//       // bmOptions.inSampleSize = (File(photoPath).length().toFloat() / REQUIRED_SIZE).toInt()
//        bmOptions.inSampleSize = 6
//        val temp = BitmapFactory.decodeFile(photoPath, bmOptions)
        val temp = decodeAndResizeFile(photoPath)
        var exif: ExifInterface? = null
        try {
            val pictureFile = File(photoPath)
            exif = ExifInterface(photoPath)
        } catch (e: IOException) {
            e.printStackTrace()
        }

        var orientation = ExifInterface.ORIENTATION_NORMAL

        if (exif != null)
            orientation = exif!!.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_NORMAL)
        if (temp == null) return null;
        var loadedBitmap = temp
        when (orientation) {
            ExifInterface.ORIENTATION_ROTATE_90 -> loadedBitmap = rotateBitmap(temp, 90)
            ExifInterface.ORIENTATION_ROTATE_180 -> loadedBitmap = rotateBitmap(temp, 180)

            ExifInterface.ORIENTATION_ROTATE_270 -> loadedBitmap = rotateBitmap(temp, 270)
        }
        return loadedBitmap

    }

    fun rotateBitmap(bitmap: Bitmap, degrees: Int): Bitmap {
        val matrix = Matrix()
        matrix.postRotate(degrees.toFloat())
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height, matrix, true)
    }

    @SuppressLint("NewApi")
    @Throws(URISyntaxException::class)
    fun getPathImage(context: Context, uri: Uri): String? {
        var uri = uri

        val needToCheckUri = Build.VERSION.SDK_INT >= 19
        var selection: String? = null
        var selectionArgs: Array<String>? = null
        // Uri is different in versions after KITKAT (Android 4.4), we need to
        // deal with different Uris.
        if (needToCheckUri && DocumentsContract.isDocumentUri(context.applicationContext, uri)) {
            if (isExternalStorageDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                WriteLog.e("filepathOriginal200", Environment.getExternalStorageDirectory().toString() + "/" + split[1])
                return Environment.getExternalStorageDirectory().toString() + "/" + split[1]
            } else if (isDownloadsDocument(uri)) {
                val id = DocumentsContract.getDocumentId(uri)
                uri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(id))
            } else if (isMediaDocument(uri)) {
                val docId = DocumentsContract.getDocumentId(uri)
                val split = docId.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                val type = split[0]
                if ("image" == type) {
                    uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                } else if ("video" == type) {
                    uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                } else if ("audio" == type) {
                    uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
                }
                selection = "_id=?"
                selectionArgs = arrayOf(split[1])
            }
        }
        if ("content".equals(uri.scheme!!, ignoreCase = true)) {
            val projection = arrayOf(MediaStore.Images.Media.DATA)
            var cursor: Cursor? = null
            try {
                cursor = context.contentResolver.query(uri, projection, selection, selectionArgs, null)
                val column_index = cursor!!.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
                if (cursor.moveToFirst()) {
                    WriteLog.e("filepathOriginal227", cursor.getString(column_index))
                    return cursor.getString(column_index)
                }
            } catch (e: Exception) {
            }

        } else if ("file".equals(uri.scheme!!, ignoreCase = true)) {
            WriteLog.e("filepathOriginal233", uri.path!!.toString())
            return uri.path
        }
        return null

    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    fun isExternalStorageDocument(uri: Uri): Boolean {
        return "com.android.externalstorage.documents" == uri.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    fun isDownloadsDocument(uri: Uri): Boolean {
        return "com.android.providers.downloads.documents" == uri.authority
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    fun isMediaDocument(uri: Uri): Boolean {
        return "com.android.providers.media.documents" == uri.authority
    }
}
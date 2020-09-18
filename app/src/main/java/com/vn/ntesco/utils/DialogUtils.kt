package com.vn.ntesco.utils

import android.app.Activity
import android.app.DatePickerDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.text.Html
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.DatePicker
import android.widget.TextView
import com.vn.ntesco.R
import java.util.*

object DialogUtils {
    private var dialog: Dialog? = null

    fun showDialog(activity: Activity?, title: String?, callback: CallbackDialog?) {
        if (activity == null) return
        if (dialog == null || !dialog!!.isShowing) {
            dialog = Dialog(activity)
            dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog!!.setContentView(R.layout.dialog_alert)
            dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                (dialog!!.findViewById(R.id.txtTitle) as TextView).text = Html.fromHtml(title, Html.FROM_HTML_MODE_LEGACY)
            } else
                (dialog!!.findViewById(R.id.txtTitle) as TextView).text = Html.fromHtml(title)
            (dialog!!.findViewById(R.id.btnOk) as TextView).setOnClickListener {
                if (callback != null)
                    callback!!.onAccept()
                dialog!!.dismiss()
                dialog = null
            }
            dialog!!.setCanceledOnTouchOutside(false)
            dialog!!.setCancelable(false)
            dialog!!.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
            dialog!!.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog!!.show()
        }
    }
    fun showDialogConfirm(activity: Activity?, title: String?, btnOk: String, btnCancel:String, isShowCancelButton :Boolean ,callback: CallbackDialog?) {
        if (activity == null) return
        if (dialog == null || !dialog!!.isShowing) {
            dialog = Dialog(activity)
            dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog!!.setContentView(R.layout.dialog_alert)
            dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                (dialog!!.findViewById(R.id.txtTitle) as TextView).text = Html.fromHtml(title, Html.FROM_HTML_MODE_LEGACY)
            } else
                (dialog!!.findViewById(R.id.txtTitle) as TextView).text = Html.fromHtml(title)
            (dialog!!.findViewById(R.id.btnCancel) as TextView).visibility = if(isShowCancelButton) View.VISIBLE else View.GONE
            (dialog!!.findViewById(R.id.btnCancel) as TextView).text= btnCancel
            (dialog!!.findViewById(R.id.btnCancel) as TextView).setOnClickListener {
                if (callback != null)
                    callback!!.onCancel()
                dialog!!.dismiss()
                dialog = null
            }
            (dialog!!.findViewById(R.id.btnOk) as TextView).text =btnOk
            (dialog!!.findViewById(R.id.btnOk) as TextView).setOnClickListener {
                if (callback != null)
                    callback!!.onAccept()
                dialog!!.dismiss()
                dialog = null
            }
            dialog!!.setCanceledOnTouchOutside(false)
            dialog!!.setCancelable(false)
            dialog!!.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
            dialog!!.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog!!.show()
        }
    }
    fun showDialogPickFromDate(activity: Activity, calendar: Calendar?, callback: CallbackPickDateDialog?, toCalendar: Calendar?) {
        var calendar = calendar
        if (calendar == null) {
            calendar = Calendar.getInstance()
        }
        val year = calendar!!.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(activity,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    if (callback != null)
                        callback!!.onPick(view, year, monthOfYear, dayOfMonth)
                }, year, month, day)
        datePickerDialog.datePicker.minDate = Date().time
        if (toCalendar != null)
            datePickerDialog.datePicker.maxDate = toCalendar.timeInMillis
        datePickerDialog.show()
    }

    fun showDialogPickToDate(activity: Activity, calendar: Calendar?, callback: CallbackPickDateDialog?, fromCalendar: Calendar) {
        var calendar = calendar
        if (calendar == null) {
            calendar = Calendar.getInstance()
        }
        val year = calendar!!.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(activity,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    if (callback != null)
                        callback!!.onPick(view, year, monthOfYear, dayOfMonth)
                }, year, month, day)
        datePickerDialog.datePicker.minDate = fromCalendar.timeInMillis
        datePickerDialog.show()
    }

    interface CallbackPickDateDialog {
        fun onPick(view: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int)
    }

    interface CallbackDialog {
        fun onAccept()
        fun onCancel()
    }
}
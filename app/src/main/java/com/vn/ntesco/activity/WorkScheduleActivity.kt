package com.vn.ntesco.activity

import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.vn.ntesco.R
import com.vn.ntesco.adapter.WorkScheduleAdapter
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.WriteLog
import java.util.*
import android.widget.ArrayAdapter
import com.vn.ntesco.base.BaseActivity
import kotlinx.android.synthetic.main.schedule_working_activity.*
import kotlin.collections.ArrayList
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.vn.ntesco.model.DataSchedule
import com.vn.ntesco.model.Request.NTescoRequestGET
import com.vn.ntesco.model.Response.ScheduleResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.text.SimpleDateFormat


class WorkScheduleActivity : BaseActivity(), AdapterView.OnItemSelectedListener {
    lateinit var workScheduleAdapter: WorkScheduleAdapter
    lateinit var spnYear: Spinner
    lateinit var spnMonth: Spinner
    lateinit var spnWeek: Spinner
    var isFirstLoad = false;
    var month: Int = 0


    override fun getLayoutResource(): Int {
        return R.layout.schedule_working_activity
    }

    override fun setBody(savedInstanceState: Bundle?) {
        val gridLayoutManager = androidx.recyclerview.widget.GridLayoutManager(this, 6, androidx.recyclerview.widget.GridLayoutManager.VERTICAL, false)
        workScheduleAdapter = WorkScheduleAdapter(this);
        spnYear = findViewById<Spinner>(R.id.spnYear)
        spnMonth = findViewById<Spinner>(R.id.spnMonth)
        spnWeek = findViewById<Spinner>(R.id.spnWeek)
        month = Calendar.getInstance().get(Calendar.MONTH)
        setupData()

        rvWorkSchedule.apply {
            adapter = workScheduleAdapter
            layoutManager = gridLayoutManager
            isNestedScrollingEnabled = true
        }
        rvWorkSchedule.isNestedScrollingEnabled
        // rvWorkSchedule.setItemAnimator(DefaultItemAnimator())
        val Hdivider = androidx.recyclerview.widget.DividerItemDecoration(this, androidx.recyclerview.widget.DividerItemDecoration.HORIZONTAL)
        val Vdivider = androidx.recyclerview.widget.DividerItemDecoration(this, androidx.recyclerview.widget.DividerItemDecoration.VERTICAL)
        Hdivider.setDrawable(ContextCompat.getDrawable(baseContext, R.drawable.divider_gird_recyclerview)!!)
        Vdivider.setDrawable(ContextCompat.getDrawable(baseContext, R.drawable.divider_gird_recyclerview)!!)
        //   rvWorkSchedule.addItemDecoration(Hdivider)
        //  rvWorkSchedule.addItemDecoration(Vdivider)
        // val horizontalDivider : Drawable = ContextCompat.getDrawable(this, R.drawable.divider_gird_recyclerview)!!
        /// val verticalDivider : Drawable = ContextCompat.getDrawable(this, R.drawable.divider_gird_recyclerview)!!
        //  rvWorkSchedule.addItemDecoration(GridDividerItemDecoration(horizontalDivider, verticalDivider, 6))
        getAllWorkInMonth(Calendar.getInstance().time)

        spnMonth.onItemSelectedListener = this
        spnYear.onItemSelectedListener = this
        spnWeek.onItemSelectedListener = this
        ivClose.setOnClickListener { finish() }
    }


    fun setupData() {
        val month = resources.getStringArray(R.array.month)
        val monthAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, month)
        monthAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spnMonth.adapter = monthAdapter
        spnMonth.setSelection(Calendar.getInstance().get(Calendar.MONTH))

        var year = ArrayList<String>()
        for (x in 0..10) {
            year.add((cacheCalendar.get(Calendar.YEAR) + x).toString())

        }
        val yearAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, year)
        yearAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spnYear.adapter = yearAdapter
        spnYear.setSelection(0)


        val weeks = resources.getStringArray(R.array.weeks)
        val weeksAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, weeks)
        weeksAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spnWeek.adapter = weeksAdapter

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        when (spnMonth.selectedItemPosition) {
            0 -> month = Calendar.JANUARY
            1 -> month = Calendar.FEBRUARY
            2 -> month = Calendar.MARCH
            3 -> month = Calendar.APRIL
            4 -> month = Calendar.MAY
            5 -> month = Calendar.JUNE
            6 -> month = Calendar.JULY
            7 -> month = Calendar.AUGUST
            8 -> month = Calendar.SEPTEMBER
            9 -> month = Calendar.OCTOBER
            10 -> month = Calendar.NOVEMBER
            11 -> month = Calendar.DECEMBER
        }

        if (isFirstLoad) {
            if (spnWeek.selectedItemPosition == 0) {
                getAllWorkInMonth(Calendar.getInstance().time)
            } else {
                getWorkInWeek((spnYear.selectedItem.toString().toInt()), month, spnWeek.selectedItemPosition)

            }
        }


    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    fun getAllWorkInMonth(currentDate: Date) {
//        WriteLog.e("year, month, week:", currentDate.year.toString() + "," + month.toString())

        val df = android.text.format.DateFormat()
        val cells = ArrayList<DataSchedule>()
        val calendar = Utils.toCalendar(currentDate)
        val formatDay = SimpleDateFormat("yyyy-MM-dd")
        // determine the cell for current month's beginning
        calendar.set(Calendar.DAY_OF_MONTH, 1)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.YEAR, spnYear.selectedItem.toString().toInt())
        val monthBeginningCell = calendar.get(Calendar.DAY_OF_WEEK) - 2
        // move calendar backwards to the beginning of the week
        calendar.add(Calendar.DAY_OF_MONTH, -monthBeginningCell)
        // fill cells (42 days calendar as per our business logic)


        while (cells.size < Constant.DAYS_COUNT) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                cells.add(DataSchedule(formatDay.format(calendar.getTime()), null))
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1)
        }
        for (i in cells.indices) {
            WriteLog.e("celllll", cells.toString())
        }
        val currentCalendar = Calendar.getInstance()
        currentCalendar.set(Calendar.MONTH, month)
        workScheduleAdapter.currentCalendar = currentCalendar
        WriteLog.e("month", currentCalendar.get(Calendar.MONTH).toString())
        workScheduleAdapter.setData(cells)
        getSchedules(Utils.formatYear(cells[0].day), Utils.formatDate(cells[0].day), Utils.formatDate(cells[cells.size - 1].day))
//        calendar?.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
//        val start = calendar.get(Calendar.WEEK_OF_MONTH)
//        WriteLog.e("WEEK_OF_MONTH", start.toString())
    }

    private val cacheCalendar = Calendar.getInstance()

    fun getWorkInWeek(year: Int, month: Int, weekInMonth: Int) {
        WriteLog.e("year, month, week:", year.toString() + "," + month.toString() + "," + weekInMonth.toString())
        val cells = ArrayList<DataSchedule>()
        val formatDay = SimpleDateFormat("yyyy-MM-dd")

        cacheCalendar?.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
        cacheCalendar?.set(Calendar.WEEK_OF_MONTH, weekInMonth)
        cacheCalendar?.set(Calendar.MONTH, month)
        cacheCalendar?.set(Calendar.YEAR, year)
        WriteLog.e("date", cacheCalendar.get(Calendar.DATE).toString())
        //    cells.add(cacheCalendar.time)
        cells.add(DataSchedule(formatDay.format(cacheCalendar.getTime()), null))

        val currentCalendar = Calendar.getInstance()
        currentCalendar.set(Calendar.MONTH, month)
        workScheduleAdapter.currentCalendar = currentCalendar
        while (cells.size < 6) {
            val cal = Calendar.getInstance()
            cal.time = cacheCalendar.time
            cal.add(Calendar.DATE, (cells.size))
            cells.add(DataSchedule(formatDay.format(cal.time), null))
//            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
//                cells.add(calendar.getTime())
//            calendar.add(Calendar.DAY_OF_MONTH, 1)
        }
//        getSchedules(year.toString(), cells.)
        workScheduleAdapter.setData(cells)
        getSchedules(Utils.formatYear(cells[0].day), Utils.formatDate(cells[0].day), Utils.formatDate(cells[cells.size - 1].day))

        // getSchedules(formatYear.format(cells[0]), format.format(cells[0]), format.format(cells[cells.size - 1]))

    }


    private fun getSchedules(year: String, start: String, end: String) {
        setLoading(true)
        var ntescoRequest = NTescoRequestGET()
        ntescoRequest.setYear(year)
        ntescoRequest.setStart(start)
        ntescoRequest.setEnd(end)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getSchedules(ntescoRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ScheduleResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(scheduleResponse: ScheduleResponse) {
                        setLoading(false)
                        if (scheduleResponse.code == Constant.SUCCESS) {
                            workScheduleAdapter.setData(scheduleResponse.data!!)

                        }

                    }

                })
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        isFirstLoad = true
    }

}
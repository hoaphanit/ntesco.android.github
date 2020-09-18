package com.vn.ntesco.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.views.NTescoSwitchButton
import kotlinx.android.synthetic.main.activity_chemical_calculation.*
import android.view.ViewTreeObserver
import android.widget.AdapterView
import android.widget.ScrollView
import android.widget.TextView
import com.vn.ntesco.adapter.adaptersSpinner.DataSpinnerAdapter
import com.vn.ntesco.model.Chemicals
import com.vn.ntesco.model.Request.NTescoRequestPOST
import com.vn.ntesco.model.Response.CalculatorChemicalsResponse
import com.vn.ntesco.model.Response.ChemicalsResponse
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.Constant
import kotlinx.android.synthetic.main.fragment_contact.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class ChemicalCalculationActivity : BaseHeaderActivity() {

    lateinit var switchButton: NTescoSwitchButton
    lateinit var scrollView: ScrollView
    lateinit var tvCalculator: TextView
    lateinit var chemicalsAdapter: DataSpinnerAdapter<Chemicals>
    lateinit var currencyAdapter: DataSpinnerAdapter<String>
    var chemicalSelected: Chemicals? = null
    var type = 1;
    override fun setTitle(): String {
        return resources.getString(R.string.chemical_calculation)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_chemical_calculation
    }

    override fun setBackgroundHeader(): Int {
        return R.color.orange_brown
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        switchButton = findViewById(R.id.switchButton)
        tvCalculator = findViewById(R.id.tvCalculator)
        scrollView = findViewById(R.id.scrollView)
        tvCalculator.setOnClickListener(this)
        chemicalsAdapter = DataSpinnerAdapter(this@ChemicalCalculationActivity, R.layout.item_spinner)
        currencyAdapter = DataSpinnerAdapter(this@ChemicalCalculationActivity, R.layout.item_spinner)

        switchButton.setClickListener(object : NTescoSwitchButton.ClickListener {
            override fun onLeftClick() {
                txtChemicalConcentration.text = resources.getString(R.string.chemical_power_b1)
                llMixChemical.visibility = View.VISIBLE
                chemicalStockSolution.visibility = View.VISIBLE
                labelChemicalStockSolution.visibility = View.VISIBLE
                edtConcentration.setText(chemicalSelected?.powder_concentrate.toString())
                edtSpecificGravity.setText(chemicalSelected?.powder_specific_gravity.toString())
                llCalculatorResult.visibility = View.GONE
                type = 1
            }

            override fun onCenterClick() {
            }

            override fun onRightClick() {
                txtChemicalConcentration.text = resources.getString(R.string.chemical_liquid_b1)
                llMixChemical.visibility = View.GONE
                chemicalStockSolution.visibility = View.GONE
                labelChemicalStockSolution.visibility = View.GONE
                edtConcentration.setText(chemicalSelected?.liquid_concentrate.toString())
                edtSpecificGravity.setText(chemicalSelected?.liquid_specific_gravity.toString())
                llCalculatorResult.visibility = View.GONE
                type = 2
            }
        })
        getChemicals()
        currencyAdapter.setItems(mutableListOf("vn", "usd"))
        currencyAdapter.setDropDownViewResource(R.layout.item_spinner)
        spinnerCurrency.adapter = currencyAdapter
        spinnerChemicals.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (chemicalsAdapter.getItems().get(position) != null && chemicalsAdapter.getItems().size > 0 && chemicalsAdapter.getItems().get(position) is Chemicals) {
                    val chemicals = chemicalsAdapter?.getItems().get(position) as Chemicals
                    if (chemicalSelected == null) chemicalSelected = chemicals
                    if (chemicals.id != -1) {
                        if (!chemicalSelected?.name.equals(chemicals.name)) {
                            //clearEnterText()
                            chemicalSelected = chemicals
                            llCalculatorResult.visibility = View.GONE
                        }
                        if (type == 1) {
                            edtConcentration.setText(chemicals.powder_concentrate.toString())
                            edtSpecificGravity.setText(chemicals.powder_specific_gravity.toString())
                        } else {
                            edtConcentration.setText(chemicals.liquid_concentrate.toString())
                            edtSpecificGravity.setText(chemicals.liquid_specific_gravity.toString())
                        }

//                        if (chemicals.type == 1) {
//                            llMixChemical.visibility = View.VISIBLE
//                            chemicalStockSolution.visibility = View.VISIBLE
//                            labelChemicalStockSolution.visibility = View.VISIBLE
//                            llCalculatorResult.visibility = View.GONE
//                        } else {
//                            llMixChemical.visibility = View.GONE
//                            chemicalStockSolution.visibility = View.GONE
//                            labelChemicalStockSolution.visibility = View.GONE
//                            llCalculatorResult.visibility = View.GONE
//                        }

                    }

                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }


        })
        spinnerCurrency.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                llCalculatorResult.visibility = View.GONE
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        })

    }

    override fun onClick(v: View) {
        super.onClick(v)
        when (v.id) {
            R.id.tvCalculator -> {
                if (checkValidate()) {
                    if (switchButton.isLeft) {
                        calculatorPowderChemicals()
                    } else {
                        calculatorLiquidChemicals()
                    }
                }


            }

        }

    }

    private fun getChemicals() {
        setLoading(true)
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .getChemicals()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<ChemicalsResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(chemicalsResponse: ChemicalsResponse) {
                        setLoading(false)
                        if (chemicalsResponse.code == Constant.SUCCESS) {
                            chemicalsResponse.data?.let {
                                //   it.add(0, Chemicals(-1, getString(R.string.select), -1))
                                chemicalsAdapter.setItems(it)
                            }
                            chemicalsAdapter.setDropDownViewResource(R.layout.item_spinner)
                            spinnerChemicals.adapter = chemicalsAdapter
                        }

                    }

                })
    }

    private fun calculatorPowderChemicals() {
        setLoading(true)
        val nTescoRequestPOST = NTescoRequestPOST()
        nTescoRequestPOST.chemicalName = (spinnerChemicals.selectedItem as? Chemicals)?.name;
        nTescoRequestPOST.concentration = edtConcentration.text.toString()
        nTescoRequestPOST.stockSolution = edtStockSolution.text.toString()
        nTescoRequestPOST.specificGravity = edtSpecificGravity.text.toString()
        nTescoRequestPOST.required = edtRequiredChemical.text.toString()
        nTescoRequestPOST.waterFlowRate = edtWaterFlow.text.toString()
        nTescoRequestPOST.cost = edtCost.text.toString()
        nTescoRequestPOST.currency = (spinnerCurrency.selectedItem as? String)?.toLowerCase()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .calculatorPowderChemicals(nTescoRequestPOST)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<CalculatorChemicalsResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(calculatorChemicalsResponse: CalculatorChemicalsResponse) {
                        setLoading(false)
                        if (calculatorChemicalsResponse.code == Constant.SUCCESS) {
                            if (calculatorChemicalsResponse.data != null) {
                                tvChemicalPump.text = calculatorChemicalsResponse.data.selectedDosing
                                tvMixChemical.text = calculatorChemicalsResponse.data.mixChemical
                                tvCostChemical.text = calculatorChemicalsResponse.data.cost
                                if ((spinnerCurrency.selectedItem as? String)?.toLowerCase()!!.equals("vn")) {
                                    tvCurrencyUnit.text = getString(R.string.vnd_m3)
                                } else {
                                    tvCurrencyUnit.text = getString(R.string.usd_m3)

                                }
                            }
                            llCalculatorResult.visibility = View.VISIBLE
                            scrollView.post(Runnable { scrollView.fullScroll(View.FOCUS_DOWN) })
                            //   chemicalSelected = spinnerChemicals.selectedItem as Chemicals

                        }

                    }

                })
    }

    private fun calculatorLiquidChemicals() {
        setLoading(true)
        val nTescoRequestPOST = NTescoRequestPOST()
        nTescoRequestPOST.chemicalName = (spinnerChemicals.selectedItem as? Chemicals)?.name;
        nTescoRequestPOST.concentration = edtConcentration.text.toString()
        nTescoRequestPOST.specificGravity = edtSpecificGravity.text.toString()
        nTescoRequestPOST.required = edtRequiredChemical.text.toString()
        nTescoRequestPOST.waterFlowRate = edtWaterFlow.text.toString()
        nTescoRequestPOST.cost = edtCost.text.toString()
        nTescoRequestPOST.currency = (spinnerCurrency.selectedItem as? String)?.toLowerCase()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .calculatorLiquidChemicals(nTescoRequestPOST)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<CalculatorChemicalsResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(calculatorChemicalsResponse: CalculatorChemicalsResponse) {
                        setLoading(false)
                        if (calculatorChemicalsResponse.code == Constant.SUCCESS) {
                            if (calculatorChemicalsResponse.data != null) {
                                tvChemicalPump.text = calculatorChemicalsResponse.data.selectedDosing
                                tvCostChemical.text = calculatorChemicalsResponse.data.cost
                                if ((spinnerCurrency.selectedItem as? String)?.toLowerCase()!!.equals("vn")) {
                                    tvCurrencyUnit.text = getString(R.string.vnd_m3)
                                } else {
                                    tvCurrencyUnit.text = getString(R.string.usd_m3)

                                }
                            }
                            llCalculatorResult.visibility = View.VISIBLE
                            scrollView.post(Runnable { scrollView.fullScroll(View.FOCUS_DOWN) })
                            // chemicalSelected = spinnerChemicals.selectedItem as Chemicals
                        }

                    }

                })
    }

    private fun clearEnterText() {
        Utils.clearAllEditText(viewGroup)
    }

    private fun checkValidate(): Boolean {
        if (edtConcentration.text.toString().isEmpty() || edtConcentration.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.concentration_is_empty))
            return false
        }
        if (switchButton.isLeft && (edtStockSolution.text.toString().isEmpty() || edtStockSolution.text.toString().trim().isEmpty())) {
            showAlert(getString(R.string.chemical_stock_is_empty))
            return false
        }
        if (edtSpecificGravity.text.toString().isEmpty() || edtSpecificGravity.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.specific_gravity_is_empty))
            return false
        }
        if (edtRequiredChemical.text.toString().isEmpty() || edtRequiredChemical.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.required_chemical_is_empty))
            return false
        }
        if (edtWaterFlow.text.toString().isEmpty() || edtWaterFlow.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.water_flow_rate_is_empty))
            return false
        }
        if (edtCost.text.toString().isEmpty() || edtCost.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.cost_chemical_is_empty))
            return false
        }
        return true
    }
}

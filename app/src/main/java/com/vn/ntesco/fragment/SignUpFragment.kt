package com.vn.ntesco.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.cardview.widget.CardView
import android.util.Patterns
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.facebook.accountkit.*
import com.facebook.accountkit.ui.AccountKitActivity
import com.facebook.accountkit.ui.AccountKitConfiguration
import com.facebook.accountkit.ui.LoginType
import com.vn.ntesco.R
import com.vn.ntesco.activity.AccountActivity
import com.vn.ntesco.activity.ChangePasswordActivity
import com.vn.ntesco.activity.ServiceActivity
import com.vn.ntesco.activity.WorkScheduleActivity
import com.vn.ntesco.base.BaseFragment
import com.vn.ntesco.model.Request.LoginRequest
import com.vn.ntesco.model.Request.SignupRequest
import com.vn.ntesco.model.Response.UserResponse
import com.vn.ntesco.model.User
import com.vn.ntesco.network.NTescoService
import com.vn.ntesco.network.ServiceFactory
import com.vn.ntesco.utils.*
import kotlinx.android.synthetic.main.signup_fragment.*
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import java.util.regex.Pattern




class SignUpFragment : BaseFragment() {
    lateinit var edtFirstName: EditText
    lateinit var edtLastName: EditText
    lateinit var edtUserName: EditText
    lateinit var edtPassword: EditText
    lateinit var edtRePassword: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPhone: EditText
    lateinit var edtCompany: EditText
    lateinit var edtCountry: EditText
    lateinit var edtLocation: EditText
    lateinit var btnSignUp: androidx.cardview.widget.CardView
    lateinit var tvSignUp: TextView
    lateinit var tvChangePass: TextView
    lateinit var labelPass: TextView
    lateinit var labelRePass: TextView
    lateinit var tvUserName: TextView
    lateinit var tvPhone: TextView
    lateinit var tvEmail: TextView
    var REGISTER_REQUEST_CODE = 12
    var mUser: User? = null;
    var isUpdate: Boolean = false;

    companion object {
        @JvmStatic
        fun newInstance(user: User?) = SignUpFragment().apply {
            arguments = Bundle().apply {
                putSerializable(Constant.USER, user)
            }
        }
    }

    override fun onSetBodyView(view: View, container: ViewGroup?, savedInstanceState: Bundle?) {
        mUser = arguments?.getSerializable(Constant.USER) as? User
        isUpdate = mUser != null
        edtFirstName = view.findViewById(R.id.edtFirstName)
        edtLastName = view.findViewById(R.id.edtLastName)
        edtUserName = view.findViewById(R.id.edtUserName)
        edtPassword = view.findViewById(R.id.edtPassword)
        edtRePassword = view.findViewById(R.id.edtRePassword)
        edtEmail = view.findViewById(R.id.edtEmail)
        edtPhone = view.findViewById(R.id.edtPhone)
        edtCompany = view.findViewById(R.id.edtCompany)
        edtCountry = view.findViewById(R.id.edtCountry)
        edtLocation = view.findViewById(R.id.edtLocation)
        btnSignUp = view.findViewById(R.id.btnSignUp)
        tvSignUp = view.findViewById(R.id.tvSignUp)
        tvChangePass = view.findViewById(R.id.tvChangePass)
        labelPass = view.findViewById(R.id.labelPassword)
        labelRePass = view.findViewById(R.id.labelRePassword)
        tvUserName = view.findViewById(R.id.tvUserName)
        tvPhone = view.findViewById(R.id.tvPhone)
        tvEmail = view.findViewById(R.id.tvEmail)
        btnSignUp.setOnClickListener(View.OnClickListener {
            if (checkValidate()) {
                if (isUpdate)
                    updateProfile()
                else
                    signUp()
            }


        })
        if (isUpdate) {
            tvSignUp.text = getString(R.string.update_profile)
            edtFirstName.setText(mUser?.firstName)
            edtLastName.setText(mUser?.lastName)
            tvUserName.setText(mUser?.username)
            edtEmail.setText(mUser?.email)
            edtPassword.visibility = View.GONE
            labelPass.visibility = View.GONE
            edtRePassword.visibility = View.GONE
            labelRePass.visibility = View.GONE
            edtUserName.visibility = View.GONE
            edtPhone.visibility = View.GONE
            // edtEmail.visibility = View.GONE
            edtCountry.setText(mUser?.country)
            edtLocation.setText(mUser?.location)
            tvPhone.setText(mUser?.phone)
            edtCompany.setText(mUser?.company)
            tvChangePass.visibility = View.VISIBLE
            tvUserName.visibility = View.VISIBLE
            tvPhone.visibility = View.VISIBLE
            //  tvEmail.visibility = View.VISIBLE
            tvChangePass.setOnClickListener(View.OnClickListener {
                val intent = Intent(activity, ChangePasswordActivity::class.java)
                startActivity(intent)
            })
            tvChangePass.setTextColor(ContextCompat.getColor(activity!!, UserCache.getColorUser()))
            if (UserCache.userInfo?.type == 1)
                tvChangePass.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_next_blue, 0, 0, 0);

        }
    }

    override fun getLayoutResource(): Int {
        return R.layout.signup_fragment
    }

    fun signUp() {
        setLoading(true)
        var signUpFragment = SignupRequest()
        signUpFragment.first_name = edtFirstName.text.toString()
        signUpFragment.last_name = edtLastName.text.toString()
        signUpFragment.username = edtUserName.text.toString()
        signUpFragment.password = edtPassword.text.toString()
        signUpFragment.confirm_password = edtRePassword.text.toString()
        signUpFragment.email = edtEmail.text.toString()
        signUpFragment.phone = edtPhone.text.toString()
        signUpFragment.company = edtCompany.text.toString()
        signUpFragment.country = edtCountry.text.toString()
        signUpFragment.location = edtLocation.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .signup(signUpFragment)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<UserResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(userResponse: UserResponse) {
                        setLoading(false)
                        if (userResponse.code == Constant.SUCCESS) {
                            showAlertCallback(userResponse?.msg
                                    ?: "", object : DialogUtils.CallbackDialog {
                                override fun onCancel() {

                                }

                                override fun onAccept() {
                                    // UserCache.saveUserInfo(userResponse.data)
                                    Utils.clearAllEditText(viewGroup)
                                    if (activity != null && activity is AccountActivity) {
                                        val accountActivity = activity as? AccountActivity
                                        accountActivity?.viewPager?.setCurrentItem(0)
                                    }
                                }
                            })


                        }


                    }

                })
    }

    fun updateProfile() {
        setLoading(true)
        var signUpFragment = SignupRequest()
        signUpFragment.first_name = edtFirstName.text.toString()
        signUpFragment.last_name = edtLastName.text.toString()
        signUpFragment.company = edtCompany.text.toString()
        signUpFragment.country = edtCountry.text.toString()
        signUpFragment.location = edtLocation.text.toString()
        signUpFragment.email = edtEmail.text.toString()
        ServiceFactory.createRetrofitService(NTescoService::class.java, Constant.apiEndPoint)
                .updateProfile(signUpFragment)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(object : Observer<UserResponse> {
                    override fun onCompleted() {

                    }

                    override fun onError(e: Throwable) {
                        setLoading(false)
                    }

                    override fun onNext(userResponse: UserResponse) {
                        setLoading(false)
                        if (userResponse.code == Constant.SUCCESS) {
                            val intent = Intent()
                            intent.putExtra(Constant.USER, userResponse.data)
                            activity?.setResult(Activity.RESULT_OK, intent)
                            activity?.finish()
                        }


                    }

                })
    }

    fun verifyPhone() {
        val intent = Intent(activity, AccountKitActivity::class.java)
        val configurationBuilder = AccountKitConfiguration.AccountKitConfigurationBuilder(
                LoginType.PHONE,
                AccountKitActivity.ResponseType.TOKEN)
        // ... perform additional configuration ...
        intent.putExtra(AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION, configurationBuilder.build())
        startActivityForResult(intent, REGISTER_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REGISTER_REQUEST_CODE) run {
            // confirm that this response matches your request
            val loginResult = data!!.getParcelableExtra<AccountKitLoginResult>(AccountKitLoginResult.RESULT_KEY)
            if (loginResult.error != null) {
                // showAlert(loginResult.error!!.errorType.message)
            } else if (loginResult.wasCancelled()) {

            } else {
                if (loginResult.accessToken != null) {
                    //Get phone number to register account
                    AccountKit.getCurrentAccount(object : AccountKitCallback<Account> {
                        override fun onSuccess(account: Account) {
                            val accountKitId = account.id // FAKId
                            val phoneNumber = account.phoneNumber.phoneNumber // phone number
                            val countryCode = account.phoneNumber.countryCode // country code
                            WriteLog.e("account_kit ", phoneNumber + " " + countryCode + " " + accountKitId + " " + loginResult.accessToken!!.token)
                            if (edtPhone.text.toString().contains(account.phoneNumber.phoneNumber)) {
                                signUp()
                            }
                        }

                        override fun onError(error: AccountKitError) {
                            // Handle Error
                        }
                    })
                }
            }
        }
    }

    private fun checkValidate(): Boolean {
        if (edtFirstName.text.toString().isEmpty() || edtFirstName.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.first_name_is_empty))
            return false
        }
        if (edtFirstName.text.toString().length < 2) {
            showAlert(getString(R.string.first_name_length_longer_2))
            return false
        }
        if (edtLastName.text.toString().isEmpty() || edtLastName.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.last_name_is_empty))
            return false
        }
        if (edtLastName.text.toString().length < 2) {
            showAlert(getString(R.string.last_name_length_longer_2))
            return false
        }
        if (!isUpdate && edtPassword.text.toString().isEmpty()) {
            showAlert(getString(R.string.password_is_empty))
            return false
        }
        if (!isUpdate && edtPassword.text.toString().length < 6) {
            showAlert(getString(R.string.new_password_length_longer_6))
            return false
        }
        if (!isUpdate && edtRePassword.text.toString().isEmpty()) {
            showAlert(getString(R.string.re_enter_password_is_empty))
            return false
        }
        if (!isUpdate && !edtRePassword.text.toString().equals(edtPassword.text.toString())) {
            showAlert(getString(R.string.password_confirm_pass_not_similar))
            return false
        }
        if (edtEmail.text.toString().isEmpty() || edtEmail.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.email_is_empty))
            return false
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(edtEmail.text.toString()).matches()) {
            showAlert(getString(R.string.email_is_invalid))
            return false
        }
        if (edtCountry.text.toString().isEmpty() || edtCountry.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.country_is_empty))
            return false
        }
        if (edtCountry.text.toString().length < 2) {
            showAlert(getString(R.string.country_length_longer_2))
            return false
        }
        if (edtLocation.text.toString().isEmpty() || edtLocation.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.location_is_empty))
            return false
        }
        if (edtLocation.text.toString().length < 2) {
            showAlert(getString(R.string.location_length_longer_2))
            return false
        }
        if (!isUpdate && (edtPhone.text.toString().isEmpty() || edtPhone.text.toString().trim().isEmpty())) {
            showAlert(getString(R.string.phone_is_empty))
            return false
        }
        if (!isUpdate && edtPhone.text.toString().length < 10) {
            showAlert(getString(R.string.phone_number_length_minium_10))
            return false
        }
        if (!isUpdate) {
            val p = Pattern.compile("[^0-9]")
            val m = p.matcher(edtPhone.text.toString())
            val b = m.find()
            if (b) {
                showAlert(getString(R.string.phone_number_contain_special_character))
                return false
            }
        }


        if (edtCompany.text.toString().isEmpty() || edtCompany.text.toString().trim().isEmpty()) {
            showAlert(getString(R.string.company_is_empty))
            return false
        }
        if (edtCompany.text.toString().length < 2) {
            showAlert(getString(R.string.company_length_longer_2))
            return false
        }
        return true
    }


}
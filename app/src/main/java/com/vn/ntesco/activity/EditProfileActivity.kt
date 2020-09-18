package com.vn.ntesco.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vn.ntesco.R
import com.vn.ntesco.base.BaseHeaderActivity
import com.vn.ntesco.fragment.SignUpFragment
import com.vn.ntesco.model.User
import com.vn.ntesco.utils.Constant
import com.vn.ntesco.utils.UserCache

class EditProfileActivity : BaseHeaderActivity() {
    var mUser: User? = null
    override fun setTitle(): String {
        return getString(R.string.edit_profile)
    }

    override fun getLayoutContent(): Int {
        return R.layout.activity_edit_profile;
    }

    override fun setBackgroundHeader(): Int {
        return UserCache.getColorUser()
    }

    override fun setBody(savedInstanceState: Bundle?) {
        super.setBody(savedInstanceState)
        mUser = intent.getSerializableExtra(Constant.USER) as? User
        replaceFragment(SignUpFragment.newInstance(mUser))
    }
}

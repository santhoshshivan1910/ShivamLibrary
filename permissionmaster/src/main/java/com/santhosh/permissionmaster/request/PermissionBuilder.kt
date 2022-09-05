package com.santhosh.permissionmaster.request

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class PermissionBuilder(
    fragmentActivity: FragmentActivity?,
    fragment: Fragment?,
    normalPermissions: MutableSet<String>,
    specialPermissions: MutableSet<String>
) {

    lateinit var activity: FragmentActivity
    private var fragment: Fragment? = null
    @JvmField
    var normalPermissions: MutableSet<String>
    @JvmField
    var specialPermissions: MutableSet<String>

    init {
        if (fragmentActivity != null) {
            activity = fragmentActivity
        }
        // activity and fragment must not be null at same time
        if (fragmentActivity == null && fragment != null) {
            activity = fragment.requireActivity()
        }
        this.fragment = fragment
        this.normalPermissions = normalPermissions
        this.specialPermissions = specialPermissions
    }
}
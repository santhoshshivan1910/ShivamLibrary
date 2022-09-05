package com.santhosh.permissionmaster

import android.os.Build
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.santhosh.permissionmaster.request.PermissionBuilder

class PermissionMediator {

    private var activity: FragmentActivity? = null
    private var fragment: Fragment? = null

    constructor(activity: FragmentActivity) {
        this.activity = activity
    }
    constructor(fragment: Fragment) {
        this.fragment = fragment
    }

    fun permissions(permissions: List<String>): PermissionBuilder {
        val normalPermissionSet = LinkedHashSet<String>()
        val specialPermissionSet = LinkedHashSet<String>()
        val osVersion = Build.VERSION.SDK_INT
        val targetSdkVersion = if (activity != null) {
            activity!!.applicationInfo.targetSdkVersion
        } else {
            fragment!!.requireContext().applicationInfo.targetSdkVersion
        }

        //Todo
//        permissions.forEach {
//            if (it in all)
//        }

        return PermissionBuilder(activity, fragment, normalPermissionSet, specialPermissionSet)
    }

    fun permissions(vararg permissions: String): PermissionBuilder {
        return permissions(listOf(*permissions))
    }

}
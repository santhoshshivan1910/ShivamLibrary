package com.santhosh.permissionmaster.request

internal class RequestBackgroundLocationPermission internal constructor(permissionBuilder: PermissionBuilder) : BaseTask(permissionBuilder){
    override fun request() {

    }

    override fun requestAgain(permissions: List<String?>?) {

    }

    override fun finish() {

    }

    companion object {

        const val ACCESS_BACKGROUND_LOCATION = "android.permission.ACCESS_BACKGROUND_LOCATION"
    }
}
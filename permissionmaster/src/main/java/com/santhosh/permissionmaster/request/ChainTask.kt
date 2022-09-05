package com.santhosh.permissionmaster.request

interface ChainTask {

    fun request()

    fun requestAgain(permissions: List<String?>?)

    fun finish()
}
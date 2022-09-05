package com.santhosh.permissionmaster.request

internal abstract class BaseTask(@JvmField var pb: PermissionBuilder) : ChainTask {

    @JvmField
    var next: ChainTask? = null

}
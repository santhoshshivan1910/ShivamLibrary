package com.santhosh.permissionmaster;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class PermissionMaster {

    public static PermissionMediator init(@NonNull FragmentActivity activity) {
        return new PermissionMediator(activity);
    }
    public static PermissionMediator init(@NonNull Fragment fragment) {
        return new PermissionMediator(fragment);
    }



}

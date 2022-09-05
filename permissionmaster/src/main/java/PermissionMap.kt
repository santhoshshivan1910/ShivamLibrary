import android.Manifest
import com.santhosh.permissionmaster.request.RequestBackgroundLocationPermission

val allSpecialPermissions = setOf(
    RequestBackgroundLocationPermission.ACCESS_BACKGROUND_LOCATION,
    Manifest.permission.SYSTEM_ALERT_WINDOW,
    Manifest.permission.WRITE_SETTINGS,
    //Todo
//    RequestManageExternalStoragePermission.MANAGE_EXTERNAL_STORAGE,
//    RequestInstallPackagesPermission.REQUEST_INSTALL_PACKAGES,
//    PermissionX.permission.POST_NOTIFICATIONS,
//    RequestBodySensorsBackgroundPermission.BODY_SENSORS_BACKGROUND,
)
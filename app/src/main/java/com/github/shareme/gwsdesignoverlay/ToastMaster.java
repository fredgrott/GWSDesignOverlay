package com.github.shareme.gwsdesignoverlay;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * This class prevents multiple toasts from being queued.
 */
@SuppressWarnings("unused")
public final class ToastMaster {

    private static Toast sToast = null;

    private ToastMaster() {
    }

    public static void setToast(Toast toast) {
        if (sToast != null) {
            sToast.cancel();
        }
        sToast = toast;
    }

    public static void cancelToast() {
        if (sToast != null) {
            sToast.cancel();
        }
        sToast = null;
    }

    public static void showToast(Context context, String msg, int display_length) {
        Toast toast = Toast.makeText(context, msg, display_length);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        // displays in the bottom of the screen
        ToastMaster.setToast(toast);
        toast.show();
    }
}
package com.chenl.novel.util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Hiroshi on 2016/9/22.
 */

public class HintUtils {

    public static void showSnackBar(View layout, String msg) {
        if (layout != null && layout.isShown()) {
            Snackbar.make(layout, msg, Snackbar.LENGTH_SHORT).show();
        }
    }

    public static void showSnackBar(View layout, String format, Object... args) {
        showSnackBar(layout, StringUtils.format(format, args));
    }

    public static void showToast(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();
    }

}

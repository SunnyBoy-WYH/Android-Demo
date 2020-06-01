package com.example.immersedlibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;

/**
 * date:2020/6/1
 * @author 阳光大男孩！！！
 */
public class ImmersedUtils {

    @RequiresApi(api = Build.VERSION_CODES.M)
    public static void setStatusBarColor(Activity activity, int color) {
        //设置系统状态栏与主题色相同
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = activity.getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);

            activity.getWindow().setNavigationBarColor(activity.getColor(color));
            activity.getWindow().setStatusBarColor(activity.getColor(color));
        }
    }


}

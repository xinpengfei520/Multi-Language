package com.xpf.multi_language;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

import com.xpf.multi_language.utils.LocaleUtil;

/**
 * Created by xpf on 2017/12/3 :)
 * Function:
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        LocaleUtil.changeAppLanguage(mContext);
    }

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("TAG", "onConfigurationChanged");
        LocaleUtil.setLanguage(mContext, newConfig);
    }

}

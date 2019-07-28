package com.example.mynotification;

import android.app.Application;
import android.util.Log;

import com.example.mynotification.common.CronJob;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("ddddd", "Inside main application");
        CronJob.checkUpdateService(getApplicationContext());
    }
}

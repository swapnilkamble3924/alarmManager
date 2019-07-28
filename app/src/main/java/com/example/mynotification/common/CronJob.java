package com.example.mynotification.common;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.mynotification.MyService2;

import java.util.Calendar;

public class CronJob {

    private static AlarmManager alarmMgr;

    public static void checkUpdateService(Context mContext){
        alarmMgr = (AlarmManager) mContext.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(mContext, MyService2.class);
        PendingIntent alarmIntent = PendingIntent.getService(mContext, 0, intent, 0);

        Calendar calendar = Calendar.getInstance();
        //calendar.get
        long time= System.currentTimeMillis();
        android.util.Log.i("Time Class ", " Time value in millisecinds "+time);

        Log.d("ddddd", ""+ time);
        alarmMgr.setInexactRepeating(AlarmManager.RTC_WAKEUP, time,
                15*1000, alarmIntent);
    }
}

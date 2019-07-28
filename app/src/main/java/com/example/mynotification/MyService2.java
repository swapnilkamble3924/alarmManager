package com.example.mynotification;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyService2(String name) {
        super(name);
    }

    public MyService2() {
        super("MyService2");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("ddddd", "inside service 2");

    }
}

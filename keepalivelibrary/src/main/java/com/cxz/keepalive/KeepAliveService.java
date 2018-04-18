package com.cxz.keepalive;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by chenxz on 2018/4/18.
 */

public class KeepAliveService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        KeepAliveManager.getInstance().registerReceiver(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        KeepAliveManager.getInstance().setServiceForeground(this);

        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        KeepAliveManager.getInstance().unRegisterReceiver(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

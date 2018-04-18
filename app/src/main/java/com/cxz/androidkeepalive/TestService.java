package com.cxz.androidkeepalive;

import android.content.Intent;
import android.util.Log;

import com.cxz.keepalive.KeepAliveService;

/**
 * Created by chenxz on 2018/4/18.
 */

public class TestService extends KeepAliveService {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO: 2018/4/18
        int id = super.onStartCommand(intent, flags, startId);
        Log.e("KeepAlive", "TestService: " + android.os.Process.myPid());
        return id;
    }
}

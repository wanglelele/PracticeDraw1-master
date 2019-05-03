package com.hencoder.hencoderpracticedraw1;

import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this);
    }
}

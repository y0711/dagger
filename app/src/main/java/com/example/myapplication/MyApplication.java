package com.example.myapplication;

import android.app.Application;

public class MyApplication extends Application {
    private BaseComponent mBaseComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseComponent = DaggerBaseComponent.builder().build();
    }

    BaseComponent getBaseComponent() {
        return mBaseComponent;
    }
}

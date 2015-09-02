package com.gcraft.roommate.controller;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author bing.liu
 */
public abstract class BaseManager {
    protected static Application mApp;
    protected static Context mContext;
    protected static SharedPreferences mSharedPreferences;

    protected BaseManager(Application app) {
        mApp = app;
        mContext = app.getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }

    public static SharedPreferences getSharedPreferences() {
        return mSharedPreferences;
    }

    protected abstract void initManager();

    public abstract void DestroyManager();
}

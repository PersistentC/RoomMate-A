package com.gcraft.roommate.controller;

import android.app.Application;

import com.gcraft.roommate.RoomMateApp;


/**
 * @author bing.liu
 */
public class AppManager extends BaseManager {
    private static AppManager mInstance;

    private AppManager(Application app) {
        super(app);
        // TODO Auto-generated constructor stub
        initManager();
    }

    public static AppManager getInstance() {
        AppManager instance;
        if (mInstance == null) {
            synchronized (AppManager.class) {
                if (mInstance == null) {
                    instance = new AppManager(RoomMateApp.getApplication());
                    mInstance = instance;
                }
            }
        }
        return mInstance;
    }

    @Override
    protected void initManager() {
    }

    @Override
    public void DestroyManager() {
    }
}

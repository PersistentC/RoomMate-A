package com.gcraft.roommate;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.gcraft.roommate.controller.AppManager;

import java.util.ArrayList;
/**
 * @author bing.liu
 */
public class RoomMateApp extends Application {
    private static Application app;
    private static ArrayList<Activity> list = new ArrayList<Activity>();

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        AppManager.getInstance();
    }

    public void onTerminate() {
        super.onTerminate();
    }

    public static Application getApplication() {
        return app;
    }

    public static Context getContext() {
        return getApplication().getApplicationContext();
    }
}

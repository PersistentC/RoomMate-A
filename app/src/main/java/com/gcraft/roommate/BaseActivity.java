package com.gcraft.roommate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * @author bing.liu
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
//      MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
//      MobclickAgent.onPause(this);
        super.onPause();
    }
}

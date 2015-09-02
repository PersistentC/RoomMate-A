package com.gcraft.roommate.fragment;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author bing.liu
 */
public abstract class NodeFragment extends Fragment implements View.OnTouchListener {
    public static String TAG ;

    protected Context mContext;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity().getApplicationContext();
    }

    public boolean onTouch(View v, MotionEvent event) {
        return true;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // 拦截触摸事件，防止泄露下去
        view.setOnTouchListener(this);
        super.onViewCreated(view, savedInstanceState);
    }
}

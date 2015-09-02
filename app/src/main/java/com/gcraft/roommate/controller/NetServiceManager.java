package com.gcraft.roommate.controller;

import android.app.Application;

import com.autonavi.volley.Request;
import com.autonavi.volley.RequestQueue;
import com.autonavi.volley.Response;
import com.autonavi.volley.VolleyError;
import com.autonavi.volley.toolbox.JsonObjectRequest;
import com.autonavi.volley.toolbox.Volley;
import com.gcraft.roommate.BroadCastEvent;
import com.gcraft.roommate.RoomMateApp;
import com.gcraft.roommate.protocol.ProtocolDataInput;
import com.gcraft.roommate.protocol.ProtocolDataOutput;

import org.json.JSONException;
import org.json.JSONObject;

import de.greenrobot.event.EventBus;

/**
 * Created by bingliu on 15/9/2.
 */
public class NetServiceManager extends BaseManager {
    private static NetServiceManager mInstance;

    private static final String NET_SERVER = "http://infocomm.duapp.com/";
    private static final String NET_GET_MAIN_IMAGE_LIST = NET_SERVER + "getmainimage.py";

    private NetServiceManager(Application app) {
        super(app);
        // TODO Auto-generated constructor stub
        initManager();
    }

    public static NetServiceManager getInstance() {
        NetServiceManager instance;
        if (mInstance == null) {
            synchronized (NetServiceManager.class) {
                if (mInstance == null) {
                    instance = new NetServiceManager(
                            RoomMateApp.getApplication());
                    mInstance = instance;
                }
            }
        }
        return mInstance;
    }

    @Override
    protected void initManager() {
        // TODO Auto-generated method stub

    }

    @Override
    public void DestroyManager() {
        // TODO Auto-generated method stub

    }

    public void getMainImageListData(int num, String APP_PID) {
        RequestQueue mQueue = Volley
                .newRequestQueue(getContext());
        try {
            JSONObject obj;// = ProtocolDataOutputåå
//                    .getMainImageListDataToJson(num, APP_PID);
            String url = null;
//            if(AppManager.isOpen)
//                url = NET_GET_MAIN_IMAGE_fLIST;
//            else
//                url = NET_GET_TEST_IMAGE_LIST;
            mQueue.add(new JsonObjectRequest(Request.Method.POST,
                    url, obj, new Response.Listener() {

                @Override
                public void onResponse(Object arg0) {
                    // TODO Auto-generated method stub
//                    try {
//                        boolean isSuccess = ProtocolDataInput
//                                .parseMainImageListDataToJson((JSONObject) arg0);
//                        EventBus.getDefault()
//                                .post(new BroadCastEvent(
//                                        BroadCastEvent.GET_MAIN_IMAGE_LIST_DATA,
//                                        isSuccess));
//                    } catch (JSONException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError arg0) {
                    // TODO Auto-generated method stub
//                    EventBus.getDefault()
//                            .post(new BroadCastEvent(
//                                    BroadCastEvent.GET_MAIN_IMAGE_LIST_DATA,
//                                    false));
                }
            }));
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mQueue.start();
    }
}
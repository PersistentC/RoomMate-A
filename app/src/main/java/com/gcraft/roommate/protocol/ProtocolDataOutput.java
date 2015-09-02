package com.gcraft.roommate.protocol;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author bing.liu
 */
public class ProtocolDataOutput {

    public static JSONObject get()
            throws JSONException {
        try {
            JSONObject output = new JSONObject();
            return output;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

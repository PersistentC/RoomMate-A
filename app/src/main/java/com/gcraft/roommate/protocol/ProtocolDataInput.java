package com.gcraft.roommate.protocol;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author bing.liu
 */
public class ProtocolDataInput {
    public static JSONObject parseXXXToJson(
            JSONObject obj) throws JSONException {
        if (obj == null) {
            return obj;
        }
        try {
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
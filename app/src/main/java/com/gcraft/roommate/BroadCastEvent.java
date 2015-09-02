package com.gcraft.roommate;

public class BroadCastEvent {
    public final static int BASE_EVENT = 0;

    private int type;
    private Object obj;

    public BroadCastEvent(int type) {
        this.type = type;
    }

    public BroadCastEvent(int type, Object obj) {
        this.type = type;
        this.obj = obj;
    }

    public int getType() {
        return type;
    }
    public Object getObject() {
        return obj;
    }
}
package org.bytecamp19.seckill4.entity;

/**
 * Created by LLAP on 2019/8/5.
 * Copyright (c) 2019 L. Xiao, F. Baoren, L. Yangzhou. All rights reserved.
 */
public class Session {
    private int uid;
    private String sessionid;

    @Override
    public String toString() {
        return "Session{" +
                "uid=" + uid +
                ", sessionid='" + sessionid + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
}
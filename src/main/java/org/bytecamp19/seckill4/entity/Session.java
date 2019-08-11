package org.bytecamp19.seckill4.entity;

import lombok.Data;

/**
 * Created by LLAP on 2019/8/5.
 * Copyright (c) 2019 L. Xiao, F. Baoren, L. Yangzhou. All rights reserved.
 */
@Data
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

}

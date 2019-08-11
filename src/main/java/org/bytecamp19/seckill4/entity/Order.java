package org.bytecamp19.seckill4.entity;

import lombok.Data;

/**
 * Created by LLAP on 2019/8/4.
 * Copyright (c) 2019 L. Xiao, F. Baoren, L. Yangzhou. All rights reserved.
 */
@Data
public class Order {
    private String order_id;
    private int uid;
    private int pid;
    private int price;
    private int status = 0;
    private String token;

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", uid=" + uid +
                ", pid=" + pid +
                ", price=" + price +
                ", status=" + status +
                ", token='" + token + '\'' +
                '}';
    }
}

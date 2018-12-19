package com.lh.base;

/**
 * 房屋操作状态常量定义
 * @Author: 水越帆
 * QQ:1548353431
 */
public class HouseOperation {
    public static final int PASS = 1; // 通过审核

    public static final int PULL_OUT = 2; // 下架。重新审核

    public static final int DELETE = 3; // 逻辑删除

    public static final int RENT = 4; // 出租
}

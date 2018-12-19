package com.lh.web.dto;

/**
 * 返回结果集
 * @Author: 水越帆
 * @date: Create in 23:17 2018/11/27
 * QQ:1548353431
 */
public class QiNiuPutRet {
    public String key;
    public String hash;
    public String bucket;
    public int width;
    public int height;

    @Override
    public String toString() {
        return "QiNiuPutRet{" +
                "key='" + key + '\'' +
                ", hash='" + hash + '\'' +
                ", bucket='" + bucket + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

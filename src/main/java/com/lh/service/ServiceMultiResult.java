package com.lh.service;

import lombok.Data;

import java.util.List;

/**
 * 通过多结果Service返回结构
 * @Author: 水越帆
 * @date: Create in 12:07 2018/11/28
 * QQ:1548353431
 */
@Data
public class ServiceMultiResult<T> {
    private long total;
    private List<T> result;

    public ServiceMultiResult(long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    /**
     * 获取当前结果集
     * @return
     */
    public int getResultSize() {
        if (this.result == null) {
            return 0;
        }
        return this.result.size();
    }
}

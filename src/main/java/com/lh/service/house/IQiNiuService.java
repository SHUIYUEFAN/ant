package com.lh.service.house;

import java.io.File;
import java.io.InputStream;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

/**
 *   七牛云上传服务
 * @Author: 水越帆
 * @date: Create in 17:15 2018/11/27
 * QQ:1548353431
 */
public interface IQiNiuService {
    Response uploadFile(File file) throws QiniuException;

    Response uploadFile(InputStream inputStream) throws QiniuException;

    Response delete(String key) throws QiniuException;
}

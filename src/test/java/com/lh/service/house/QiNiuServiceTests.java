package com.lh.service.house;
import java.io.File;
import com.lh.AntApplicationTests;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 图片上传单测
 * @Author: 水越帆
 * @date: Create in 18:00 2018/11/27
 * QQ:1548353431
 */
public class QiNiuServiceTests extends AntApplicationTests {

    @Autowired
    private IQiNiuService qiNiuService;

    @Test
    public void testUploadFile() {
        String fileName = "C:\\Users\\Thinkpad\\IdeaProjects\\ant\\tmpctuegirl.jpg";
        File file = new File(fileName);

        Assert.assertTrue(file.exists());

        try {
            Response response = qiNiuService.uploadFile(file);//请求服务
            Assert.assertTrue(response.isOK());//ji'r
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelete() {
        String key = "FmpPD56F0OFalR0a1oe8mdWKwdlC";
        try {
            Response response = qiNiuService.delete(key);
            Assert.assertTrue(response.isOK());
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }
}

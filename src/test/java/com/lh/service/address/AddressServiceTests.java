package com.lh.service.address;

import com.lh.AntApplicationTests;
import com.lh.service.ServiceResult;
import com.lh.service.house.IAddressService;
import com.lh.service.search.BaiduMapLocation;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 水越帆
 * QQ:1548353431
 */
public class AddressServiceTests extends AntApplicationTests {

    @Autowired
    private IAddressService addressService;

    @Test
    public void testGetMapLocation(){
        String city = "深圳";
        String address = "深圳市宝安区西乡街道金海路12号";
        ServiceResult<BaiduMapLocation> serviceResult = addressService.getBaiduMapLocation(city, address);

        Assert.assertTrue(serviceResult.isSuccess());

        Assert.assertTrue(serviceResult.getResult().getLongitude()>0);
        Assert.assertTrue(serviceResult.getResult().getLatitude()>0);
    }
}

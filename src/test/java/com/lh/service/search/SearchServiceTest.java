package com.lh.service.search;

import com.lh.AntApplicationTests;
import com.lh.service.ServiceMultiResult;
import com.lh.web.form.RentSearch;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 水越帆
 * QQ:1548353431
 */
public class SearchServiceTest extends AntApplicationTests {

    @Autowired
    private ISearchService searchService;

    @Test
    public void testIndex(){
        Long targetHouseId = 15L;
        searchService.index(targetHouseId);
    }

    @Test
    public void testRemove(){
        Long targetHouseId = 15L;
        searchService.remove(targetHouseId);
    }
    @Test
    public void testQuery(){
        RentSearch rentSearch = new RentSearch();
        rentSearch.setCityEnName("bj");
        rentSearch.setStart(0);
        rentSearch.setSize(10);
        ServiceMultiResult<Long> s = searchService.query(rentSearch);
        Assert.assertEquals(8,s.getTotal());
    }
}

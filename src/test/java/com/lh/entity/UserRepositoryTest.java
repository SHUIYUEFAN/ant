package com.lh.entity;

import com.lh.AntApplicationTests;
import com.lh.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: 水越帆
 * @date: Create in 18:06 2018/11/22
 * QQ:1548353431
 */
public class UserRepositoryTest extends AntApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        //System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++"+user);
        Assert.assertEquals("luhao",user.getName());
    }
}

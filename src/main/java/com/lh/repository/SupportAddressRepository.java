package com.lh.repository;

import com.lh.entity.SupportAddress;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 根据行政级别获取所有支持地址信息
 * @Author: 水越帆
 * @date: Create in 9:28 2018/11/28
 * QQ:1548353431
 */
public interface SupportAddressRepository extends CrudRepository<SupportAddress,Long> {

    /**
     * 获取所有对应行政级别的信息
     * @return
     */
    List<SupportAddress> findAllByLevel(String level);

    SupportAddress findByEnNameAndLevel(String enName, String level);

    SupportAddress findByEnNameAndBelongTo(String enName, String belongTo);

    List<SupportAddress> findAllByLevelAndBelongTo(String level, String belongTo);
}

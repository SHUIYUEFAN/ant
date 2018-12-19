package com.lh.repository;

import com.lh.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Author: 水越帆
 * @date: Create in 18:08 2018/11/28
 * QQ:1548353431
 */
public interface SubwayRepository extends CrudRepository<Subway,Long> {
    List<Subway> findAllByCityEnName(String cityEnName);
}

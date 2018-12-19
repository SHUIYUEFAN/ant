package com.lh.repository;

import java.util.List;

import com.lh.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;


/**
 * @Author: 水越帆
 * @date: Create in 18:16 2018/11/28
 * QQ:1548353431
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}

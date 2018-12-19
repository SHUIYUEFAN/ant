package com.lh.repository;

import com.lh.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Author: 水越帆
 * @date: Create in 18:16 2018/11/28
 * QQ:1548353431
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail,Long> {

    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}

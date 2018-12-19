package com.lh.repository;

import com.lh.entity.SubwayStation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @Author: 水越帆
 * @date: Create in 18:21 2018/11/28
 * QQ:1548353431
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {

    List<SubwayStation> findAllBySubwayId(Long subwayId);
}

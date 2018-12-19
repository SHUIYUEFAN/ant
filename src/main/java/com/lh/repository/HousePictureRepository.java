package com.lh.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lh.entity.HousePicture;

/**
 * @Author: 水越帆
 * @date: Create in 18:16 2018/11/28
 * QQ:1548353431
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}

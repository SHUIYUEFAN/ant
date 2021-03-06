package com.lh.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.lh.entity.HouseSubscribe;

/**
 * @Author: 水越帆
 * @date: Create in 18:16 2018/11/28
 * QQ:1548353431
 */
public interface HouseSubscribeRespository extends PagingAndSortingRepository<HouseSubscribe, Long>{

    HouseSubscribe findByHouseIdAndUserId(Long houseId, Long loginUserId);

    Page<HouseSubscribe> findAllByUserIdAndStatus(Long userId, int status, Pageable pageable);

    Page<HouseSubscribe> findAllByAdminIdAndStatus(Long adminId, int status, Pageable pageable);

    HouseSubscribe findByHouseIdAndAdminId(Long houseId, Long adminId);

    @Modifying
    @Query("update HouseSubscribe as subscribe set subscribe.status = :status where subscribe.id = :id")
    void updateStatus(@Param(value = "id") Long id, @Param(value = "status") int status);
}

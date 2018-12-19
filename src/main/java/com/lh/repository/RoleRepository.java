package com.lh.repository;

import com.lh.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 角色数据DAO
 * @Author: 水越帆
 * @date: Create in 1:44 2018/11/25
 * QQ:1548353431
 */
public interface RoleRepository extends CrudRepository<Role,Long >{
    List<Role> findRolesByUserId(Long userId);
}

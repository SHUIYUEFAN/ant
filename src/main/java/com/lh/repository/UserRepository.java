package com.lh.repository;

import com.lh.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.method.P;

/**
 * @Author: 水越帆
 * QQ:1548353431
 */
public interface UserRepository extends CrudRepository<User,Long> {

    User findByName(String userName);

    User findUserByPhoneNumber(String telephone);

    /**
     * 修改数据
     * @param id
     * @param name
     */
    @Modifying
    @Query("update User as user set user.name = :name where id = :id")
    void updateUsername(@Param(value = "id") Long id, @Param(value = "name") String name);

    @Modifying
    @Query("update User as user set user.email = :email where id = :id")
    void updateEmail(@Param(value = "id") Long id, @Param(value = "email") String email);

    @Modifying
    @Query("update User as user set user.password = :password where id = :id")
    void updatePassword(@Param(value = "id") Long id, @Param(value = "password") String password);
}

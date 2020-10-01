package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    /**
     * 新增用户
     * @param id
     * @param username
     * @param password
     * @return
     */
    Integer insert(@Param("id") String id, @Param("username") String username, @Param("password") String password);

    /**
     * 删除用户
     * @param id
     * @param isDelete
     * @return
     */
    Integer delete(@Param("id") String id, @Param("isDelete") Integer isDelete);

    /**
     * 修改用户
     * @param id
     * @param username
     * @param password
     * @return
     */
    Integer update(@Param("id") String id, @Param("username") String username, @Param("password") String password);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    String getById(@Param("id") String id);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    Integer getUserByName (@Param("username") String username);

    /**
     * 查询用户名数量
     * @param username
     * @return
     */
    Integer count(@Param("username") String username);

}

package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.UserByRoleDO;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
public interface UserByRoleService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    UserByRoleDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<UserByRoleDO> find(UserByRoleDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(UserByRoleDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(UserByRoleDO entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(int id);


    /**
     * 根据ID查找
     * @param id
     * @return
     */
    List<UserByRoleDO> getById(int id);

    /**
     * 根据 Roleid  查找
     * @param roleid
     * @return
     */
    List<UserByRoleDO> getByRoleid(int roleid);


    /**
     * 根据 Userid  查找
     * @param userid
     * @return
     */
    List<UserByRoleDO> getByUserid(int userid);

}

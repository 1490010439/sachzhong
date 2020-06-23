package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.OperationDO;
import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.RoleDO;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
public interface RoleByMenuService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    RoleByMenuDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<RoleByMenuDO> find(RoleByMenuDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(RoleByMenuDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(RoleByMenuDO entity);

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
    List<RoleByMenuDO> getById(int id);

    /**
     * 根据 Roleid  查找
     * @param roleid
     * @return
     */
    List<RoleByMenuDO> getByRoleid(int roleid);


    /**
     * 根据 Menuid  查找
     * @param menuid
     * @return
     */
    List<RoleByMenuDO> getByMenuid(int menuid);


}

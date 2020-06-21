package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.MenuByOperationDO;

import java.util.List;
/**
 * @classname MenuByOperationService
 * @author SachZhong 钟盛勤
 * @date 2020/6/21 19:23
 */
public interface MenuByOperationService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    MenuByOperationDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<MenuByOperationDO> find(MenuByOperationDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(MenuByOperationDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(MenuByOperationDO entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(int id);


}

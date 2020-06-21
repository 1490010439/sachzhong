package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.MenuDO;
import java.util.List;

/**
 * @classname MenuService
 * @author SachZhong 钟盛勤
 * @date 2020/6/21 19:22
 */
public interface MenuService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    MenuDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<MenuDO> find(MenuDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(MenuDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(MenuDO entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(int id);

}

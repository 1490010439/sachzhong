package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.UserDO;
import com.github.pagehelper.PageInfo;

import java.util.List;


/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
public interface UserService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    UserDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<UserDO> find(UserDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(UserDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(UserDO entity);

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
    UserDO getById(int id);

  /**
   * @author SachZhong 钟盛勤
   * @date 2020/6/22 11:21
   * @info :分页
   *
   */
    PageInfo<UserDO> getPage(int pageNum, int pageSize, UserDO userDO );

}

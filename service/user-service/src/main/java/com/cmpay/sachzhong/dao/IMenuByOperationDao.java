/*
 * @ClassName IMenuByOperationDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 19:33:01
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.MenuByOperationDO;
import com.cmpay.sachzhong.entity.MenuByOperationDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMenuByOperationDao extends BaseDao<MenuByOperationDO, MenuByOperationDOKey> {
}
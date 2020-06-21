/*
 * @ClassName IRoleByMenuDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.RoleByMenuDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRoleByMenuDao extends BaseDao<RoleByMenuDO, RoleByMenuDOKey> {
}
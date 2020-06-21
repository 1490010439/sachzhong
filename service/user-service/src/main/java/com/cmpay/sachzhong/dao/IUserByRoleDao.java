/*
 * @ClassName IUserByRoleDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.UserByRoleDO;
import com.cmpay.sachzhong.entity.UserByRoleDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserByRoleDao extends BaseDao<UserByRoleDO, UserByRoleDOKey> {
}
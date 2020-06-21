/*
 * @ClassName IUserDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 14:01:26
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.entity.UserDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserDao extends BaseDao<UserDO, UserDOKey> {
}
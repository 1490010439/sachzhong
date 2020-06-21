/*
 * @ClassName IOperationDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.OperationDO;
import com.cmpay.sachzhong.entity.OperationDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOperationDao extends BaseDao<OperationDO, OperationDOKey> {
}
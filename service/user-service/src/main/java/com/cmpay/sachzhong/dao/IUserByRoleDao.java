/*
 * @ClassName IUserByRoleDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.UserByRoleDO;
import com.cmpay.sachzhong.entity.UserByRoleDOExample;
import com.cmpay.sachzhong.entity.UserByRoleDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserByRoleDao extends BaseDao<UserByRoleDO, UserByRoleDOKey> {
    /**
     * @Title countByExample
     * @param example
     * @return 
     */
    int countByExample(UserByRoleDOExample example);

    /**
     * @Title deleteByExample
     * @param example
     * @return 
     */
    int deleteByExample(UserByRoleDOExample example);

    /**
     * @Title selectByExample
     * @param example
     * @return 
     */
    List<UserByRoleDO> selectByExample(UserByRoleDOExample example);

    /**
     * @Title updateByExampleSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByExampleSelective(@Param("record") UserByRoleDO record, @Param("example") UserByRoleDOExample example);

    /**
     * @Title updateByExample
     * @param record
     * @param example
     * @return 
     */
    int updateByExample(@Param("record") UserByRoleDO record, @Param("example") UserByRoleDOExample example);
}
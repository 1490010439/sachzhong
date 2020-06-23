/*
 * @ClassName IRoleByMenuDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.RoleByMenuDOExample;
import com.cmpay.sachzhong.entity.RoleByMenuDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IRoleByMenuDao extends BaseDao<RoleByMenuDO, RoleByMenuDOKey> {
    /**
     * @Title countByExample
     * @param example
     * @return 
     */
    int countByExample(RoleByMenuDOExample example);

    /**
     * @Title deleteByExample
     * @param example
     * @return 
     */
    int deleteByExample(RoleByMenuDOExample example);

    /**
     * @Title selectByExample
     * @param example
     * @return 
     */
    List<RoleByMenuDO> selectByExample(RoleByMenuDOExample example);

    /**
     * @Title updateByExampleSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByExampleSelective(@Param("record") RoleByMenuDO record, @Param("example") RoleByMenuDOExample example);

    /**
     * @Title updateByExample
     * @param record
     * @param example
     * @return 
     */
    int updateByExample(@Param("record") RoleByMenuDO record, @Param("example") RoleByMenuDOExample example);
}
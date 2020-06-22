package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.RoleDO;
import com.cmpay.sachzhong.entity.RoleDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDOMapper extends IRoleDao {
    int countByExample(RoleDOExample example);

    int deleteByExample(RoleDOExample example);

    int deleteByPrimaryKey(Integer roleId);


    int insertSelective(RoleDO record);

    List<RoleDO> selectByExample(RoleDOExample example);

    RoleDO selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleDO record, @Param("example") RoleDOExample example);

    int updateByExample(@Param("record") RoleDO record, @Param("example") RoleDOExample example);

    int updateByPrimaryKeySelective(RoleDO record);

    int updateByPrimaryKey(RoleDO record);
}
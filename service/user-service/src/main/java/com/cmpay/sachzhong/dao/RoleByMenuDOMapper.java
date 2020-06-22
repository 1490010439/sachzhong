package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.RoleByMenuDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleByMenuDOMapper extends IRoleByMenuDao{
    int countByExample(RoleByMenuDOExample example);

    int deleteByExample(RoleByMenuDOExample example);

    int deleteByPrimaryKey(Integer rolebymenuId);


    int insertSelective(RoleByMenuDO record);

    List<RoleByMenuDO> selectByExample(RoleByMenuDOExample example);

    RoleByMenuDO selectByPrimaryKey(Integer rolebymenuId);

    int updateByExampleSelective(@Param("record") RoleByMenuDO record, @Param("example") RoleByMenuDOExample example);

    int updateByExample(@Param("record") RoleByMenuDO record, @Param("example") RoleByMenuDOExample example);

    int updateByPrimaryKeySelective(RoleByMenuDO record);

    int updateByPrimaryKey(RoleByMenuDO record);
}
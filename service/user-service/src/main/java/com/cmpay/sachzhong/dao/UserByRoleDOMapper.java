package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.UserByRoleDO;
import com.cmpay.sachzhong.entity.UserByRoleDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserByRoleDOMapper extends IUserByRoleDao{
    int countByExample(UserByRoleDOExample example);

    int deleteByExample(UserByRoleDOExample example);

    int deleteByPrimaryKey(Integer userbyroleId);


    int insertSelective(UserByRoleDO record);

    List<UserByRoleDO> selectByExample(UserByRoleDOExample example);

    UserByRoleDO selectByPrimaryKey(Integer userbyroleId);

    int updateByExampleSelective(@Param("record") UserByRoleDO record, @Param("example") UserByRoleDOExample example);

    int updateByExample(@Param("record") UserByRoleDO record, @Param("example") UserByRoleDOExample example);

    int updateByPrimaryKeySelective(UserByRoleDO record);

    int updateByPrimaryKey(UserByRoleDO record);
}
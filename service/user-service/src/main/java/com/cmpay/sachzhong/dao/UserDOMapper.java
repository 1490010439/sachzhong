package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.entity.UserDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDOMapper extends IUserDao{
    int countByExample(UserDOExample example);

    int deleteByExample(UserDOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserDOExample example);

    UserDO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}
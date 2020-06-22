package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.MenuByOperationDO;
import com.cmpay.sachzhong.entity.MenuByOperationDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuByOperationDOMapper extends IMenuByOperationDao{
    int countByExample(MenuByOperationDOExample example);

    int deleteByExample(MenuByOperationDOExample example);

    int deleteByPrimaryKey(Integer menubyoperationId);

    int insertSelective(MenuByOperationDO record);

    List<MenuByOperationDO> selectByExample(MenuByOperationDOExample example);

    MenuByOperationDO selectByPrimaryKey(Integer menubyoperationId);

    int updateByExampleSelective(@Param("record") MenuByOperationDO record, @Param("example") MenuByOperationDOExample example);

    int updateByExample(@Param("record") MenuByOperationDO record, @Param("example") MenuByOperationDOExample example);

    int updateByPrimaryKeySelective(MenuByOperationDO record);

    int updateByPrimaryKey(MenuByOperationDO record);
}
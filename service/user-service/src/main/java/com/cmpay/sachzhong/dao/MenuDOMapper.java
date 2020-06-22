package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.MenuDO;
import com.cmpay.sachzhong.entity.MenuDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDOMapper extends IMenuDao{
    int countByExample(MenuDOExample example);

    int deleteByExample(MenuDOExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insertSelective(MenuDO record);

    List<MenuDO> selectByExample(MenuDOExample example);

    MenuDO selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") MenuDO record, @Param("example") MenuDOExample example);

    int updateByExample(@Param("record") MenuDO record, @Param("example") MenuDOExample example);

    int updateByPrimaryKeySelective(MenuDO record);

    int updateByPrimaryKey(MenuDO record);
}
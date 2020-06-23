/*
 * @ClassName IMenuByOperationDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.MenuByOperationDO;
import com.cmpay.sachzhong.entity.MenuByOperationDOExample;
import com.cmpay.sachzhong.entity.MenuByOperationDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IMenuByOperationDao extends BaseDao<MenuByOperationDO, MenuByOperationDOKey> {
    /**
     * @Title countByExample
     * @param example
     * @return 
     */
    int countByExample(MenuByOperationDOExample example);

    /**
     * @Title deleteByExample
     * @param example
     * @return 
     */
    int deleteByExample(MenuByOperationDOExample example);

    /**
     * @Title selectByExample
     * @param example
     * @return 
     */
    List<MenuByOperationDO> selectByExample(MenuByOperationDOExample example);

    /**
     * @Title updateByExampleSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByExampleSelective(@Param("record") MenuByOperationDO record, @Param("example") MenuByOperationDOExample example);

    /**
     * @Title updateByExample
     * @param record
     * @param example
     * @return 
     */
    int updateByExample(@Param("record") MenuByOperationDO record, @Param("example") MenuByOperationDOExample example);
}
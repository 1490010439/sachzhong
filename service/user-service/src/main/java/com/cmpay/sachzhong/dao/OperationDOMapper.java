package com.cmpay.sachzhong.dao;

import com.cmpay.sachzhong.entity.OperationDO;
import com.cmpay.sachzhong.entity.OperationDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperationDOMapper extends IOperationDao{
    int countByExample(OperationDOExample example);

    int deleteByExample(OperationDOExample example);

    int deleteByPrimaryKey(Integer operationId);

    int insertSelective(OperationDO record);

    List<OperationDO> selectByExample(OperationDOExample example);

    OperationDO selectByPrimaryKey(Integer operationId);

    int updateByExampleSelective(@Param("record") OperationDO record, @Param("example") OperationDOExample example);

    int updateByExample(@Param("record") OperationDO record, @Param("example") OperationDOExample example);

    int updateByPrimaryKeySelective(OperationDO record);

    int updateByPrimaryKey(OperationDO record);
}
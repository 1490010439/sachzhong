package com.cmpay.sachzhong.service;

import com.cmpay.sachzhong.entity.OperationDO;

import java.util.List;

public interface OperationService {

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    OperationDO get(int id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<OperationDO> find(OperationDO entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(OperationDO entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(OperationDO entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(int id);

}

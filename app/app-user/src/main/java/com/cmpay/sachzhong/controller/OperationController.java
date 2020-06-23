package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.OperationRspDTO;
import com.cmpay.sachzhong.entity.OperationDO;
import com.cmpay.sachzhong.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname RoleController
 * @author SachZhong 钟盛勤
 * @date 2020/6/22 17:21
 * 操作接口
 */

@RestController
@RequestMapping("/sachzhong/operation")
public class OperationController {

    @Autowired
    OperationService operationService;

    /**
     * 查询信息 根据ID
     */
    @GetMapping("/getById")
    public DefaultRspDTO<OperationRspDTO> getById(@QueryBody int id)
    {
        OperationDO operationDO = operationService.get(id);
        OperationRspDTO operationRspDTO=new OperationRspDTO();
        BeanUtils.copyProperties(operationRspDTO, operationDO);
        return DefaultRspDTO.newSuccessInstance(operationRspDTO);
    }

    /**
     * 查找信息
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<OperationDO>> find(@QueryBody OperationDO operationDO) {

        List<OperationDO> list = operationService.find(operationDO);

        return DefaultRspDTO.newSuccessInstance(list);
    }



    /**
     * 更新信息
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody OperationDO operationDO) {

        int result = operationService.update(operationDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * 添加信息
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody OperationDO operationDO) {

        int result = operationService.insert(operationDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除信息
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = operationService.delete(id);

        return DefaultRspDTO.newSuccessInstance(result);
    }


}

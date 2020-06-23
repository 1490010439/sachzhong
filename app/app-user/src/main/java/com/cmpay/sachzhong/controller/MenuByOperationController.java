package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.entity.MenuByOperationDO;
import com.cmpay.sachzhong.service.MenuByOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname MenuByOperationService
 * @author SachZhong 钟盛勤
 * @date 2020/6/21 19:23
 */
@RestController
@RequestMapping("/sachzhong/menubyoperation")
public class MenuByOperationController {

    @Autowired
    MenuByOperationService menuByOperationService;


    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<MenuByOperationDO>> find(@QueryBody MenuByOperationDO entity) {

        List<MenuByOperationDO> list = menuByOperationService.find(entity);

        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 插入数据
     * @param entity
     * @return
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody MenuByOperationDO entity) {

        int result = menuByOperationService.insert(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 更新数据
     * @param entity
     * @return
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody MenuByOperationDO entity) {
        int result = menuByOperationService.update(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = menuByOperationService.delete(id);
        return DefaultRspDTO.newSuccessInstance(result);
    }
    /**
     * 根据ID查找
     * @param id
     * @return
     */
    @GetMapping("/getById")
    public DefaultRspDTO< List<MenuByOperationDO>> getById(@QueryBody int id)
    {
        List<MenuByOperationDO> list = menuByOperationService.getById(id);
        return DefaultRspDTO.newSuccessInstance(list);
    }
    /**
     * 根据Operationid查找
     * @param operationid
     * @return
     */
    @GetMapping("/getByOperationid")
    public DefaultRspDTO< List<MenuByOperationDO>> getByOperationid(@QueryBody int operationid)
    {
        List<MenuByOperationDO> list = menuByOperationService.getById(operationid);
        return DefaultRspDTO.newSuccessInstance(list);
    }
    /**
     * 根据Menuid查找
     * @param menuid
     * @return
     */
    @GetMapping("/getByMenuid")
    public DefaultRspDTO< List<MenuByOperationDO>> getByMenuid(@QueryBody int menuid)
    {
        List<MenuByOperationDO> list = menuByOperationService.getByMenuid(menuid);
        return DefaultRspDTO.newSuccessInstance(list);
    }
}

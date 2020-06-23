package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.service.RoleByMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
@RestController
@RequestMapping("/sachzhong/rolebymenu")
public class RoleByMenuController {

    @Autowired
    RoleByMenuService roleByMenuService;


    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<RoleByMenuDO>> find(@QueryBody RoleByMenuDO entity) {

        List<RoleByMenuDO> list = roleByMenuService.find(entity);

        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 插入数据
     * @param entity
     * @return
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody RoleByMenuDO entity) {
        int result = roleByMenuService.insert(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 更新数据
     * @param entity
     * @return
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody RoleByMenuDO entity) {
        int result = roleByMenuService.update(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = roleByMenuService.delete(id);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    @GetMapping("/getById")
    public DefaultRspDTO< List<RoleByMenuDO>> getById(@QueryBody int id)
    {
        List<RoleByMenuDO> list = roleByMenuService.getById(id);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 根据 Roleid  查找
     * @param roleid
     * @return
     */
    @GetMapping("/getByRoleid")
    public DefaultRspDTO< List<RoleByMenuDO>> getByRoleid(@QueryBody int roleid)
    {
        List<RoleByMenuDO> list = roleByMenuService.getById(roleid);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 根据 Menuid  查找
     * @param menuid
     * @return
     */
    @GetMapping("/getByMenuid")
    public DefaultRspDTO< List<RoleByMenuDO>> getByMenuid(@QueryBody int menuid)
    {
        List<RoleByMenuDO> list = roleByMenuService.getByMenuid(menuid);
        return DefaultRspDTO.newSuccessInstance(list);
    }

}

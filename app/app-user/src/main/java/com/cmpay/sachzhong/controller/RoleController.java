package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.RoleRspDTO;
import com.cmpay.sachzhong.entity.RoleDO;
import com.cmpay.sachzhong.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname RoleController
 * @author SachZhong 钟盛勤
 * @date 2020/6/22 17:21
 * 角色接口
 */

@RestController
@RequestMapping("/sachzhong/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    /**
     * 查询信息 根据ID
     */
    @GetMapping("/getById")
    public DefaultRspDTO<RoleRspDTO> getById(@QueryBody int id)
    {
        RoleDO roleDO = roleService.get(id);
        RoleRspDTO roleRspDTO=new RoleRspDTO();
        BeanUtils.copyProperties(roleRspDTO, roleDO);
        return DefaultRspDTO.newSuccessInstance(roleRspDTO);
    }

    /**
     * 查找信息
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<RoleDO>> find(@QueryBody RoleDO roleDO) {

        List<RoleDO> list = roleService.find(roleDO);

        return DefaultRspDTO.newSuccessInstance(list);
    }



    /**
     * 更新信息
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody RoleDO roleDO) {

        int result = roleService.update(roleDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * 添加信息
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody RoleDO roleDO) {

        int result = roleService.insert(roleDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除信息
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = roleService.delete(id);

        return DefaultRspDTO.newSuccessInstance(result);
    }


}

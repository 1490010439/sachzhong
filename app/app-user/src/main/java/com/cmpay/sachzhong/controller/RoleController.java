package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.common.utils.JudgeUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.RolePageRspDTO;
import com.cmpay.sachzhong.entity.RoleDO;
import com.cmpay.sachzhong.service.RoleService;
import com.cmpay.sachzhong.utils.BeanConvertUtils;
import com.github.pagehelper.PageInfo;
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
     * 查询全部信息
     */
    @GetMapping("/select")
    public DefaultRspDTO<List<RoleDO>> select()
    {
        List<RoleDO> list = roleService.selectList();
        return DefaultRspDTO.newSuccessInstance(list);
    }


    @PostMapping("/list")
    public DefaultRspDTO<RolePageRspDTO> list(@RequestBody RolePageRspDTO rolePageRspDTO) {
        RoleDO roleDO = new RoleDO();
        if (JudgeUtils.isNotNull(rolePageRspDTO.getRoleDOS())) {
            roleDO = BeanUtils.copyPropertiesReturnDest(new RoleDO(), rolePageRspDTO.getRoleDOS());
        }
        PageInfo<RoleDO> pageInfo = roleService.getPage(rolePageRspDTO.getPageNum(), rolePageRspDTO.getPageSize(), roleDO);
        RolePageRspDTO roleRspDTO = new RolePageRspDTO();
        roleRspDTO.setRoleDOS(BeanConvertUtils.convertList(pageInfo.getList(), RoleDO.class));
        roleRspDTO.setPageNum(pageInfo.getPageNum());
        roleRspDTO.setPageSize(pageInfo.getPageSize());
        roleRspDTO.setPages(pageInfo.getPages());
        roleRspDTO.setTotal(pageInfo.getTotal());
        return DefaultRspDTO.newSuccessInstance(roleRspDTO);
    }

    /**
     * 查询信息 根据ID
     */
    @GetMapping("/getById")
    public DefaultRspDTO<RoleDO> getById(@QueryBody int id)
    {
        RoleDO roleDO = roleService.getById(id).get(0);
        return DefaultRspDTO.newSuccessInstance(roleDO);
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
    public DefaultRspDTO<Integer> update(@RequestBody RoleDO roleDO) {

        int result = roleService.update(roleDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * 添加信息
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@RequestBody RoleDO roleDO) {

        int result = roleService.insert(roleDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除信息
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@RequestBody int id) {

        int result = roleService.delete(id);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 根据 roleNumber 操作编号 查找
     * @param roleNumber
     * @return
     */
    @GetMapping("/getByRoleNumber")
    public DefaultRspDTO<List<RoleDO>> getByRoleNumber(String roleNumber)
    {
        List<RoleDO> list = roleService.getByRoleNumber(roleNumber);
        return DefaultRspDTO.newSuccessInstance(list);
    }

}

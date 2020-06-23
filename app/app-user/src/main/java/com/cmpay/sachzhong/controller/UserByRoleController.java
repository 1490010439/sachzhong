package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.entity.UserByRoleDO;
import com.cmpay.sachzhong.service.UserByRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
@RestController
@RequestMapping("/sachzhong/userbyrole")
public class UserByRoleController {

    @Autowired
    UserByRoleService userByRoleService;

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<UserByRoleDO>> find(@QueryBody UserByRoleDO entity) {

        List<UserByRoleDO> list = userByRoleService.find(entity);

        return DefaultRspDTO.newSuccessInstance(list);
    }
    /**
     * 插入数据
     * @param entity
     * @return
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody UserByRoleDO entity) {
        int result = userByRoleService.insert(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 更新数据
     * @param entity
     * @return
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody UserByRoleDO entity) {
        int result = userByRoleService.update(entity);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = userByRoleService.delete(id);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 根据ID查找
     * @param id
     * @return
     */
    @GetMapping("/getById")
    public DefaultRspDTO< List<UserByRoleDO>> getById(@QueryBody int id)
    {
        List<UserByRoleDO> list = userByRoleService.getById(id);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 根据 Roleid  查找
     * @param roleid
     * @return
     */
    @GetMapping("/getByRoleid")
    public DefaultRspDTO< List<UserByRoleDO>> getByRoleid(@QueryBody int roleid)
    {
        List<UserByRoleDO> list = userByRoleService.getById(roleid);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 根据 Userid  查找
     * @param userid
     * @return
     */
    @GetMapping("/getByUserid")
    public DefaultRspDTO< List<UserByRoleDO>> getByUserid(@QueryBody int userid)
    {
        List<UserByRoleDO> list = userByRoleService.getByUserid(userid);
        return DefaultRspDTO.newSuccessInstance(list);
    }
}

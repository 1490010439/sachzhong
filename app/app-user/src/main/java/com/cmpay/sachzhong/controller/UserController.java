package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.UserRspDTO;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @classname UserController
 * @author SachZhong 钟盛勤
 * @date 2020/6/22 11:21
 * 用户接口
 */
@RestController
@RequestMapping("/sachzhong/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/test")
    public DefaultRspDTO<UserRspDTO> test(@QueryBody UserRspDTO reqDTO)
    {
        return DefaultRspDTO.newSuccessInstance(reqDTO);
    }



    /**
     * 查询用户信息 根据ID
     */
    @GetMapping("/getById")
    public DefaultRspDTO<UserRspDTO> getById(@QueryBody int id)
    {
        UserDO userDO = userService.getById(id);
        UserRspDTO userRspDTO=new UserRspDTO();
        BeanUtils.copyProperties(userRspDTO, userDO);
        return DefaultRspDTO.newSuccessInstance(userRspDTO);
    }

    /**
     * 查找用户信息
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<UserDO>> find(@QueryBody UserDO userDO) {

        List<UserDO> list = userService.find(userDO);

        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * 查询用户信息 分页
     */
    @GetMapping("/getPage")
    public DefaultRspDTO<PageInfo> getPage(int pageNum, int pageSize, UserDO userDO) {

        PageInfo pageInfo = userService.getPage(pageNum,pageSize,userDO);

        return DefaultRspDTO.newSuccessInstance(pageInfo);
    }

    /**
     * 更新用户信息
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@QueryBody UserDO userDO) {

        int result = userService.update(userDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * 添加用户信息
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@QueryBody UserDO userDO) {

        int result = userService.insert(userDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@QueryBody int id) {

        int result = userService.delete(id);

        return DefaultRspDTO.newSuccessInstance(result);
    }




}

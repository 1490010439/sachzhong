package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.UserRspDTO;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * 用户控制器
 *
 * @author : Noone
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
     * 查询用户信息
     */
    @GetMapping("/getById")
    public DefaultRspDTO<UserRspDTO> getById(@QueryBody int id)
    {
        UserDO userDO = userService.getById(id);
        UserRspDTO userRspDTO=new UserRspDTO();
        BeanUtils.copyProperties(userRspDTO, userDO);
        return DefaultRspDTO.newSuccessInstance(userRspDTO);
    }
}

package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.UserRspDTO;
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
    private UserService UserService;


    /**
     * 查询用户信息
     */
    @GetMapping("/test")
    public DefaultRspDTO<UserRspDTO> test(@QueryBody UserRspDTO reqDTO)
    {
        return DefaultRspDTO.newSuccessInstance(reqDTO);
    }


}

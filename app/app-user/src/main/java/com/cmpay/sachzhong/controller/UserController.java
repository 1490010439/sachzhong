package com.cmpay.sachzhong.controller;

import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
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


    /**
     * 查询用户信息 根据ID
     */
    @GetMapping("/getAll")
    public DefaultRspDTO<List<UserDO>> getAll()
    {
        List<UserDO> list = userService.selectUserList();
        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * 查询用户信息 根据ID
     */
    @GetMapping("/getById")
    public DefaultRspDTO<List<UserDO>> getById(@QueryBody int id)
    {
        List<UserDO> list = userService.getById(id);
        return DefaultRspDTO.newSuccessInstance(list);
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


    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :手机登陆 返回用户列表
     *
     */
    @GetMapping("/login")
     public DefaultRspDTO<List<UserDO>> login(String phone, String password)
    {
        List<UserDO> list = userService.login(phone,password);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :查询手机是否存在了 返回用户列表
     *
     */
    @GetMapping("/selectPhone")
    public DefaultRspDTO<List<UserDO>> selectPhone(String phone)
    {
        List<UserDO> list = userService.selectPhone(phone);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :设置查询 返回用户列表
     * select * from user where userid between 1 and 2 order by usertype  DESC
     */
    @GetMapping("/selectByBetween")
    public DefaultRspDTO<List<UserDO>> selectByBetween(String mynode, int betweenstart, int betweenend, String mynodeby, String DESCorASC)
    {
        List<UserDO> list = userService.selectByBetween(mynode,betweenstart,betweenend,mynodeby,DESCorASC);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :注册 返回0（失败），1（成功）
     *
     */
    @GetMapping("/reg")
    public DefaultRspDTO<Integer>  reg(UserDO user)
    {
        int result = userService.reg(user);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :根据用户名查询
     *
     */
    @GetMapping("/selectUserName")
    public DefaultRspDTO<List<UserDO>> selectUserName(String username)
    {
        List<UserDO> list = userService.selectUserName(username);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :根据用户名模糊查询
     *
     */
    @GetMapping("/selectUserLikeName")
    public DefaultRspDTO<List<UserDO>> selectUserLikeName(String username)
    {
        List<UserDO> list = userService.selectUserLikeName(username);
        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :根据邮箱查询
     *
     */
    @GetMapping("/selectUsermail")
    public DefaultRspDTO<List<UserDO>> selectUsermail(String usermail)
    {
        List<UserDO> list = userService.selectUsermail(usermail);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :自定义分页
     *
     */
    @GetMapping("/selectUserPage")
    public DefaultRspDTO<List<UserDO>> selectUserPage(String userdeletetype,int page, int size)
    {
        List<UserDO> list = userService.selectUserPage(userdeletetype,page,size);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :统计删除或者未删除的用户
     *
     */
    @GetMapping("/selectUserCount")
    public DefaultRspDTO<Integer> selectUserCount(String userdeletetype)
    {
        int result = userService.selectUserCount(userdeletetype);
        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :更新用户金钱
     *
     */
    @GetMapping("/updateUserMoney")
    public DefaultRspDTO<Integer> updateUserMoney(float money,int id)
    {
        int result = userService.updateUserMoney(money,id);
        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :模糊查询用户
     *
     */
    @GetMapping("/selectLike")
    public DefaultRspDTO<List<UserDO>> selectLike(String value)
    {
        List<UserDO> list = userService.selectLike(value);
        return DefaultRspDTO.newSuccessInstance(list);
    }


}

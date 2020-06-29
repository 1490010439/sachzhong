package com.cmpay.sachzhong.controller;

import com.alibaba.fastjson.JSONObject;
import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.common.utils.JudgeUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.DefaultRspDTO;
import com.cmpay.sachzhong.dto.UserDTO;
import com.cmpay.sachzhong.dto.UserPageRspDTO;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.service.UserService;
import com.cmpay.sachzhong.utils.BeanConvertUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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

    @PostMapping("/list")
    public DefaultRspDTO<UserPageRspDTO> list(@RequestBody UserPageRspDTO userPageReqDTO) {
        UserDO userDO = new UserDO();
        if (JudgeUtils.isNotNull(userPageReqDTO.getUsers())) {
            userDO = BeanUtils.copyPropertiesReturnDest(new UserDO(), userPageReqDTO.getUsers());
        }
        PageInfo<UserDO> pageInfo = userService.getPage(userPageReqDTO.getPageNum(), userPageReqDTO.getPageSize(), userDO);
        UserPageRspDTO userRspDTO = new UserPageRspDTO();
        userRspDTO.setUsers(BeanConvertUtils.convertList(pageInfo.getList(), UserDO.class));
        userRspDTO.setPageNum(pageInfo.getPageNum());
        userRspDTO.setPageSize(pageInfo.getPageSize());
        userRspDTO.setPages(pageInfo.getPages());
        userRspDTO.setTotal(pageInfo.getTotal());
        return DefaultRspDTO.newSuccessInstance(userRspDTO);
    }


    /**
     * 查询全部用户信息
     */
    @PostMapping("/list1")
    public DefaultRspDTO<List<UserDO>> list1()
    {
        List<UserDO> list = userService.selectUserList();
        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * 查询全部用户信息
     */
    @GetMapping("/info")
    public DefaultRspDTO<List<UserDO>> info()
    {
        List<UserDO> list = userService.selectUserList();
        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * 查询全部用户信息
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
    public DefaultRspDTO<List<UserDO>> getById(@Validated @QueryBody int id)
    {
        List<UserDO> list = userService.getById(id);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * 查找用户信息
     */
    @GetMapping("/find")
    public DefaultRspDTO<List<UserDO>> find(@Validated @QueryBody UserDO userDO) {

        List<UserDO> list = userService.find(userDO);

        return DefaultRspDTO.newSuccessInstance(list);
    }


    /**
     * 查询用户信息 分页
     */
    @GetMapping("/getPage")
    public DefaultRspDTO<PageInfo> getPage(@Validated @RequestBody int pageNum, int pageSize, UserDO userDO) {

        PageInfo pageInfo = userService.getPage(pageNum,pageSize,userDO);

        return DefaultRspDTO.newSuccessInstance(pageInfo);
    }


    /**
     * 更新用户信息
     */
    @PutMapping("/update")
    public DefaultRspDTO<Integer> update(@Validated @RequestBody UserDO userDO) {

        int result = userService.update(userDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }


    /**
     * 添加用户信息
     */
    @PostMapping("/insert")
    public DefaultRspDTO<Integer> insert(@Validated @RequestBody UserDO userDO) {

        int result = userService.insert(userDO);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * 删除用户信息
     */
    @DeleteMapping("/delete")
    public DefaultRspDTO<Integer> delete(@Validated @RequestBody int id) {

        int result = userService.delete(id);

        return DefaultRspDTO.newSuccessInstance(result);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :登陆
     *
     */
    @PostMapping("/login1")
    public DefaultRspDTO<List<UserDO>> login1(@Validated @RequestBody UserDTO user)
    {
        List<UserDO> list = userService.login(user.getUsername(),user.getPassword());
        return DefaultRspDTO.newSuccessInstance(list);
    }
    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :登陆
     *
     */
    @PostMapping("/loginJson")
    public DefaultRspDTO<List<UserDO>> loginJson(@Validated @RequestBody JSONObject data)
    {
        String username = data.getString("username");
        String password = data.getString("password");
        List<UserDO> list = userService.login(username,password);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :手机登陆 返回用户列表
     *
     */
    @PostMapping("/loginByPhone")
     public DefaultRspDTO<List<UserDO>> loginByPhone(@Validated @RequestBody  String phone, String password)
    {
        List<UserDO> list = userService.loginByPhone(phone,password);
        return DefaultRspDTO.newSuccessInstance(list);
    }

    /**
     * @author SachZhong 钟盛勤
     * @date 2020/6/22 11:21
     * @info :查询手机是否存在了 返回用户列表
     *
     */
    @GetMapping("/selectPhone")
    public DefaultRspDTO<List<UserDO>> selectPhone(@Validated @QueryBody String phone)
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
    public DefaultRspDTO<List<UserDO>> selectByBetween(@Validated @QueryBody String mynode, int betweenstart, int betweenend, String mynodeby, String DESCorASC)
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
    @PutMapping("/reg")
    public DefaultRspDTO<Integer>  reg(@Validated @RequestBody UserDO user)
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
    public DefaultRspDTO<List<UserDO>> selectUserName(@Validated @QueryBody String username)
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
    public DefaultRspDTO<List<UserDO>> selectUserLikeName(@Validated @QueryBody String username)
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
    public DefaultRspDTO<List<UserDO>> selectUsermail(@Validated @QueryBody String usermail)
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
    public DefaultRspDTO<List<UserDO>> selectUserPage(@Validated @QueryBody String userdeletetype,int page, int size)
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
    public DefaultRspDTO<Integer> selectUserCount(@Validated @QueryBody String userdeletetype)
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
    public DefaultRspDTO<Integer> updateUserMoney(@Validated @QueryBody float money,int id)
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
    public DefaultRspDTO<List<UserDO>> selectLike(@Validated @QueryBody String value)
    {
        List<UserDO> list = userService.selectLike(value);
        return DefaultRspDTO.newSuccessInstance(list);
    }


}

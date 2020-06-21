/*
 * @ClassName UserDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 14:01:26
 */
package com.cmpay.sachzhong.dto;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class UserRspDTO extends BaseDO {
    /**
     * @Fields userId 用户id
     */
    private Integer userId;
    /**
     * @Fields userMoney 用户的M币
     */
    private Float userMoney;
    /**
     * @Fields userSex 用户性别
     */
    private String userSex;
    /**
     * @Fields userName 用户昵称
     */
    private String userName;
    /**
     * @Fields userImg 用户头像地址
     */
    private String userImg;
    /**
     * @Fields userAge 用户年龄
     */
    private String userAge;
    /**
     * @Fields userIdcard 用户身份证
     */
    private String userIdcard;
    /**
     * @Fields userIdcardname 用户身份证名
     */
    private String userIdcardname;
    /**
     * @Fields userPhone 用户手机
     */
    private String userPhone;
    /**
     * @Fields userMail 用户邮箱
     */
    private String userMail;
    /**
     * @Fields userType 用户类型
     */
    private String userType;
    /**
     * @Fields userPassword 用户密码
     */
    private String userPassword;
    /**
     * @Fields userAddress 用户地址
     */
    private String userAddress;
    /**
     * @Fields userDeletetype 用户是否被删除
     */
    private String userDeletetype;
    /**
     * @Fields userLogintype 用户是否登陆了
     */
    private String userLogintype;
    /**
     * @Fields userLoginip 用户最近的登陆IP
     */
    private String userLoginip;
    /**
     * @Fields userDeletetime 用户被删除的时间
     */
    private LocalDateTime userDeletetime;
    /**
     * @Fields userRegtime 用户创建时间
     */
    private LocalDateTime userRegtime;
    /**
     * @Fields userLogintime 用户最近登陆时间
     */
    private LocalDateTime userLogintime;
    /**
     * @Fields userUpdatetime 用户操作更新时间
     */
    private LocalDateTime userUpdatetime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Float userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getUserIdcardname() {
        return userIdcardname;
    }

    public void setUserIdcardname(String userIdcardname) {
        this.userIdcardname = userIdcardname;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDeletetype() {
        return userDeletetype;
    }

    public void setUserDeletetype(String userDeletetype) {
        this.userDeletetype = userDeletetype;
    }

    public String getUserLogintype() {
        return userLogintype;
    }

    public void setUserLogintype(String userLogintype) {
        this.userLogintype = userLogintype;
    }

    public String getUserLoginip() {
        return userLoginip;
    }

    public void setUserLoginip(String userLoginip) {
        this.userLoginip = userLoginip;
    }

    public LocalDateTime getUserDeletetime() {
        return userDeletetime;
    }

    public void setUserDeletetime(LocalDateTime userDeletetime) {
        this.userDeletetime = userDeletetime;
    }

    public LocalDateTime getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(LocalDateTime userRegtime) {
        this.userRegtime = userRegtime;
    }

    public LocalDateTime getUserLogintime() {
        return userLogintime;
    }

    public void setUserLogintime(LocalDateTime userLogintime) {
        this.userLogintime = userLogintime;
    }

    public LocalDateTime getUserUpdatetime() {
        return userUpdatetime;
    }

    public void setUserUpdatetime(LocalDateTime userUpdatetime) {
        this.userUpdatetime = userUpdatetime;
    }
}
/*
 * @ClassName RoleDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.entity;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class RoleDO extends BaseDO {
    /**
     * @Fields roleId 角色ID
     */
    private Integer roleId;
    /**
     * @Fields roleGrade 角色等级 ,1级最高，数越大越低
     */
    private Integer roleGrade;
    /**
     * @Fields roleName 角色名称
     */
    private String roleName;
    /**
     * @Fields roleNumber 角色编号
     */
    private String roleNumber;
    /**
     * @Fields roleType 角色类型
     */
    private String roleType;
    /**
     * @Fields roleInfo 角色信息
     */
    private String roleInfo;
    /**
     * @Fields roleOpuserid 操作用户id
     */
    private Integer roleOpuserid;
    /**
     * @Fields roleDeletetype 该表是否被删除   true false
     */
    private String roleDeletetype;
    /**
     * @Fields roleFoundtime 该表的创建时间
     */
    private LocalDateTime roleFoundtime;
    /**
     * @Fields roleUpdatetime 该表被修改的时间
     */
    private LocalDateTime roleUpdatetime;
    /**
     * @Fields roleBack 备注
     */
    private String roleBack;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getRoleGrade() {
        return roleGrade;
    }

    public void setRoleGrade(Integer roleGrade) {
        this.roleGrade = roleGrade;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(String roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public Integer getRoleOpuserid() {
        return roleOpuserid;
    }

    public void setRoleOpuserid(Integer roleOpuserid) {
        this.roleOpuserid = roleOpuserid;
    }

    public String getRoleDeletetype() {
        return roleDeletetype;
    }

    public void setRoleDeletetype(String roleDeletetype) {
        this.roleDeletetype = roleDeletetype;
    }

    public LocalDateTime getRoleFoundtime() {
        return roleFoundtime;
    }

    public void setRoleFoundtime(LocalDateTime roleFoundtime) {
        this.roleFoundtime = roleFoundtime;
    }

    public LocalDateTime getRoleUpdatetime() {
        return roleUpdatetime;
    }

    public void setRoleUpdatetime(LocalDateTime roleUpdatetime) {
        this.roleUpdatetime = roleUpdatetime;
    }

    public String getRoleBack() {
        return roleBack;
    }

    public void setRoleBack(String roleBack) {
        this.roleBack = roleBack;
    }
}
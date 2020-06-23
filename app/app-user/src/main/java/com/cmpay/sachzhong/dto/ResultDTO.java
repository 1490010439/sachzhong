package com.cmpay.sachzhong.dto;

import com.cmpay.sachzhong.entity.*;

import java.util.List;

public class ResultDTO {

    List<MenuByOperationDO> menuByOperationRspDTOS;

    List<MenuDO> menuRspDTOS;

    List<OperationDO> operationRspDTOS;

    List<RoleByMenuDO> roleByMenuRspDTOS;

    List<RoleDO> roleRspDTOS;

    List<UserByRoleDO> userByRoleRspDTOS;

    List<UserDO> userRspDTOS;

    public List<MenuByOperationDO> getMenuByOperationRspDTOS() {
        return menuByOperationRspDTOS;
    }

    public void setMenuByOperationRspDTOS(List<MenuByOperationDO> menuByOperationRspDTOS) {
        this.menuByOperationRspDTOS = menuByOperationRspDTOS;
    }

    public List<MenuDO> getMenuRspDTOS() {
        return menuRspDTOS;
    }

    public void setMenuRspDTOS(List<MenuDO> menuRspDTOS) {
        this.menuRspDTOS = menuRspDTOS;
    }

    public List<OperationDO> getOperationRspDTOS() {
        return operationRspDTOS;
    }

    public void setOperationRspDTOS(List<OperationDO> operationRspDTOS) {
        this.operationRspDTOS = operationRspDTOS;
    }

    public List<RoleByMenuDO> getRoleByMenuRspDTOS() {
        return roleByMenuRspDTOS;
    }

    public void setRoleByMenuRspDTOS(List<RoleByMenuDO> roleByMenuRspDTOS) {
        this.roleByMenuRspDTOS = roleByMenuRspDTOS;
    }

    public List<RoleDO> getRoleRspDTOS() {
        return roleRspDTOS;
    }

    public void setRoleRspDTOS(List<RoleDO> roleRspDTOS) {
        this.roleRspDTOS = roleRspDTOS;
    }

    public List<UserByRoleDO> getUserByRoleRspDTOS() {
        return userByRoleRspDTOS;
    }

    public void setUserByRoleRspDTOS(List<UserByRoleDO> userByRoleRspDTOS) {
        this.userByRoleRspDTOS = userByRoleRspDTOS;
    }

    public List<UserDO> getUserRspDTOS() {
        return userRspDTOS;
    }

    public void setUserRspDTOS(List<UserDO> userRspDTOS) {
        this.userRspDTOS = userRspDTOS;
    }
}

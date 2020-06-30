package com.cmpay.sachzhong.dto;

import com.cmpay.sachzhong.entity.RoleDO;
import com.cmpay.sachzhong.entity.UserDO;

import java.util.List;

public class UserByRoleDTO extends UserDO {

    private List<RoleDO> roleIdList;

    private List<Integer> roleIds;

    public List<RoleDO> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<RoleDO> roleIdList) {
        this.roleIdList = roleIdList;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }
}

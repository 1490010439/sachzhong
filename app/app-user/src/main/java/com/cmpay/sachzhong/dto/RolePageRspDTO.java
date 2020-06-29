package com.cmpay.sachzhong.dto;

import com.cmpay.sachzhong.entity.RoleDO;

import java.util.List;

public class RolePageRspDTO extends PageRspDTO{

    private List<RoleDO> roleDOS;

    public List<RoleDO> getRoleDOS() {
        return roleDOS;
    }

    public void setRoleDOS(List<RoleDO> roleDOS) {
        this.roleDOS = roleDOS;
    }
}

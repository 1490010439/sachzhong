package com.cmpay.sachzhong.dto;

import com.cmpay.sachzhong.entity.UserDO;

import java.util.List;

public class UserPageRspDTO extends PageRspDTO{


    private List<UserDO> users;

    public List<UserDO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDO> users) {
        this.users = users;
    }


}

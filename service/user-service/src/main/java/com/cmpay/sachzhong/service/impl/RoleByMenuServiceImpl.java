package com.cmpay.sachzhong.service.impl;

import com.cmpay.sachzhong.dao.IRoleByMenuDao;
import com.cmpay.sachzhong.entity.RoleByMenuDO;
import com.cmpay.sachzhong.entity.RoleByMenuDOKey;
import com.cmpay.sachzhong.service.RoleByMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
public class RoleByMenuServiceImpl implements RoleByMenuService {

    @Autowired
    IRoleByMenuDao iRoleByMenuDao;

    @Override
    public RoleByMenuDO get(int id) {
        RoleByMenuDOKey roleByMenuDOKey=new RoleByMenuDOKey();
        roleByMenuDOKey.setRolebymenuId(id);
        return iRoleByMenuDao.get(roleByMenuDOKey);
    }

    @Override
    public List<RoleByMenuDO> find(RoleByMenuDO entity) {
        return iRoleByMenuDao.find(entity);
    }

    @Override
    public int insert(RoleByMenuDO entity) {
        return iRoleByMenuDao.insert(entity);
    }

    @Override
    public int update(RoleByMenuDO entity) {
        return iRoleByMenuDao.update(entity);
    }

    @Override
    public int delete(int id) {
        RoleByMenuDOKey roleByMenuDOKey=new RoleByMenuDOKey();
        roleByMenuDOKey.setRolebymenuId(id);
        return iRoleByMenuDao.delete(roleByMenuDOKey);
    }
}

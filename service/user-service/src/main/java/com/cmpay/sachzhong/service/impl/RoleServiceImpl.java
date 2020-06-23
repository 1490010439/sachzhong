package com.cmpay.sachzhong.service.impl;

import com.cmpay.sachzhong.dao.IRoleDao;
import com.cmpay.sachzhong.entity.RoleDO;
import com.cmpay.sachzhong.entity.RoleDOExample;
import com.cmpay.sachzhong.entity.RoleDOKey;
import com.cmpay.sachzhong.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    IRoleDao iRoleDao;

    @Override
    public RoleDO get(int id) {
        RoleDOKey roleDOKey=new RoleDOKey();
        roleDOKey.setRoleId(id);
        return iRoleDao.get(roleDOKey);
    }

    @Override
    public List<RoleDO> find(RoleDO entity) {
        return iRoleDao.find(entity);
    }

    @Override
    public int insert(RoleDO entity) {
        return iRoleDao.insert(entity);
    }

    @Override
    public int update(RoleDO entity) {
        return iRoleDao.update(entity);
    }

    @Override
    public int delete(int id) {
        RoleDOKey roleDOKey=new RoleDOKey();
        roleDOKey.setRoleId(id);
        return iRoleDao.delete(roleDOKey);
    }

    @Override
    public List<RoleDO> getById(int id) {
        RoleDOExample roleDOExample =new RoleDOExample();
        RoleDOExample.Criteria criteria =roleDOExample.createCriteria();
        criteria.andRoleIdEqualTo(id);
        return iRoleDao.selectByExample(roleDOExample);
    }

    @Override
    public List<RoleDO> getByRoleNumber(String roleNumber) {
        RoleDOExample roleDOExample =new RoleDOExample();
        RoleDOExample.Criteria criteria =roleDOExample.createCriteria();
        criteria.andRoleNumberEqualTo(roleNumber);
        return iRoleDao.selectByExample(roleDOExample);
    }
}

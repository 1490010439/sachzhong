package com.cmpay.sachzhong.service.impl;

import com.cmpay.sachzhong.dao.IUserByRoleDao;
import com.cmpay.sachzhong.entity.UserByRoleDO;
import com.cmpay.sachzhong.entity.UserByRoleDOExample;
import com.cmpay.sachzhong.entity.UserByRoleDOKey;
import com.cmpay.sachzhong.service.UserByRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @classname UserService
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
@Service
public class UserByRoleServiceImpl implements UserByRoleService {

    @Autowired
    IUserByRoleDao iUserByRoleDao;


    @Override
    public UserByRoleDO get(int id) {

        UserByRoleDOKey userByRoleDOKey=new UserByRoleDOKey();
        userByRoleDOKey.setUserbyroleId(id);
        return    iUserByRoleDao.get(userByRoleDOKey);
    }

    @Override
    public List<UserByRoleDO> find(UserByRoleDO entity) {
        return iUserByRoleDao.find(entity);
    }

    @Override
    public int insert(UserByRoleDO entity) {
        return iUserByRoleDao.insert(entity);
    }

    @Override
    public int update(UserByRoleDO entity) {
        return iUserByRoleDao.update(entity);
    }

    @Override
    public int delete(int id) {
        UserByRoleDOKey userByRoleDOKey=new UserByRoleDOKey();
        userByRoleDOKey.setUserbyroleId(id);
        return iUserByRoleDao.delete(userByRoleDOKey);
    }

    @Override
    public List<UserByRoleDO> getById(int id) {
        UserByRoleDOExample userByRoleDOExample =new UserByRoleDOExample();
        UserByRoleDOExample.Criteria criteria =userByRoleDOExample.createCriteria();
        criteria.andUserbyroleIdEqualTo(id);
        return iUserByRoleDao.selectByExample(userByRoleDOExample);
    }

    @Override
    public List<UserByRoleDO> getByRoleid(int roleid) {
        UserByRoleDOExample userByRoleDOExample =new UserByRoleDOExample();
        UserByRoleDOExample.Criteria criteria =userByRoleDOExample.createCriteria();
        criteria.andUserbyroleRoleidEqualTo(roleid);
        return iUserByRoleDao.selectByExample(userByRoleDOExample);
    }

    @Override
    public List<UserByRoleDO> getByUserid(int userid) {
        UserByRoleDOExample userByRoleDOExample =new UserByRoleDOExample();
        UserByRoleDOExample.Criteria criteria =userByRoleDOExample.createCriteria();
        criteria.andUserbyroleUseridEqualTo(userid);
        return iUserByRoleDao.selectByExample(userByRoleDOExample);
    }
}
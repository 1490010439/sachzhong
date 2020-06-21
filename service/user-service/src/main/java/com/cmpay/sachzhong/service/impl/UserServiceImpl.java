package com.cmpay.sachzhong.service.impl;

import com.cmpay.sachzhong.dao.IUserDao;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.entity.UserDOKey;
import com.cmpay.sachzhong.service.UserService;
import com.cmpay.sachzhong.utils.SqlValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @classname UserServiceImpl
 * @author SachZhong 钟盛勤
 * @date 2020/6/20 14:41
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    IUserDao iUserDao;

    @Override
    public UserDO get(int id) {

        UserDOKey userDOKey=new UserDOKey();
        userDOKey.setUserId(id);

        return iUserDao.get(userDOKey);
    }

    @Override
    public List<UserDO> find(UserDO entity) {
        return iUserDao.find(entity);
    }

    @Override
    public int insert(UserDO entity) {
        return iUserDao.insert(entity);
    }

    @Override
    public int update(UserDO entity) {
        return iUserDao.update(entity);
    }

    @Override
    public int delete(int id) {

        UserDOKey userDOKey=new UserDOKey();
        userDOKey.setUserId(id);

        return iUserDao.delete(userDOKey);
    }

    @Override
    public UserDO getById(int id) {

        SqlValue sqlValue=new SqlValue();
        sqlValue.setIntValue(id);
        return iUserDao.getById(sqlValue);
    }
}

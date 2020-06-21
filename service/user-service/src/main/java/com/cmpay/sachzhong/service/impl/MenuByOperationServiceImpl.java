package com.cmpay.sachzhong.service.impl;

import com.cmpay.sachzhong.dao.IMenuByOperationDao;
import com.cmpay.sachzhong.entity.MenuByOperationDO;
import com.cmpay.sachzhong.entity.MenuByOperationDOKey;
import com.cmpay.sachzhong.service.MenuByOperationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @classname MenuByOperationServiceImpl
 * @author SachZhong 钟盛勤
 * @date 2020/6/21 16:23
 */
public class MenuByOperationServiceImpl implements MenuByOperationService {

    @Autowired
    IMenuByOperationDao iMenuByOperationDao;

    @Override
    public MenuByOperationDO get(int id) {
        MenuByOperationDOKey menuByOperationDOKey=new MenuByOperationDOKey();
        menuByOperationDOKey.setMenubyoperationId(id);
        return iMenuByOperationDao.get(menuByOperationDOKey);
    }

    @Override
    public List<MenuByOperationDO> find(MenuByOperationDO entity) {
        return iMenuByOperationDao.find(entity);
    }

    @Override
    public int insert(MenuByOperationDO entity) {
        return iMenuByOperationDao.insert(entity);
    }

    @Override
    public int update(MenuByOperationDO entity) {
        return iMenuByOperationDao.update(entity);
    }

    @Override
    public int delete(int id) {
        MenuByOperationDOKey menuByOperationDOKey=new MenuByOperationDOKey();
        menuByOperationDOKey.setMenubyoperationId(id);
        return iMenuByOperationDao.delete(menuByOperationDOKey);
    }
}

/*
 * @ClassName IUserDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.sachzhong.entity.UserDO;
import com.cmpay.sachzhong.entity.UserDOExample;
import com.cmpay.sachzhong.entity.UserDOKey;
import java.util.List;

import com.cmpay.sachzhong.utils.SqlValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IUserDao extends BaseDao<UserDO, UserDOKey> {
    /**
     * @Title countByExample
     * @param example
     * @return 
     */
    int countByExample(UserDOExample example);

    /**
     * @Title deleteByExample
     * @param example
     * @return 
     */
    int deleteByExample(UserDOExample example);

    /**
     * @Title selectByExample
     * @param example
     * @return 
     */
    List<UserDO> selectByExample(UserDOExample example);

    /**
     * @Title updateByExampleSelective
     * @param record
     * @param example
     * @return 
     */
    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOExample example);

    /**
     * @Title updateByExample
     * @param record
     * @param example
     * @return 
     */
    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOExample example);

    UserDO  getById(int id);

    List<UserDO> selectByBetween(SqlValue mysql);

    List<UserDO> selectUserLikeName(SqlValue mysql);

    List<UserDO> selectUserPage(SqlValue mysql);

    int selectUserCount(SqlValue mysql);

    int deleteUser(SqlValue mysql);

    int updateUserMoney(SqlValue mysql);

    //模糊查询用户
    List<UserDO> selectLike(SqlValue mysql);



}
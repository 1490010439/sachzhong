package com.cmpay.sachzhong.bo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : Noone
 */
@Data
public class UserInfoBO {
    /**
     * userNo
     */
    private Long userNo;
    /**
     * username 用户名
     */
    private String username;
    /**
     * password 密码
     */
    private String password;
    /**
     * salt 盐
     */
    private String salt;
    /**
     * email 邮箱
     */
    private String email;
    /**
     * mobile 手机号
     */
    private String mobile;
    /**
     * merchantId 商户编号
     */
    private String merchantId;
    /**
     * status 状态  0：禁用   1：正常
     */
    private Byte status;
    /**
     * createUserId 创建者ID
     */
    private Long createUserId;
    /**
     * createTime 创建时间
     */
    private LocalDateTime createTime;

}

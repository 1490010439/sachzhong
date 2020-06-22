package com.cmpay.sachzhong;

/**
 * @classname UserInfoBO
 * @author SachZhong 钟盛勤
 * @date 2020/6/22 16:13
 */
public class UserInfoBO  {

    private String userId;
    private String loginName;
    private String mblNo;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }
}

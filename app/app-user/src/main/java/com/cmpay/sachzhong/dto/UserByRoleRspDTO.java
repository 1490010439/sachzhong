/*
 * @ClassName UserByRoleDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.dto;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class UserByRoleRspDTO extends BaseDO {
    /**
     * @Fields userbyroleId 用户角色关联表ID
     */
    private Integer userbyroleId;
    /**
     * @Fields userbyroleUserid 用户ID
     */
    private Integer userbyroleUserid;
    /**
     * @Fields userbyroleRoleid 角色ID
     */
    private Integer userbyroleRoleid;
    /**
     * @Fields userbyroleBack 备注
     */
    private String userbyroleBack;
    /**
     * @Fields userbyroleOpuserid 操作用户id
     */
    private Integer userbyroleOpuserid;
    /**
     * @Fields userbyroleDeletetype 该表是否被删除   true false
     */
    private String userbyroleDeletetype;
    /**
     * @Fields userbyroleFoundtime 该表的创建时间
     */
    private LocalDateTime userbyroleFoundtime;
    /**
     * @Fields userbyroleUpdatetime 该表被修改的时间
     */
    private LocalDateTime userbyroleUpdatetime;

    public Integer getUserbyroleId() {
        return userbyroleId;
    }

    public void setUserbyroleId(Integer userbyroleId) {
        this.userbyroleId = userbyroleId;
    }

    public Integer getUserbyroleUserid() {
        return userbyroleUserid;
    }

    public void setUserbyroleUserid(Integer userbyroleUserid) {
        this.userbyroleUserid = userbyroleUserid;
    }

    public Integer getUserbyroleRoleid() {
        return userbyroleRoleid;
    }

    public void setUserbyroleRoleid(Integer userbyroleRoleid) {
        this.userbyroleRoleid = userbyroleRoleid;
    }

    public String getUserbyroleBack() {
        return userbyroleBack;
    }

    public void setUserbyroleBack(String userbyroleBack) {
        this.userbyroleBack = userbyroleBack;
    }

    public Integer getUserbyroleOpuserid() {
        return userbyroleOpuserid;
    }

    public void setUserbyroleOpuserid(Integer userbyroleOpuserid) {
        this.userbyroleOpuserid = userbyroleOpuserid;
    }

    public String getUserbyroleDeletetype() {
        return userbyroleDeletetype;
    }

    public void setUserbyroleDeletetype(String userbyroleDeletetype) {
        this.userbyroleDeletetype = userbyroleDeletetype;
    }

    public LocalDateTime getUserbyroleFoundtime() {
        return userbyroleFoundtime;
    }

    public void setUserbyroleFoundtime(LocalDateTime userbyroleFoundtime) {
        this.userbyroleFoundtime = userbyroleFoundtime;
    }

    public LocalDateTime getUserbyroleUpdatetime() {
        return userbyroleUpdatetime;
    }

    public void setUserbyroleUpdatetime(LocalDateTime userbyroleUpdatetime) {
        this.userbyroleUpdatetime = userbyroleUpdatetime;
    }
}
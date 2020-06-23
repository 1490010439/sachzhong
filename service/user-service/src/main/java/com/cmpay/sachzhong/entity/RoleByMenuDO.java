/*
 * @ClassName RoleByMenuDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.entity;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class RoleByMenuDO extends BaseDO {
    /**
     * @Fields rolebymenuId 角色菜单关联表ID
     */
    private Integer rolebymenuId;
    /**
     * @Fields rolebymenuRoleid 角色ID
     */
    private Integer rolebymenuRoleid;
    /**
     * @Fields rolebymenuMenuid 菜单ID
     */
    private Integer rolebymenuMenuid;
    /**
     * @Fields rolebymenuBack 备注
     */
    private String rolebymenuBack;
    /**
     * @Fields rolebymenuOpuserid 操作用户id
     */
    private Integer rolebymenuOpuserid;
    /**
     * @Fields rolebymenuDeletetype 该表是否被删除   true false
     */
    private String rolebymenuDeletetype;
    /**
     * @Fields rolebymenuFoundtime 该表的创建时间
     */
    private LocalDateTime rolebymenuFoundtime;
    /**
     * @Fields rolebymenuUpdatetime 该表被修改的时间
     */
    private LocalDateTime rolebymenuUpdatetime;

    public Integer getRolebymenuId() {
        return rolebymenuId;
    }

    public void setRolebymenuId(Integer rolebymenuId) {
        this.rolebymenuId = rolebymenuId;
    }

    public Integer getRolebymenuRoleid() {
        return rolebymenuRoleid;
    }

    public void setRolebymenuRoleid(Integer rolebymenuRoleid) {
        this.rolebymenuRoleid = rolebymenuRoleid;
    }

    public Integer getRolebymenuMenuid() {
        return rolebymenuMenuid;
    }

    public void setRolebymenuMenuid(Integer rolebymenuMenuid) {
        this.rolebymenuMenuid = rolebymenuMenuid;
    }

    public String getRolebymenuBack() {
        return rolebymenuBack;
    }

    public void setRolebymenuBack(String rolebymenuBack) {
        this.rolebymenuBack = rolebymenuBack;
    }

    public Integer getRolebymenuOpuserid() {
        return rolebymenuOpuserid;
    }

    public void setRolebymenuOpuserid(Integer rolebymenuOpuserid) {
        this.rolebymenuOpuserid = rolebymenuOpuserid;
    }

    public String getRolebymenuDeletetype() {
        return rolebymenuDeletetype;
    }

    public void setRolebymenuDeletetype(String rolebymenuDeletetype) {
        this.rolebymenuDeletetype = rolebymenuDeletetype;
    }

    public LocalDateTime getRolebymenuFoundtime() {
        return rolebymenuFoundtime;
    }

    public void setRolebymenuFoundtime(LocalDateTime rolebymenuFoundtime) {
        this.rolebymenuFoundtime = rolebymenuFoundtime;
    }

    public LocalDateTime getRolebymenuUpdatetime() {
        return rolebymenuUpdatetime;
    }

    public void setRolebymenuUpdatetime(LocalDateTime rolebymenuUpdatetime) {
        this.rolebymenuUpdatetime = rolebymenuUpdatetime;
    }
}
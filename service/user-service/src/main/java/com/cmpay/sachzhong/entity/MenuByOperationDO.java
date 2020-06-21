/*
 * @ClassName MenuByOperationDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 19:33:01
 */
package com.cmpay.sachzhong.entity;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class MenuByOperationDO extends BaseDO {
    /**
     * @Fields menubyoperationId 菜单操作关联表ID
     */
    private Integer menubyoperationId;
    /**
     * @Fields menubyoperationOperationid 操作ID
     */
    private Integer menubyoperationOperationid;
    /**
     * @Fields menubyoperationMenuid 菜单ID
     */
    private Integer menubyoperationMenuid;
    /**
     * @Fields menubyoperationBack 备注
     */
    private String menubyoperationBack;
    /**
     * @Fields menubyoperationOpuserid 操作用户id
     */
    private Integer menubyoperationOpuserid;
    /**
     * @Fields menubyoperationDeletetype 该表是否被删除   true false
     */
    private String menubyoperationDeletetype;
    /**
     * @Fields menubyoperationFoundtime 该表的创建时间
     */
    private LocalDateTime menubyoperationFoundtime;
    /**
     * @Fields menubyoperationUpdatetime 该表被修改的时间
     */
    private LocalDateTime menubyoperationUpdatetime;

    public Integer getMenubyoperationId() {
        return menubyoperationId;
    }

    public void setMenubyoperationId(Integer menubyoperationId) {
        this.menubyoperationId = menubyoperationId;
    }

    public Integer getMenubyoperationOperationid() {
        return menubyoperationOperationid;
    }

    public void setMenubyoperationOperationid(Integer menubyoperationOperationid) {
        this.menubyoperationOperationid = menubyoperationOperationid;
    }

    public Integer getMenubyoperationMenuid() {
        return menubyoperationMenuid;
    }

    public void setMenubyoperationMenuid(Integer menubyoperationMenuid) {
        this.menubyoperationMenuid = menubyoperationMenuid;
    }

    public String getMenubyoperationBack() {
        return menubyoperationBack;
    }

    public void setMenubyoperationBack(String menubyoperationBack) {
        this.menubyoperationBack = menubyoperationBack;
    }

    public Integer getMenubyoperationOpuserid() {
        return menubyoperationOpuserid;
    }

    public void setMenubyoperationOpuserid(Integer menubyoperationOpuserid) {
        this.menubyoperationOpuserid = menubyoperationOpuserid;
    }

    public String getMenubyoperationDeletetype() {
        return menubyoperationDeletetype;
    }

    public void setMenubyoperationDeletetype(String menubyoperationDeletetype) {
        this.menubyoperationDeletetype = menubyoperationDeletetype;
    }

    public LocalDateTime getMenubyoperationFoundtime() {
        return menubyoperationFoundtime;
    }

    public void setMenubyoperationFoundtime(LocalDateTime menubyoperationFoundtime) {
        this.menubyoperationFoundtime = menubyoperationFoundtime;
    }

    public LocalDateTime getMenubyoperationUpdatetime() {
        return menubyoperationUpdatetime;
    }

    public void setMenubyoperationUpdatetime(LocalDateTime menubyoperationUpdatetime) {
        this.menubyoperationUpdatetime = menubyoperationUpdatetime;
    }
}
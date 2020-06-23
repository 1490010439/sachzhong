/*
 * @ClassName MenuDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.entity;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class MenuDO extends BaseDO {
    /**
     * @Fields menuId 菜单ID
     */
    private Integer menuId;
    /**
     * @Fields menuGrade 菜单等级 1最高 数越大等级越低
     */
    private Integer menuGrade;
    /**
     * @Fields menuName 菜单名称
     */
    private String menuName;
    /**
     * @Fields menuType 菜单类型
     */
    private String menuType;
    /**
     * @Fields menuNumber 菜单编号
     */
    private String menuNumber;
    /**
     * @Fields menuInfo 菜单信息
     */
    private String menuInfo;
    /**
     * @Fields menuOpuserid 操作用户id
     */
    private Integer menuOpuserid;
    /**
     * @Fields menuDeletetype 该表是否被删除   true false
     */
    private String menuDeletetype;
    /**
     * @Fields menuFoundtime 该表的创建时间
     */
    private LocalDateTime menuFoundtime;
    /**
     * @Fields menuUpdatetime 该表被修改的时间
     */
    private LocalDateTime menuUpdatetime;
    /**
     * @Fields menuBack 备注
     */
    private String menuBack;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuGrade() {
        return menuGrade;
    }

    public void setMenuGrade(Integer menuGrade) {
        this.menuGrade = menuGrade;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuNumber() {
        return menuNumber;
    }

    public void setMenuNumber(String menuNumber) {
        this.menuNumber = menuNumber;
    }

    public String getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(String menuInfo) {
        this.menuInfo = menuInfo;
    }

    public Integer getMenuOpuserid() {
        return menuOpuserid;
    }

    public void setMenuOpuserid(Integer menuOpuserid) {
        this.menuOpuserid = menuOpuserid;
    }

    public String getMenuDeletetype() {
        return menuDeletetype;
    }

    public void setMenuDeletetype(String menuDeletetype) {
        this.menuDeletetype = menuDeletetype;
    }

    public LocalDateTime getMenuFoundtime() {
        return menuFoundtime;
    }

    public void setMenuFoundtime(LocalDateTime menuFoundtime) {
        this.menuFoundtime = menuFoundtime;
    }

    public LocalDateTime getMenuUpdatetime() {
        return menuUpdatetime;
    }

    public void setMenuUpdatetime(LocalDateTime menuUpdatetime) {
        this.menuUpdatetime = menuUpdatetime;
    }

    public String getMenuBack() {
        return menuBack;
    }

    public void setMenuBack(String menuBack) {
        this.menuBack = menuBack;
    }
}
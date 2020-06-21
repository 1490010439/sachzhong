/*
 * @ClassName OperationDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-21 16:13:46
 */
package com.cmpay.sachzhong.entity;

import com.cmpay.lemon.framework.annotation.DataObject;
import com.cmpay.sachzhong.dao.BaseDO;

import java.time.LocalDateTime;

@DataObject
public class OperationDO extends BaseDO {
    /**
     * @Fields operationId 操作菜单id
     */
    private Integer operationId;
    /**
     * @Fields operationName 操作名
     */
    private String operationName;
    /**
     * @Fields operationGrade 操作等级 1最高 数越大等级越低
     */
    private Integer operationGrade;
    /**
     * @Fields operationNumber 操作编号
     */
    private String operationNumber;
    /**
     * @Fields operationType 操作类型
     */
    private String operationType;
    /**
     * @Fields operationInfo 操作信息
     */
    private String operationInfo;
    /**
     * @Fields operationOpuserid 操作用户id
     */
    private Integer operationOpuserid;
    /**
     * @Fields operationDeletetype 该表是否被删除   true false
     */
    private String operationDeletetype;
    /**
     * @Fields operationFoundtime 该表的创建时间
     */
    private LocalDateTime operationFoundtime;
    /**
     * @Fields operationUpdatetime 该表被修改的时间
     */
    private LocalDateTime operationUpdatetime;
    /**
     * @Fields operationBack 备注
     */
    private String operationBack;

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getOperationGrade() {
        return operationGrade;
    }

    public void setOperationGrade(Integer operationGrade) {
        this.operationGrade = operationGrade;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationInfo() {
        return operationInfo;
    }

    public void setOperationInfo(String operationInfo) {
        this.operationInfo = operationInfo;
    }

    public Integer getOperationOpuserid() {
        return operationOpuserid;
    }

    public void setOperationOpuserid(Integer operationOpuserid) {
        this.operationOpuserid = operationOpuserid;
    }

    public String getOperationDeletetype() {
        return operationDeletetype;
    }

    public void setOperationDeletetype(String operationDeletetype) {
        this.operationDeletetype = operationDeletetype;
    }

    public LocalDateTime getOperationFoundtime() {
        return operationFoundtime;
    }

    public void setOperationFoundtime(LocalDateTime operationFoundtime) {
        this.operationFoundtime = operationFoundtime;
    }

    public LocalDateTime getOperationUpdatetime() {
        return operationUpdatetime;
    }

    public void setOperationUpdatetime(LocalDateTime operationUpdatetime) {
        this.operationUpdatetime = operationUpdatetime;
    }

    public String getOperationBack() {
        return operationBack;
    }

    public void setOperationBack(String operationBack) {
        this.operationBack = operationBack;
    }
}
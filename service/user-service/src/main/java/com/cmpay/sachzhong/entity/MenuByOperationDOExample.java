/*
 * @ClassName MenuByOperationDOExample
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MenuByOperationDOExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    /**
     * @Title MenuByOperationDOExample
     * @return 
     */
    public MenuByOperationDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @Title setOrderByClause
     * @param orderByClause
     * @return 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @Title getOrderByClause
     * @return 
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @Title setDistinct
     * @param distinct
     * @return 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @Title isDistinct
     * @return 
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @Title getOredCriteria
     * @return 
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @Title or
     * @param criteria
     * @return 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @Title or
     * @return 
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @Title createCriteria
     * @return 
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @Title createCriteriaInternal
     * @return 
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @Title clear
     * @return 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @Description 
     * @version 1.0
     * @Date 2020-06-23 10:01:22
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMenubyoperationIdIsNull() {
            addCriterion("menubyoperation_id is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdIsNotNull() {
            addCriterion("menubyoperation_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdEqualTo(Integer value) {
            addCriterion("menubyoperation_id =", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdNotEqualTo(Integer value) {
            addCriterion("menubyoperation_id <>", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdGreaterThan(Integer value) {
            addCriterion("menubyoperation_id >", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_id >=", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdLessThan(Integer value) {
            addCriterion("menubyoperation_id <", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdLessThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_id <=", value, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdIn(List<Integer> values) {
            addCriterion("menubyoperation_id in", values, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdNotIn(List<Integer> values) {
            addCriterion("menubyoperation_id not in", values, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_id between", value1, value2, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_id not between", value1, value2, "menubyoperationId");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidIsNull() {
            addCriterion("menubyoperation_operationid is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidIsNotNull() {
            addCriterion("menubyoperation_operationid is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidEqualTo(Integer value) {
            addCriterion("menubyoperation_operationid =", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidNotEqualTo(Integer value) {
            addCriterion("menubyoperation_operationid <>", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidGreaterThan(Integer value) {
            addCriterion("menubyoperation_operationid >", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_operationid >=", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidLessThan(Integer value) {
            addCriterion("menubyoperation_operationid <", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidLessThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_operationid <=", value, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidIn(List<Integer> values) {
            addCriterion("menubyoperation_operationid in", values, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidNotIn(List<Integer> values) {
            addCriterion("menubyoperation_operationid not in", values, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_operationid between", value1, value2, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOperationidNotBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_operationid not between", value1, value2, "menubyoperationOperationid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidIsNull() {
            addCriterion("menubyoperation_menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidIsNotNull() {
            addCriterion("menubyoperation_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidEqualTo(Integer value) {
            addCriterion("menubyoperation_menuid =", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidNotEqualTo(Integer value) {
            addCriterion("menubyoperation_menuid <>", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidGreaterThan(Integer value) {
            addCriterion("menubyoperation_menuid >", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_menuid >=", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidLessThan(Integer value) {
            addCriterion("menubyoperation_menuid <", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_menuid <=", value, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidIn(List<Integer> values) {
            addCriterion("menubyoperation_menuid in", values, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidNotIn(List<Integer> values) {
            addCriterion("menubyoperation_menuid not in", values, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_menuid between", value1, value2, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_menuid not between", value1, value2, "menubyoperationMenuid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackIsNull() {
            addCriterion("menubyoperation_back is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackIsNotNull() {
            addCriterion("menubyoperation_back is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackEqualTo(String value) {
            addCriterion("menubyoperation_back =", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackNotEqualTo(String value) {
            addCriterion("menubyoperation_back <>", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackGreaterThan(String value) {
            addCriterion("menubyoperation_back >", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackGreaterThanOrEqualTo(String value) {
            addCriterion("menubyoperation_back >=", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackLessThan(String value) {
            addCriterion("menubyoperation_back <", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackLessThanOrEqualTo(String value) {
            addCriterion("menubyoperation_back <=", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackLike(String value) {
            addCriterion("menubyoperation_back like", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackNotLike(String value) {
            addCriterion("menubyoperation_back not like", value, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackIn(List<String> values) {
            addCriterion("menubyoperation_back in", values, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackNotIn(List<String> values) {
            addCriterion("menubyoperation_back not in", values, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackBetween(String value1, String value2) {
            addCriterion("menubyoperation_back between", value1, value2, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationBackNotBetween(String value1, String value2) {
            addCriterion("menubyoperation_back not between", value1, value2, "menubyoperationBack");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridIsNull() {
            addCriterion("menubyoperation_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridIsNotNull() {
            addCriterion("menubyoperation_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridEqualTo(Integer value) {
            addCriterion("menubyoperation_opuserid =", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridNotEqualTo(Integer value) {
            addCriterion("menubyoperation_opuserid <>", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridGreaterThan(Integer value) {
            addCriterion("menubyoperation_opuserid >", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_opuserid >=", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridLessThan(Integer value) {
            addCriterion("menubyoperation_opuserid <", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("menubyoperation_opuserid <=", value, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridIn(List<Integer> values) {
            addCriterion("menubyoperation_opuserid in", values, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridNotIn(List<Integer> values) {
            addCriterion("menubyoperation_opuserid not in", values, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_opuserid between", value1, value2, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("menubyoperation_opuserid not between", value1, value2, "menubyoperationOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeIsNull() {
            addCriterion("menubyoperation_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeIsNotNull() {
            addCriterion("menubyoperation_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeEqualTo(String value) {
            addCriterion("menubyoperation_deletetype =", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeNotEqualTo(String value) {
            addCriterion("menubyoperation_deletetype <>", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeGreaterThan(String value) {
            addCriterion("menubyoperation_deletetype >", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("menubyoperation_deletetype >=", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeLessThan(String value) {
            addCriterion("menubyoperation_deletetype <", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("menubyoperation_deletetype <=", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeLike(String value) {
            addCriterion("menubyoperation_deletetype like", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeNotLike(String value) {
            addCriterion("menubyoperation_deletetype not like", value, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeIn(List<String> values) {
            addCriterion("menubyoperation_deletetype in", values, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeNotIn(List<String> values) {
            addCriterion("menubyoperation_deletetype not in", values, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeBetween(String value1, String value2) {
            addCriterion("menubyoperation_deletetype between", value1, value2, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationDeletetypeNotBetween(String value1, String value2) {
            addCriterion("menubyoperation_deletetype not between", value1, value2, "menubyoperationDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeIsNull() {
            addCriterion("menubyoperation_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeIsNotNull() {
            addCriterion("menubyoperation_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime =", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeNotEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime <>", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeGreaterThan(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime >", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime >=", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeLessThan(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime <", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_foundtime <=", value, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeIn(List<LocalDateTime> values) {
            addCriterion("menubyoperation_foundtime in", values, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeNotIn(List<LocalDateTime> values) {
            addCriterion("menubyoperation_foundtime not in", values, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menubyoperation_foundtime between", value1, value2, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationFoundtimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menubyoperation_foundtime not between", value1, value2, "menubyoperationFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeIsNull() {
            addCriterion("menubyoperation_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeIsNotNull() {
            addCriterion("menubyoperation_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime =", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime <>", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeGreaterThan(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime >", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime >=", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeLessThan(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime <", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("menubyoperation_updatetime <=", value, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeIn(List<LocalDateTime> values) {
            addCriterion("menubyoperation_updatetime in", values, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("menubyoperation_updatetime not in", values, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menubyoperation_updatetime between", value1, value2, "menubyoperationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenubyoperationUpdatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menubyoperation_updatetime not between", value1, value2, "menubyoperationUpdatetime");
            return (Criteria) this;
        }
    }

    /**
     * @Description 
     * @version 1.0
     * @Date 2020-06-23 10:01:22
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @Description 
     * @version 1.0
     * @Date 2020-06-23 10:01:22
     */
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
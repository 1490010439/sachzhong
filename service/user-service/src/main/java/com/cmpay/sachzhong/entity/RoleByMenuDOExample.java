package com.cmpay.sachzhong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleByMenuDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleByMenuDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRolebymenuIdIsNull() {
            addCriterion("rolebymenu_id is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdIsNotNull() {
            addCriterion("rolebymenu_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdEqualTo(Integer value) {
            addCriterion("rolebymenu_id =", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdNotEqualTo(Integer value) {
            addCriterion("rolebymenu_id <>", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdGreaterThan(Integer value) {
            addCriterion("rolebymenu_id >", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_id >=", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdLessThan(Integer value) {
            addCriterion("rolebymenu_id <", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_id <=", value, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdIn(List<Integer> values) {
            addCriterion("rolebymenu_id in", values, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdNotIn(List<Integer> values) {
            addCriterion("rolebymenu_id not in", values, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_id between", value1, value2, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_id not between", value1, value2, "rolebymenuId");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidIsNull() {
            addCriterion("rolebymenu_roleid is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidIsNotNull() {
            addCriterion("rolebymenu_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidEqualTo(Integer value) {
            addCriterion("rolebymenu_roleid =", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidNotEqualTo(Integer value) {
            addCriterion("rolebymenu_roleid <>", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidGreaterThan(Integer value) {
            addCriterion("rolebymenu_roleid >", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_roleid >=", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidLessThan(Integer value) {
            addCriterion("rolebymenu_roleid <", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_roleid <=", value, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidIn(List<Integer> values) {
            addCriterion("rolebymenu_roleid in", values, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidNotIn(List<Integer> values) {
            addCriterion("rolebymenu_roleid not in", values, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_roleid between", value1, value2, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_roleid not between", value1, value2, "rolebymenuRoleid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidIsNull() {
            addCriterion("rolebymenu_menuid is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidIsNotNull() {
            addCriterion("rolebymenu_menuid is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidEqualTo(Integer value) {
            addCriterion("rolebymenu_menuid =", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidNotEqualTo(Integer value) {
            addCriterion("rolebymenu_menuid <>", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidGreaterThan(Integer value) {
            addCriterion("rolebymenu_menuid >", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_menuid >=", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidLessThan(Integer value) {
            addCriterion("rolebymenu_menuid <", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_menuid <=", value, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidIn(List<Integer> values) {
            addCriterion("rolebymenu_menuid in", values, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidNotIn(List<Integer> values) {
            addCriterion("rolebymenu_menuid not in", values, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_menuid between", value1, value2, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_menuid not between", value1, value2, "rolebymenuMenuid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackIsNull() {
            addCriterion("rolebymenu_back is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackIsNotNull() {
            addCriterion("rolebymenu_back is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackEqualTo(String value) {
            addCriterion("rolebymenu_back =", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackNotEqualTo(String value) {
            addCriterion("rolebymenu_back <>", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackGreaterThan(String value) {
            addCriterion("rolebymenu_back >", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackGreaterThanOrEqualTo(String value) {
            addCriterion("rolebymenu_back >=", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackLessThan(String value) {
            addCriterion("rolebymenu_back <", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackLessThanOrEqualTo(String value) {
            addCriterion("rolebymenu_back <=", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackLike(String value) {
            addCriterion("rolebymenu_back like", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackNotLike(String value) {
            addCriterion("rolebymenu_back not like", value, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackIn(List<String> values) {
            addCriterion("rolebymenu_back in", values, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackNotIn(List<String> values) {
            addCriterion("rolebymenu_back not in", values, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackBetween(String value1, String value2) {
            addCriterion("rolebymenu_back between", value1, value2, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuBackNotBetween(String value1, String value2) {
            addCriterion("rolebymenu_back not between", value1, value2, "rolebymenuBack");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridIsNull() {
            addCriterion("rolebymenu_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridIsNotNull() {
            addCriterion("rolebymenu_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridEqualTo(Integer value) {
            addCriterion("rolebymenu_opuserid =", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridNotEqualTo(Integer value) {
            addCriterion("rolebymenu_opuserid <>", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridGreaterThan(Integer value) {
            addCriterion("rolebymenu_opuserid >", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_opuserid >=", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridLessThan(Integer value) {
            addCriterion("rolebymenu_opuserid <", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("rolebymenu_opuserid <=", value, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridIn(List<Integer> values) {
            addCriterion("rolebymenu_opuserid in", values, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridNotIn(List<Integer> values) {
            addCriterion("rolebymenu_opuserid not in", values, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_opuserid between", value1, value2, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("rolebymenu_opuserid not between", value1, value2, "rolebymenuOpuserid");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeIsNull() {
            addCriterion("rolebymenu_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeIsNotNull() {
            addCriterion("rolebymenu_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeEqualTo(String value) {
            addCriterion("rolebymenu_deletetype =", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeNotEqualTo(String value) {
            addCriterion("rolebymenu_deletetype <>", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeGreaterThan(String value) {
            addCriterion("rolebymenu_deletetype >", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("rolebymenu_deletetype >=", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeLessThan(String value) {
            addCriterion("rolebymenu_deletetype <", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("rolebymenu_deletetype <=", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeLike(String value) {
            addCriterion("rolebymenu_deletetype like", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeNotLike(String value) {
            addCriterion("rolebymenu_deletetype not like", value, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeIn(List<String> values) {
            addCriterion("rolebymenu_deletetype in", values, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeNotIn(List<String> values) {
            addCriterion("rolebymenu_deletetype not in", values, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeBetween(String value1, String value2) {
            addCriterion("rolebymenu_deletetype between", value1, value2, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuDeletetypeNotBetween(String value1, String value2) {
            addCriterion("rolebymenu_deletetype not between", value1, value2, "rolebymenuDeletetype");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeIsNull() {
            addCriterion("rolebymenu_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeIsNotNull() {
            addCriterion("rolebymenu_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeEqualTo(Date value) {
            addCriterion("rolebymenu_foundtime =", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeNotEqualTo(Date value) {
            addCriterion("rolebymenu_foundtime <>", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeGreaterThan(Date value) {
            addCriterion("rolebymenu_foundtime >", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rolebymenu_foundtime >=", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeLessThan(Date value) {
            addCriterion("rolebymenu_foundtime <", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeLessThanOrEqualTo(Date value) {
            addCriterion("rolebymenu_foundtime <=", value, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeIn(List<Date> values) {
            addCriterion("rolebymenu_foundtime in", values, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeNotIn(List<Date> values) {
            addCriterion("rolebymenu_foundtime not in", values, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeBetween(Date value1, Date value2) {
            addCriterion("rolebymenu_foundtime between", value1, value2, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuFoundtimeNotBetween(Date value1, Date value2) {
            addCriterion("rolebymenu_foundtime not between", value1, value2, "rolebymenuFoundtime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeIsNull() {
            addCriterion("rolebymenu_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeIsNotNull() {
            addCriterion("rolebymenu_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeEqualTo(Date value) {
            addCriterion("rolebymenu_updatetime =", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeNotEqualTo(Date value) {
            addCriterion("rolebymenu_updatetime <>", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeGreaterThan(Date value) {
            addCriterion("rolebymenu_updatetime >", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rolebymenu_updatetime >=", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeLessThan(Date value) {
            addCriterion("rolebymenu_updatetime <", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("rolebymenu_updatetime <=", value, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeIn(List<Date> values) {
            addCriterion("rolebymenu_updatetime in", values, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeNotIn(List<Date> values) {
            addCriterion("rolebymenu_updatetime not in", values, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("rolebymenu_updatetime between", value1, value2, "rolebymenuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRolebymenuUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("rolebymenu_updatetime not between", value1, value2, "rolebymenuUpdatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
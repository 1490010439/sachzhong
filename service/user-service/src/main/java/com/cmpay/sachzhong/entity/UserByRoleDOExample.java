package com.cmpay.sachzhong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserByRoleDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserByRoleDOExample() {
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

        public Criteria andUserbyroleIdIsNull() {
            addCriterion("userbyrole_id is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdIsNotNull() {
            addCriterion("userbyrole_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdEqualTo(Integer value) {
            addCriterion("userbyrole_id =", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdNotEqualTo(Integer value) {
            addCriterion("userbyrole_id <>", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdGreaterThan(Integer value) {
            addCriterion("userbyrole_id >", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_id >=", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdLessThan(Integer value) {
            addCriterion("userbyrole_id <", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdLessThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_id <=", value, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdIn(List<Integer> values) {
            addCriterion("userbyrole_id in", values, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdNotIn(List<Integer> values) {
            addCriterion("userbyrole_id not in", values, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_id between", value1, value2, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_id not between", value1, value2, "userbyroleId");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridIsNull() {
            addCriterion("userbyrole_userid is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridIsNotNull() {
            addCriterion("userbyrole_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridEqualTo(Integer value) {
            addCriterion("userbyrole_userid =", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridNotEqualTo(Integer value) {
            addCriterion("userbyrole_userid <>", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridGreaterThan(Integer value) {
            addCriterion("userbyrole_userid >", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_userid >=", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridLessThan(Integer value) {
            addCriterion("userbyrole_userid <", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_userid <=", value, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridIn(List<Integer> values) {
            addCriterion("userbyrole_userid in", values, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridNotIn(List<Integer> values) {
            addCriterion("userbyrole_userid not in", values, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_userid between", value1, value2, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_userid not between", value1, value2, "userbyroleUserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidIsNull() {
            addCriterion("userbyrole_roleid is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidIsNotNull() {
            addCriterion("userbyrole_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidEqualTo(Integer value) {
            addCriterion("userbyrole_roleid =", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidNotEqualTo(Integer value) {
            addCriterion("userbyrole_roleid <>", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidGreaterThan(Integer value) {
            addCriterion("userbyrole_roleid >", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_roleid >=", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidLessThan(Integer value) {
            addCriterion("userbyrole_roleid <", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_roleid <=", value, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidIn(List<Integer> values) {
            addCriterion("userbyrole_roleid in", values, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidNotIn(List<Integer> values) {
            addCriterion("userbyrole_roleid not in", values, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_roleid between", value1, value2, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_roleid not between", value1, value2, "userbyroleRoleid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackIsNull() {
            addCriterion("userbyrole_back is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackIsNotNull() {
            addCriterion("userbyrole_back is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackEqualTo(String value) {
            addCriterion("userbyrole_back =", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackNotEqualTo(String value) {
            addCriterion("userbyrole_back <>", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackGreaterThan(String value) {
            addCriterion("userbyrole_back >", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackGreaterThanOrEqualTo(String value) {
            addCriterion("userbyrole_back >=", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackLessThan(String value) {
            addCriterion("userbyrole_back <", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackLessThanOrEqualTo(String value) {
            addCriterion("userbyrole_back <=", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackLike(String value) {
            addCriterion("userbyrole_back like", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackNotLike(String value) {
            addCriterion("userbyrole_back not like", value, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackIn(List<String> values) {
            addCriterion("userbyrole_back in", values, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackNotIn(List<String> values) {
            addCriterion("userbyrole_back not in", values, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackBetween(String value1, String value2) {
            addCriterion("userbyrole_back between", value1, value2, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleBackNotBetween(String value1, String value2) {
            addCriterion("userbyrole_back not between", value1, value2, "userbyroleBack");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridIsNull() {
            addCriterion("userbyrole_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridIsNotNull() {
            addCriterion("userbyrole_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridEqualTo(Integer value) {
            addCriterion("userbyrole_opuserid =", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridNotEqualTo(Integer value) {
            addCriterion("userbyrole_opuserid <>", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridGreaterThan(Integer value) {
            addCriterion("userbyrole_opuserid >", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_opuserid >=", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridLessThan(Integer value) {
            addCriterion("userbyrole_opuserid <", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("userbyrole_opuserid <=", value, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridIn(List<Integer> values) {
            addCriterion("userbyrole_opuserid in", values, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridNotIn(List<Integer> values) {
            addCriterion("userbyrole_opuserid not in", values, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_opuserid between", value1, value2, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userbyrole_opuserid not between", value1, value2, "userbyroleOpuserid");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeIsNull() {
            addCriterion("userbyrole_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeIsNotNull() {
            addCriterion("userbyrole_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeEqualTo(String value) {
            addCriterion("userbyrole_deletetype =", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeNotEqualTo(String value) {
            addCriterion("userbyrole_deletetype <>", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeGreaterThan(String value) {
            addCriterion("userbyrole_deletetype >", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("userbyrole_deletetype >=", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeLessThan(String value) {
            addCriterion("userbyrole_deletetype <", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("userbyrole_deletetype <=", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeLike(String value) {
            addCriterion("userbyrole_deletetype like", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeNotLike(String value) {
            addCriterion("userbyrole_deletetype not like", value, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeIn(List<String> values) {
            addCriterion("userbyrole_deletetype in", values, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeNotIn(List<String> values) {
            addCriterion("userbyrole_deletetype not in", values, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeBetween(String value1, String value2) {
            addCriterion("userbyrole_deletetype between", value1, value2, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleDeletetypeNotBetween(String value1, String value2) {
            addCriterion("userbyrole_deletetype not between", value1, value2, "userbyroleDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeIsNull() {
            addCriterion("userbyrole_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeIsNotNull() {
            addCriterion("userbyrole_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeEqualTo(Date value) {
            addCriterion("userbyrole_foundtime =", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeNotEqualTo(Date value) {
            addCriterion("userbyrole_foundtime <>", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeGreaterThan(Date value) {
            addCriterion("userbyrole_foundtime >", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userbyrole_foundtime >=", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeLessThan(Date value) {
            addCriterion("userbyrole_foundtime <", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeLessThanOrEqualTo(Date value) {
            addCriterion("userbyrole_foundtime <=", value, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeIn(List<Date> values) {
            addCriterion("userbyrole_foundtime in", values, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeNotIn(List<Date> values) {
            addCriterion("userbyrole_foundtime not in", values, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeBetween(Date value1, Date value2) {
            addCriterion("userbyrole_foundtime between", value1, value2, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleFoundtimeNotBetween(Date value1, Date value2) {
            addCriterion("userbyrole_foundtime not between", value1, value2, "userbyroleFoundtime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeIsNull() {
            addCriterion("userbyrole_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeIsNotNull() {
            addCriterion("userbyrole_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeEqualTo(Date value) {
            addCriterion("userbyrole_updatetime =", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeNotEqualTo(Date value) {
            addCriterion("userbyrole_updatetime <>", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeGreaterThan(Date value) {
            addCriterion("userbyrole_updatetime >", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("userbyrole_updatetime >=", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeLessThan(Date value) {
            addCriterion("userbyrole_updatetime <", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("userbyrole_updatetime <=", value, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeIn(List<Date> values) {
            addCriterion("userbyrole_updatetime in", values, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeNotIn(List<Date> values) {
            addCriterion("userbyrole_updatetime not in", values, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("userbyrole_updatetime between", value1, value2, "userbyroleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserbyroleUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("userbyrole_updatetime not between", value1, value2, "userbyroleUpdatetime");
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
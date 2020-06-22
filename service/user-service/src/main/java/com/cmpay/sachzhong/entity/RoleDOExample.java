package com.cmpay.sachzhong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleDOExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIsNull() {
            addCriterion("role_grade is null");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIsNotNull() {
            addCriterion("role_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRoleGradeEqualTo(Integer value) {
            addCriterion("role_grade =", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotEqualTo(Integer value) {
            addCriterion("role_grade <>", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeGreaterThan(Integer value) {
            addCriterion("role_grade >", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_grade >=", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeLessThan(Integer value) {
            addCriterion("role_grade <", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeLessThanOrEqualTo(Integer value) {
            addCriterion("role_grade <=", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIn(List<Integer> values) {
            addCriterion("role_grade in", values, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotIn(List<Integer> values) {
            addCriterion("role_grade not in", values, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeBetween(Integer value1, Integer value2) {
            addCriterion("role_grade between", value1, value2, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_grade not between", value1, value2, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIsNull() {
            addCriterion("role_number is null");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIsNotNull() {
            addCriterion("role_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNumberEqualTo(String value) {
            addCriterion("role_number =", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotEqualTo(String value) {
            addCriterion("role_number <>", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberGreaterThan(String value) {
            addCriterion("role_number >", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("role_number >=", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberLessThan(String value) {
            addCriterion("role_number <", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberLessThanOrEqualTo(String value) {
            addCriterion("role_number <=", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberLike(String value) {
            addCriterion("role_number like", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotLike(String value) {
            addCriterion("role_number not like", value, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberIn(List<String> values) {
            addCriterion("role_number in", values, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotIn(List<String> values) {
            addCriterion("role_number not in", values, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberBetween(String value1, String value2) {
            addCriterion("role_number between", value1, value2, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleNumberNotBetween(String value1, String value2) {
            addCriterion("role_number not between", value1, value2, "roleNumber");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("role_type like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("role_type not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleInfoIsNull() {
            addCriterion("role_info is null");
            return (Criteria) this;
        }

        public Criteria andRoleInfoIsNotNull() {
            addCriterion("role_info is not null");
            return (Criteria) this;
        }

        public Criteria andRoleInfoEqualTo(String value) {
            addCriterion("role_info =", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoNotEqualTo(String value) {
            addCriterion("role_info <>", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoGreaterThan(String value) {
            addCriterion("role_info >", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoGreaterThanOrEqualTo(String value) {
            addCriterion("role_info >=", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoLessThan(String value) {
            addCriterion("role_info <", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoLessThanOrEqualTo(String value) {
            addCriterion("role_info <=", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoLike(String value) {
            addCriterion("role_info like", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoNotLike(String value) {
            addCriterion("role_info not like", value, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoIn(List<String> values) {
            addCriterion("role_info in", values, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoNotIn(List<String> values) {
            addCriterion("role_info not in", values, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoBetween(String value1, String value2) {
            addCriterion("role_info between", value1, value2, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleInfoNotBetween(String value1, String value2) {
            addCriterion("role_info not between", value1, value2, "roleInfo");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridIsNull() {
            addCriterion("role_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridIsNotNull() {
            addCriterion("role_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridEqualTo(Integer value) {
            addCriterion("role_opuserid =", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridNotEqualTo(Integer value) {
            addCriterion("role_opuserid <>", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridGreaterThan(Integer value) {
            addCriterion("role_opuserid >", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_opuserid >=", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridLessThan(Integer value) {
            addCriterion("role_opuserid <", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("role_opuserid <=", value, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridIn(List<Integer> values) {
            addCriterion("role_opuserid in", values, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridNotIn(List<Integer> values) {
            addCriterion("role_opuserid not in", values, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("role_opuserid between", value1, value2, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("role_opuserid not between", value1, value2, "roleOpuserid");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeIsNull() {
            addCriterion("role_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeIsNotNull() {
            addCriterion("role_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeEqualTo(String value) {
            addCriterion("role_deletetype =", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeNotEqualTo(String value) {
            addCriterion("role_deletetype <>", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeGreaterThan(String value) {
            addCriterion("role_deletetype >", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("role_deletetype >=", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeLessThan(String value) {
            addCriterion("role_deletetype <", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("role_deletetype <=", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeLike(String value) {
            addCriterion("role_deletetype like", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeNotLike(String value) {
            addCriterion("role_deletetype not like", value, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeIn(List<String> values) {
            addCriterion("role_deletetype in", values, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeNotIn(List<String> values) {
            addCriterion("role_deletetype not in", values, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeBetween(String value1, String value2) {
            addCriterion("role_deletetype between", value1, value2, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleDeletetypeNotBetween(String value1, String value2) {
            addCriterion("role_deletetype not between", value1, value2, "roleDeletetype");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeIsNull() {
            addCriterion("role_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeIsNotNull() {
            addCriterion("role_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeEqualTo(Date value) {
            addCriterion("role_foundtime =", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeNotEqualTo(Date value) {
            addCriterion("role_foundtime <>", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeGreaterThan(Date value) {
            addCriterion("role_foundtime >", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_foundtime >=", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeLessThan(Date value) {
            addCriterion("role_foundtime <", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeLessThanOrEqualTo(Date value) {
            addCriterion("role_foundtime <=", value, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeIn(List<Date> values) {
            addCriterion("role_foundtime in", values, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeNotIn(List<Date> values) {
            addCriterion("role_foundtime not in", values, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeBetween(Date value1, Date value2) {
            addCriterion("role_foundtime between", value1, value2, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleFoundtimeNotBetween(Date value1, Date value2) {
            addCriterion("role_foundtime not between", value1, value2, "roleFoundtime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeIsNull() {
            addCriterion("role_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeIsNotNull() {
            addCriterion("role_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeEqualTo(Date value) {
            addCriterion("role_updatetime =", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeNotEqualTo(Date value) {
            addCriterion("role_updatetime <>", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeGreaterThan(Date value) {
            addCriterion("role_updatetime >", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("role_updatetime >=", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeLessThan(Date value) {
            addCriterion("role_updatetime <", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("role_updatetime <=", value, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeIn(List<Date> values) {
            addCriterion("role_updatetime in", values, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeNotIn(List<Date> values) {
            addCriterion("role_updatetime not in", values, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("role_updatetime between", value1, value2, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("role_updatetime not between", value1, value2, "roleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andRoleBackIsNull() {
            addCriterion("role_back is null");
            return (Criteria) this;
        }

        public Criteria andRoleBackIsNotNull() {
            addCriterion("role_back is not null");
            return (Criteria) this;
        }

        public Criteria andRoleBackEqualTo(String value) {
            addCriterion("role_back =", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackNotEqualTo(String value) {
            addCriterion("role_back <>", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackGreaterThan(String value) {
            addCriterion("role_back >", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackGreaterThanOrEqualTo(String value) {
            addCriterion("role_back >=", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackLessThan(String value) {
            addCriterion("role_back <", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackLessThanOrEqualTo(String value) {
            addCriterion("role_back <=", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackLike(String value) {
            addCriterion("role_back like", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackNotLike(String value) {
            addCriterion("role_back not like", value, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackIn(List<String> values) {
            addCriterion("role_back in", values, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackNotIn(List<String> values) {
            addCriterion("role_back not in", values, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackBetween(String value1, String value2) {
            addCriterion("role_back between", value1, value2, "roleBack");
            return (Criteria) this;
        }

        public Criteria andRoleBackNotBetween(String value1, String value2) {
            addCriterion("role_back not between", value1, value2, "roleBack");
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
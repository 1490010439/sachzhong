package com.cmpay.sachzhong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationDOExample() {
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

        public Criteria andOperationIdIsNull() {
            addCriterion("operation_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(Integer value) {
            addCriterion("operation_id =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(Integer value) {
            addCriterion("operation_id <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(Integer value) {
            addCriterion("operation_id >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_id >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(Integer value) {
            addCriterion("operation_id <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(Integer value) {
            addCriterion("operation_id <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<Integer> values) {
            addCriterion("operation_id in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<Integer> values) {
            addCriterion("operation_id not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(Integer value1, Integer value2) {
            addCriterion("operation_id between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_id not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("operation_name is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("operation_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("operation_name =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("operation_name <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("operation_name >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("operation_name >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("operation_name <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("operation_name <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("operation_name like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("operation_name not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("operation_name in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("operation_name not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("operation_name between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("operation_name not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIsNull() {
            addCriterion("operation_grade is null");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIsNotNull() {
            addCriterion("operation_grade is not null");
            return (Criteria) this;
        }

        public Criteria andOperationGradeEqualTo(Integer value) {
            addCriterion("operation_grade =", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotEqualTo(Integer value) {
            addCriterion("operation_grade <>", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeGreaterThan(Integer value) {
            addCriterion("operation_grade >", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_grade >=", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeLessThan(Integer value) {
            addCriterion("operation_grade <", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeLessThanOrEqualTo(Integer value) {
            addCriterion("operation_grade <=", value, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeIn(List<Integer> values) {
            addCriterion("operation_grade in", values, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotIn(List<Integer> values) {
            addCriterion("operation_grade not in", values, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeBetween(Integer value1, Integer value2) {
            addCriterion("operation_grade between", value1, value2, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_grade not between", value1, value2, "operationGrade");
            return (Criteria) this;
        }

        public Criteria andOperationNumberIsNull() {
            addCriterion("operation_number is null");
            return (Criteria) this;
        }

        public Criteria andOperationNumberIsNotNull() {
            addCriterion("operation_number is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNumberEqualTo(String value) {
            addCriterion("operation_number =", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberNotEqualTo(String value) {
            addCriterion("operation_number <>", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberGreaterThan(String value) {
            addCriterion("operation_number >", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberGreaterThanOrEqualTo(String value) {
            addCriterion("operation_number >=", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberLessThan(String value) {
            addCriterion("operation_number <", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberLessThanOrEqualTo(String value) {
            addCriterion("operation_number <=", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberLike(String value) {
            addCriterion("operation_number like", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberNotLike(String value) {
            addCriterion("operation_number not like", value, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberIn(List<String> values) {
            addCriterion("operation_number in", values, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberNotIn(List<String> values) {
            addCriterion("operation_number not in", values, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberBetween(String value1, String value2) {
            addCriterion("operation_number between", value1, value2, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationNumberNotBetween(String value1, String value2) {
            addCriterion("operation_number not between", value1, value2, "operationNumber");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("operation_type like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("operation_type not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationInfoIsNull() {
            addCriterion("operation_info is null");
            return (Criteria) this;
        }

        public Criteria andOperationInfoIsNotNull() {
            addCriterion("operation_info is not null");
            return (Criteria) this;
        }

        public Criteria andOperationInfoEqualTo(String value) {
            addCriterion("operation_info =", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoNotEqualTo(String value) {
            addCriterion("operation_info <>", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoGreaterThan(String value) {
            addCriterion("operation_info >", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoGreaterThanOrEqualTo(String value) {
            addCriterion("operation_info >=", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoLessThan(String value) {
            addCriterion("operation_info <", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoLessThanOrEqualTo(String value) {
            addCriterion("operation_info <=", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoLike(String value) {
            addCriterion("operation_info like", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoNotLike(String value) {
            addCriterion("operation_info not like", value, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoIn(List<String> values) {
            addCriterion("operation_info in", values, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoNotIn(List<String> values) {
            addCriterion("operation_info not in", values, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoBetween(String value1, String value2) {
            addCriterion("operation_info between", value1, value2, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationInfoNotBetween(String value1, String value2) {
            addCriterion("operation_info not between", value1, value2, "operationInfo");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridIsNull() {
            addCriterion("operation_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridIsNotNull() {
            addCriterion("operation_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridEqualTo(Integer value) {
            addCriterion("operation_opuserid =", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridNotEqualTo(Integer value) {
            addCriterion("operation_opuserid <>", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridGreaterThan(Integer value) {
            addCriterion("operation_opuserid >", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_opuserid >=", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridLessThan(Integer value) {
            addCriterion("operation_opuserid <", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("operation_opuserid <=", value, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridIn(List<Integer> values) {
            addCriterion("operation_opuserid in", values, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridNotIn(List<Integer> values) {
            addCriterion("operation_opuserid not in", values, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("operation_opuserid between", value1, value2, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_opuserid not between", value1, value2, "operationOpuserid");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeIsNull() {
            addCriterion("operation_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeIsNotNull() {
            addCriterion("operation_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeEqualTo(String value) {
            addCriterion("operation_deletetype =", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeNotEqualTo(String value) {
            addCriterion("operation_deletetype <>", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeGreaterThan(String value) {
            addCriterion("operation_deletetype >", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("operation_deletetype >=", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeLessThan(String value) {
            addCriterion("operation_deletetype <", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("operation_deletetype <=", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeLike(String value) {
            addCriterion("operation_deletetype like", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeNotLike(String value) {
            addCriterion("operation_deletetype not like", value, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeIn(List<String> values) {
            addCriterion("operation_deletetype in", values, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeNotIn(List<String> values) {
            addCriterion("operation_deletetype not in", values, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeBetween(String value1, String value2) {
            addCriterion("operation_deletetype between", value1, value2, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationDeletetypeNotBetween(String value1, String value2) {
            addCriterion("operation_deletetype not between", value1, value2, "operationDeletetype");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeIsNull() {
            addCriterion("operation_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeIsNotNull() {
            addCriterion("operation_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeEqualTo(Date value) {
            addCriterion("operation_foundtime =", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeNotEqualTo(Date value) {
            addCriterion("operation_foundtime <>", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeGreaterThan(Date value) {
            addCriterion("operation_foundtime >", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_foundtime >=", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeLessThan(Date value) {
            addCriterion("operation_foundtime <", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_foundtime <=", value, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeIn(List<Date> values) {
            addCriterion("operation_foundtime in", values, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeNotIn(List<Date> values) {
            addCriterion("operation_foundtime not in", values, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeBetween(Date value1, Date value2) {
            addCriterion("operation_foundtime between", value1, value2, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationFoundtimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_foundtime not between", value1, value2, "operationFoundtime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeIsNull() {
            addCriterion("operation_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeIsNotNull() {
            addCriterion("operation_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeEqualTo(Date value) {
            addCriterion("operation_updatetime =", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeNotEqualTo(Date value) {
            addCriterion("operation_updatetime <>", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeGreaterThan(Date value) {
            addCriterion("operation_updatetime >", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operation_updatetime >=", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeLessThan(Date value) {
            addCriterion("operation_updatetime <", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("operation_updatetime <=", value, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeIn(List<Date> values) {
            addCriterion("operation_updatetime in", values, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeNotIn(List<Date> values) {
            addCriterion("operation_updatetime not in", values, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("operation_updatetime between", value1, value2, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("operation_updatetime not between", value1, value2, "operationUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOperationBackIsNull() {
            addCriterion("operation_back is null");
            return (Criteria) this;
        }

        public Criteria andOperationBackIsNotNull() {
            addCriterion("operation_back is not null");
            return (Criteria) this;
        }

        public Criteria andOperationBackEqualTo(String value) {
            addCriterion("operation_back =", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackNotEqualTo(String value) {
            addCriterion("operation_back <>", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackGreaterThan(String value) {
            addCriterion("operation_back >", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackGreaterThanOrEqualTo(String value) {
            addCriterion("operation_back >=", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackLessThan(String value) {
            addCriterion("operation_back <", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackLessThanOrEqualTo(String value) {
            addCriterion("operation_back <=", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackLike(String value) {
            addCriterion("operation_back like", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackNotLike(String value) {
            addCriterion("operation_back not like", value, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackIn(List<String> values) {
            addCriterion("operation_back in", values, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackNotIn(List<String> values) {
            addCriterion("operation_back not in", values, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackBetween(String value1, String value2) {
            addCriterion("operation_back between", value1, value2, "operationBack");
            return (Criteria) this;
        }

        public Criteria andOperationBackNotBetween(String value1, String value2) {
            addCriterion("operation_back not between", value1, value2, "operationBack");
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
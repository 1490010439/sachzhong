/*
 * @ClassName MenuDOExample
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MenuDOExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    /**
     * @Title MenuDOExample
     * @return 
     */
    public MenuDOExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuGradeIsNull() {
            addCriterion("menu_grade is null");
            return (Criteria) this;
        }

        public Criteria andMenuGradeIsNotNull() {
            addCriterion("menu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMenuGradeEqualTo(Integer value) {
            addCriterion("menu_grade =", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeNotEqualTo(Integer value) {
            addCriterion("menu_grade <>", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeGreaterThan(Integer value) {
            addCriterion("menu_grade >", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_grade >=", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeLessThan(Integer value) {
            addCriterion("menu_grade <", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeLessThanOrEqualTo(Integer value) {
            addCriterion("menu_grade <=", value, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeIn(List<Integer> values) {
            addCriterion("menu_grade in", values, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeNotIn(List<Integer> values) {
            addCriterion("menu_grade not in", values, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeBetween(Integer value1, Integer value2) {
            addCriterion("menu_grade between", value1, value2, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_grade not between", value1, value2, "menuGrade");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("menu_type like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("menu_type not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuNumberIsNull() {
            addCriterion("menu_number is null");
            return (Criteria) this;
        }

        public Criteria andMenuNumberIsNotNull() {
            addCriterion("menu_number is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNumberEqualTo(String value) {
            addCriterion("menu_number =", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberNotEqualTo(String value) {
            addCriterion("menu_number <>", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberGreaterThan(String value) {
            addCriterion("menu_number >", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberGreaterThanOrEqualTo(String value) {
            addCriterion("menu_number >=", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberLessThan(String value) {
            addCriterion("menu_number <", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberLessThanOrEqualTo(String value) {
            addCriterion("menu_number <=", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberLike(String value) {
            addCriterion("menu_number like", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberNotLike(String value) {
            addCriterion("menu_number not like", value, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberIn(List<String> values) {
            addCriterion("menu_number in", values, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberNotIn(List<String> values) {
            addCriterion("menu_number not in", values, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberBetween(String value1, String value2) {
            addCriterion("menu_number between", value1, value2, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuNumberNotBetween(String value1, String value2) {
            addCriterion("menu_number not between", value1, value2, "menuNumber");
            return (Criteria) this;
        }

        public Criteria andMenuInfoIsNull() {
            addCriterion("menu_info is null");
            return (Criteria) this;
        }

        public Criteria andMenuInfoIsNotNull() {
            addCriterion("menu_info is not null");
            return (Criteria) this;
        }

        public Criteria andMenuInfoEqualTo(String value) {
            addCriterion("menu_info =", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoNotEqualTo(String value) {
            addCriterion("menu_info <>", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoGreaterThan(String value) {
            addCriterion("menu_info >", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoGreaterThanOrEqualTo(String value) {
            addCriterion("menu_info >=", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoLessThan(String value) {
            addCriterion("menu_info <", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoLessThanOrEqualTo(String value) {
            addCriterion("menu_info <=", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoLike(String value) {
            addCriterion("menu_info like", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoNotLike(String value) {
            addCriterion("menu_info not like", value, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoIn(List<String> values) {
            addCriterion("menu_info in", values, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoNotIn(List<String> values) {
            addCriterion("menu_info not in", values, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoBetween(String value1, String value2) {
            addCriterion("menu_info between", value1, value2, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuInfoNotBetween(String value1, String value2) {
            addCriterion("menu_info not between", value1, value2, "menuInfo");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridIsNull() {
            addCriterion("menu_opuserid is null");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridIsNotNull() {
            addCriterion("menu_opuserid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridEqualTo(Integer value) {
            addCriterion("menu_opuserid =", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridNotEqualTo(Integer value) {
            addCriterion("menu_opuserid <>", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridGreaterThan(Integer value) {
            addCriterion("menu_opuserid >", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_opuserid >=", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridLessThan(Integer value) {
            addCriterion("menu_opuserid <", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridLessThanOrEqualTo(Integer value) {
            addCriterion("menu_opuserid <=", value, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridIn(List<Integer> values) {
            addCriterion("menu_opuserid in", values, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridNotIn(List<Integer> values) {
            addCriterion("menu_opuserid not in", values, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridBetween(Integer value1, Integer value2) {
            addCriterion("menu_opuserid between", value1, value2, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuOpuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_opuserid not between", value1, value2, "menuOpuserid");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeIsNull() {
            addCriterion("menu_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeIsNotNull() {
            addCriterion("menu_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeEqualTo(String value) {
            addCriterion("menu_deletetype =", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeNotEqualTo(String value) {
            addCriterion("menu_deletetype <>", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeGreaterThan(String value) {
            addCriterion("menu_deletetype >", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_deletetype >=", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeLessThan(String value) {
            addCriterion("menu_deletetype <", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("menu_deletetype <=", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeLike(String value) {
            addCriterion("menu_deletetype like", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeNotLike(String value) {
            addCriterion("menu_deletetype not like", value, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeIn(List<String> values) {
            addCriterion("menu_deletetype in", values, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeNotIn(List<String> values) {
            addCriterion("menu_deletetype not in", values, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeBetween(String value1, String value2) {
            addCriterion("menu_deletetype between", value1, value2, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuDeletetypeNotBetween(String value1, String value2) {
            addCriterion("menu_deletetype not between", value1, value2, "menuDeletetype");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeIsNull() {
            addCriterion("menu_foundtime is null");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeIsNotNull() {
            addCriterion("menu_foundtime is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeEqualTo(LocalDateTime value) {
            addCriterion("menu_foundtime =", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeNotEqualTo(LocalDateTime value) {
            addCriterion("menu_foundtime <>", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeGreaterThan(LocalDateTime value) {
            addCriterion("menu_foundtime >", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("menu_foundtime >=", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeLessThan(LocalDateTime value) {
            addCriterion("menu_foundtime <", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("menu_foundtime <=", value, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeIn(List<LocalDateTime> values) {
            addCriterion("menu_foundtime in", values, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeNotIn(List<LocalDateTime> values) {
            addCriterion("menu_foundtime not in", values, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menu_foundtime between", value1, value2, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuFoundtimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menu_foundtime not between", value1, value2, "menuFoundtime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeIsNull() {
            addCriterion("menu_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeIsNotNull() {
            addCriterion("menu_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeEqualTo(LocalDateTime value) {
            addCriterion("menu_updatetime =", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("menu_updatetime <>", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeGreaterThan(LocalDateTime value) {
            addCriterion("menu_updatetime >", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("menu_updatetime >=", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeLessThan(LocalDateTime value) {
            addCriterion("menu_updatetime <", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("menu_updatetime <=", value, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeIn(List<LocalDateTime> values) {
            addCriterion("menu_updatetime in", values, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("menu_updatetime not in", values, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menu_updatetime between", value1, value2, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuUpdatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("menu_updatetime not between", value1, value2, "menuUpdatetime");
            return (Criteria) this;
        }

        public Criteria andMenuBackIsNull() {
            addCriterion("menu_back is null");
            return (Criteria) this;
        }

        public Criteria andMenuBackIsNotNull() {
            addCriterion("menu_back is not null");
            return (Criteria) this;
        }

        public Criteria andMenuBackEqualTo(String value) {
            addCriterion("menu_back =", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackNotEqualTo(String value) {
            addCriterion("menu_back <>", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackGreaterThan(String value) {
            addCriterion("menu_back >", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackGreaterThanOrEqualTo(String value) {
            addCriterion("menu_back >=", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackLessThan(String value) {
            addCriterion("menu_back <", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackLessThanOrEqualTo(String value) {
            addCriterion("menu_back <=", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackLike(String value) {
            addCriterion("menu_back like", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackNotLike(String value) {
            addCriterion("menu_back not like", value, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackIn(List<String> values) {
            addCriterion("menu_back in", values, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackNotIn(List<String> values) {
            addCriterion("menu_back not in", values, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackBetween(String value1, String value2) {
            addCriterion("menu_back between", value1, value2, "menuBack");
            return (Criteria) this;
        }

        public Criteria andMenuBackNotBetween(String value1, String value2) {
            addCriterion("menu_back not between", value1, value2, "menuBack");
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
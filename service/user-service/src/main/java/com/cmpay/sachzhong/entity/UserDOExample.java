/*
 * @ClassName UserDOExample
 * @Description 
 * @version 1.0
 * @Date 2020-06-23 10:01:22
 */
package com.cmpay.sachzhong.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDOExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    /**
     * @Title UserDOExample
     * @return 
     */
    public UserDOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNull() {
            addCriterion("user_money is null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNotNull() {
            addCriterion("user_money is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyEqualTo(Float value) {
            addCriterion("user_money =", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotEqualTo(Float value) {
            addCriterion("user_money <>", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThan(Float value) {
            addCriterion("user_money >", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("user_money >=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThan(Float value) {
            addCriterion("user_money <", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThanOrEqualTo(Float value) {
            addCriterion("user_money <=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIn(List<Float> values) {
            addCriterion("user_money in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotIn(List<Float> values) {
            addCriterion("user_money not in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyBetween(Float value1, Float value2) {
            addCriterion("user_money between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotBetween(Float value1, Float value2) {
            addCriterion("user_money not between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNull() {
            addCriterion("user_img is null");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNotNull() {
            addCriterion("user_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserImgEqualTo(String value) {
            addCriterion("user_img =", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotEqualTo(String value) {
            addCriterion("user_img <>", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThan(String value) {
            addCriterion("user_img >", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_img >=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThan(String value) {
            addCriterion("user_img <", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThanOrEqualTo(String value) {
            addCriterion("user_img <=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLike(String value) {
            addCriterion("user_img like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotLike(String value) {
            addCriterion("user_img not like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgIn(List<String> values) {
            addCriterion("user_img in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotIn(List<String> values) {
            addCriterion("user_img not in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgBetween(String value1, String value2) {
            addCriterion("user_img between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotBetween(String value1, String value2) {
            addCriterion("user_img not between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNull() {
            addCriterion("user_age is null");
            return (Criteria) this;
        }

        public Criteria andUserAgeIsNotNull() {
            addCriterion("user_age is not null");
            return (Criteria) this;
        }

        public Criteria andUserAgeEqualTo(String value) {
            addCriterion("user_age =", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotEqualTo(String value) {
            addCriterion("user_age <>", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThan(String value) {
            addCriterion("user_age >", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeGreaterThanOrEqualTo(String value) {
            addCriterion("user_age >=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThan(String value) {
            addCriterion("user_age <", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLessThanOrEqualTo(String value) {
            addCriterion("user_age <=", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeLike(String value) {
            addCriterion("user_age like", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotLike(String value) {
            addCriterion("user_age not like", value, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeIn(List<String> values) {
            addCriterion("user_age in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotIn(List<String> values) {
            addCriterion("user_age not in", values, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeBetween(String value1, String value2) {
            addCriterion("user_age between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserAgeNotBetween(String value1, String value2) {
            addCriterion("user_age not between", value1, value2, "userAge");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNull() {
            addCriterion("user_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIsNotNull() {
            addCriterion("user_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardEqualTo(String value) {
            addCriterion("user_idcard =", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotEqualTo(String value) {
            addCriterion("user_idcard <>", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThan(String value) {
            addCriterion("user_idcard >", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcard >=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThan(String value) {
            addCriterion("user_idcard <", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLessThanOrEqualTo(String value) {
            addCriterion("user_idcard <=", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardLike(String value) {
            addCriterion("user_idcard like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotLike(String value) {
            addCriterion("user_idcard not like", value, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardIn(List<String> values) {
            addCriterion("user_idcard in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotIn(List<String> values) {
            addCriterion("user_idcard not in", values, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardBetween(String value1, String value2) {
            addCriterion("user_idcard between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardNotBetween(String value1, String value2) {
            addCriterion("user_idcard not between", value1, value2, "userIdcard");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameIsNull() {
            addCriterion("user_idcardname is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameIsNotNull() {
            addCriterion("user_idcardname is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameEqualTo(String value) {
            addCriterion("user_idcardname =", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameNotEqualTo(String value) {
            addCriterion("user_idcardname <>", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameGreaterThan(String value) {
            addCriterion("user_idcardname >", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcardname >=", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameLessThan(String value) {
            addCriterion("user_idcardname <", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameLessThanOrEqualTo(String value) {
            addCriterion("user_idcardname <=", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameLike(String value) {
            addCriterion("user_idcardname like", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameNotLike(String value) {
            addCriterion("user_idcardname not like", value, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameIn(List<String> values) {
            addCriterion("user_idcardname in", values, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameNotIn(List<String> values) {
            addCriterion("user_idcardname not in", values, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameBetween(String value1, String value2) {
            addCriterion("user_idcardname between", value1, value2, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnameNotBetween(String value1, String value2) {
            addCriterion("user_idcardname not between", value1, value2, "userIdcardname");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("user_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("user_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("user_mail =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("user_mail <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("user_mail >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("user_mail >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("user_mail <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("user_mail <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("user_mail like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("user_mail not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("user_mail in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("user_mail not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("user_mail between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("user_mail not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeIsNull() {
            addCriterion("user_deletetype is null");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeIsNotNull() {
            addCriterion("user_deletetype is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeEqualTo(String value) {
            addCriterion("user_deletetype =", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeNotEqualTo(String value) {
            addCriterion("user_deletetype <>", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeGreaterThan(String value) {
            addCriterion("user_deletetype >", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_deletetype >=", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeLessThan(String value) {
            addCriterion("user_deletetype <", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeLessThanOrEqualTo(String value) {
            addCriterion("user_deletetype <=", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeLike(String value) {
            addCriterion("user_deletetype like", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeNotLike(String value) {
            addCriterion("user_deletetype not like", value, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeIn(List<String> values) {
            addCriterion("user_deletetype in", values, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeNotIn(List<String> values) {
            addCriterion("user_deletetype not in", values, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeBetween(String value1, String value2) {
            addCriterion("user_deletetype between", value1, value2, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserDeletetypeNotBetween(String value1, String value2) {
            addCriterion("user_deletetype not between", value1, value2, "userDeletetype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeIsNull() {
            addCriterion("user_logintype is null");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeIsNotNull() {
            addCriterion("user_logintype is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeEqualTo(String value) {
            addCriterion("user_logintype =", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeNotEqualTo(String value) {
            addCriterion("user_logintype <>", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeGreaterThan(String value) {
            addCriterion("user_logintype >", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_logintype >=", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeLessThan(String value) {
            addCriterion("user_logintype <", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeLessThanOrEqualTo(String value) {
            addCriterion("user_logintype <=", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeLike(String value) {
            addCriterion("user_logintype like", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeNotLike(String value) {
            addCriterion("user_logintype not like", value, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeIn(List<String> values) {
            addCriterion("user_logintype in", values, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeNotIn(List<String> values) {
            addCriterion("user_logintype not in", values, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeBetween(String value1, String value2) {
            addCriterion("user_logintype between", value1, value2, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLogintypeNotBetween(String value1, String value2) {
            addCriterion("user_logintype not between", value1, value2, "userLogintype");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIsNull() {
            addCriterion("user_loginip is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIsNotNull() {
            addCriterion("user_loginip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginipEqualTo(String value) {
            addCriterion("user_loginip =", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotEqualTo(String value) {
            addCriterion("user_loginip <>", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipGreaterThan(String value) {
            addCriterion("user_loginip >", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginip >=", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLessThan(String value) {
            addCriterion("user_loginip <", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLessThanOrEqualTo(String value) {
            addCriterion("user_loginip <=", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipLike(String value) {
            addCriterion("user_loginip like", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotLike(String value) {
            addCriterion("user_loginip not like", value, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipIn(List<String> values) {
            addCriterion("user_loginip in", values, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotIn(List<String> values) {
            addCriterion("user_loginip not in", values, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipBetween(String value1, String value2) {
            addCriterion("user_loginip between", value1, value2, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserLoginipNotBetween(String value1, String value2) {
            addCriterion("user_loginip not between", value1, value2, "userLoginip");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeIsNull() {
            addCriterion("user_deletetime is null");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeIsNotNull() {
            addCriterion("user_deletetime is not null");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeEqualTo(LocalDateTime value) {
            addCriterion("user_deletetime =", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeNotEqualTo(LocalDateTime value) {
            addCriterion("user_deletetime <>", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeGreaterThan(LocalDateTime value) {
            addCriterion("user_deletetime >", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_deletetime >=", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeLessThan(LocalDateTime value) {
            addCriterion("user_deletetime <", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_deletetime <=", value, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeIn(List<LocalDateTime> values) {
            addCriterion("user_deletetime in", values, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeNotIn(List<LocalDateTime> values) {
            addCriterion("user_deletetime not in", values, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_deletetime between", value1, value2, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserDeletetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_deletetime not between", value1, value2, "userDeletetime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNull() {
            addCriterion("user_regtime is null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIsNotNull() {
            addCriterion("user_regtime is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeEqualTo(LocalDateTime value) {
            addCriterion("user_regtime =", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotEqualTo(LocalDateTime value) {
            addCriterion("user_regtime <>", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThan(LocalDateTime value) {
            addCriterion("user_regtime >", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_regtime >=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThan(LocalDateTime value) {
            addCriterion("user_regtime <", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_regtime <=", value, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeIn(List<LocalDateTime> values) {
            addCriterion("user_regtime in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotIn(List<LocalDateTime> values) {
            addCriterion("user_regtime not in", values, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_regtime between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserRegtimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_regtime not between", value1, value2, "userRegtime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIsNull() {
            addCriterion("user_logintime is null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIsNotNull() {
            addCriterion("user_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeEqualTo(LocalDateTime value) {
            addCriterion("user_logintime =", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotEqualTo(LocalDateTime value) {
            addCriterion("user_logintime <>", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeGreaterThan(LocalDateTime value) {
            addCriterion("user_logintime >", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_logintime >=", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeLessThan(LocalDateTime value) {
            addCriterion("user_logintime <", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_logintime <=", value, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeIn(List<LocalDateTime> values) {
            addCriterion("user_logintime in", values, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotIn(List<LocalDateTime> values) {
            addCriterion("user_logintime not in", values, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_logintime between", value1, value2, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserLogintimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_logintime not between", value1, value2, "userLogintime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeIsNull() {
            addCriterion("user_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeIsNotNull() {
            addCriterion("user_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeEqualTo(LocalDateTime value) {
            addCriterion("user_updatetime =", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("user_updatetime <>", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeGreaterThan(LocalDateTime value) {
            addCriterion("user_updatetime >", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_updatetime >=", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeLessThan(LocalDateTime value) {
            addCriterion("user_updatetime <", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("user_updatetime <=", value, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeIn(List<LocalDateTime> values) {
            addCriterion("user_updatetime in", values, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("user_updatetime not in", values, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_updatetime between", value1, value2, "userUpdatetime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("user_updatetime not between", value1, value2, "userUpdatetime");
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
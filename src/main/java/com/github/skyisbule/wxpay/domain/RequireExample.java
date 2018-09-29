package com.github.skyisbule.wxpay.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RequireExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andLocatesIsNull() {
            addCriterion("locates is null");
            return (Criteria) this;
        }

        public Criteria andLocatesIsNotNull() {
            addCriterion("locates is not null");
            return (Criteria) this;
        }

        public Criteria andLocatesEqualTo(String value) {
            addCriterion("locates =", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesNotEqualTo(String value) {
            addCriterion("locates <>", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesGreaterThan(String value) {
            addCriterion("locates >", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesGreaterThanOrEqualTo(String value) {
            addCriterion("locates >=", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesLessThan(String value) {
            addCriterion("locates <", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesLessThanOrEqualTo(String value) {
            addCriterion("locates <=", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesLike(String value) {
            addCriterion("locates like", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesNotLike(String value) {
            addCriterion("locates not like", value, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesIn(List<String> values) {
            addCriterion("locates in", values, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesNotIn(List<String> values) {
            addCriterion("locates not in", values, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesBetween(String value1, String value2) {
            addCriterion("locates between", value1, value2, "locates");
            return (Criteria) this;
        }

        public Criteria andLocatesNotBetween(String value1, String value2) {
            addCriterion("locates not between", value1, value2, "locates");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNull() {
            addCriterion("purpose is null");
            return (Criteria) this;
        }

        public Criteria andPurposeIsNotNull() {
            addCriterion("purpose is not null");
            return (Criteria) this;
        }

        public Criteria andPurposeEqualTo(String value) {
            addCriterion("purpose =", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotEqualTo(String value) {
            addCriterion("purpose <>", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThan(String value) {
            addCriterion("purpose >", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("purpose >=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThan(String value) {
            addCriterion("purpose <", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLessThanOrEqualTo(String value) {
            addCriterion("purpose <=", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeLike(String value) {
            addCriterion("purpose like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotLike(String value) {
            addCriterion("purpose not like", value, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeIn(List<String> values) {
            addCriterion("purpose in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotIn(List<String> values) {
            addCriterion("purpose not in", values, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeBetween(String value1, String value2) {
            addCriterion("purpose between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andPurposeNotBetween(String value1, String value2) {
            addCriterion("purpose not between", value1, value2, "purpose");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireIsNull() {
            addCriterion("fire_control_require is null");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireIsNotNull() {
            addCriterion("fire_control_require is not null");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireEqualTo(String value) {
            addCriterion("fire_control_require =", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireNotEqualTo(String value) {
            addCriterion("fire_control_require <>", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireGreaterThan(String value) {
            addCriterion("fire_control_require >", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireGreaterThanOrEqualTo(String value) {
            addCriterion("fire_control_require >=", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireLessThan(String value) {
            addCriterion("fire_control_require <", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireLessThanOrEqualTo(String value) {
            addCriterion("fire_control_require <=", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireLike(String value) {
            addCriterion("fire_control_require like", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireNotLike(String value) {
            addCriterion("fire_control_require not like", value, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireIn(List<String> values) {
            addCriterion("fire_control_require in", values, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireNotIn(List<String> values) {
            addCriterion("fire_control_require not in", values, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireBetween(String value1, String value2) {
            addCriterion("fire_control_require between", value1, value2, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andFireControlRequireNotBetween(String value1, String value2) {
            addCriterion("fire_control_require not between", value1, value2, "fireControlRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireIsNull() {
            addCriterion("platform_require is null");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireIsNotNull() {
            addCriterion("platform_require is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireEqualTo(String value) {
            addCriterion("platform_require =", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireNotEqualTo(String value) {
            addCriterion("platform_require <>", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireGreaterThan(String value) {
            addCriterion("platform_require >", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireGreaterThanOrEqualTo(String value) {
            addCriterion("platform_require >=", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireLessThan(String value) {
            addCriterion("platform_require <", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireLessThanOrEqualTo(String value) {
            addCriterion("platform_require <=", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireLike(String value) {
            addCriterion("platform_require like", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireNotLike(String value) {
            addCriterion("platform_require not like", value, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireIn(List<String> values) {
            addCriterion("platform_require in", values, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireNotIn(List<String> values) {
            addCriterion("platform_require not in", values, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireBetween(String value1, String value2) {
            addCriterion("platform_require between", value1, value2, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andPlatformRequireNotBetween(String value1, String value2) {
            addCriterion("platform_require not between", value1, value2, "platformRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireIsNull() {
            addCriterion("floor_require is null");
            return (Criteria) this;
        }

        public Criteria andFloorRequireIsNotNull() {
            addCriterion("floor_require is not null");
            return (Criteria) this;
        }

        public Criteria andFloorRequireEqualTo(String value) {
            addCriterion("floor_require =", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireNotEqualTo(String value) {
            addCriterion("floor_require <>", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireGreaterThan(String value) {
            addCriterion("floor_require >", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireGreaterThanOrEqualTo(String value) {
            addCriterion("floor_require >=", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireLessThan(String value) {
            addCriterion("floor_require <", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireLessThanOrEqualTo(String value) {
            addCriterion("floor_require <=", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireLike(String value) {
            addCriterion("floor_require like", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireNotLike(String value) {
            addCriterion("floor_require not like", value, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireIn(List<String> values) {
            addCriterion("floor_require in", values, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireNotIn(List<String> values) {
            addCriterion("floor_require not in", values, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireBetween(String value1, String value2) {
            addCriterion("floor_require between", value1, value2, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andFloorRequireNotBetween(String value1, String value2) {
            addCriterion("floor_require not between", value1, value2, "floorRequire");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIsNull() {
            addCriterion("require_time is null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIsNotNull() {
            addCriterion("require_time is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTimeEqualTo(Date value) {
            addCriterion("require_time =", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotEqualTo(Date value) {
            addCriterion("require_time <>", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThan(Date value) {
            addCriterion("require_time >", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("require_time >=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThan(Date value) {
            addCriterion("require_time <", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeLessThanOrEqualTo(Date value) {
            addCriterion("require_time <=", value, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeIn(List<Date> values) {
            addCriterion("require_time in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotIn(List<Date> values) {
            addCriterion("require_time not in", values, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeBetween(Date value1, Date value2) {
            addCriterion("require_time between", value1, value2, "requireTime");
            return (Criteria) this;
        }

        public Criteria andRequireTimeNotBetween(Date value1, Date value2) {
            addCriterion("require_time not between", value1, value2, "requireTime");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIsNull() {
            addCriterion("lease_term is null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIsNotNull() {
            addCriterion("lease_term is not null");
            return (Criteria) this;
        }

        public Criteria andLeaseTermEqualTo(String value) {
            addCriterion("lease_term =", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotEqualTo(String value) {
            addCriterion("lease_term <>", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermGreaterThan(String value) {
            addCriterion("lease_term >", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermGreaterThanOrEqualTo(String value) {
            addCriterion("lease_term >=", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermLessThan(String value) {
            addCriterion("lease_term <", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermLessThanOrEqualTo(String value) {
            addCriterion("lease_term <=", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermLike(String value) {
            addCriterion("lease_term like", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotLike(String value) {
            addCriterion("lease_term not like", value, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermIn(List<String> values) {
            addCriterion("lease_term in", values, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotIn(List<String> values) {
            addCriterion("lease_term not in", values, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermBetween(String value1, String value2) {
            addCriterion("lease_term between", value1, value2, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andLeaseTermNotBetween(String value1, String value2) {
            addCriterion("lease_term not between", value1, value2, "leaseTerm");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("max_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("max_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceEqualTo(Integer value) {
            addCriterion("max_price =", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotEqualTo(Integer value) {
            addCriterion("max_price <>", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThan(Integer value) {
            addCriterion("max_price >", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_price >=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThan(Integer value) {
            addCriterion("max_price <", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(Integer value) {
            addCriterion("max_price <=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIn(List<Integer> values) {
            addCriterion("max_price in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotIn(List<Integer> values) {
            addCriterion("max_price not in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceBetween(Integer value1, Integer value2) {
            addCriterion("max_price between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("max_price not between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }
    }

    /**
     */
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
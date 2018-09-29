package com.github.skyisbule.wxpay.domain;

import java.util.ArrayList;
import java.util.List;

public class WarehouseUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public WarehouseUnitExample() {
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

        public Criteria andWuidIsNull() {
            addCriterion("wuid is null");
            return (Criteria) this;
        }

        public Criteria andWuidIsNotNull() {
            addCriterion("wuid is not null");
            return (Criteria) this;
        }

        public Criteria andWuidEqualTo(Integer value) {
            addCriterion("wuid =", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotEqualTo(Integer value) {
            addCriterion("wuid <>", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidGreaterThan(Integer value) {
            addCriterion("wuid >", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wuid >=", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidLessThan(Integer value) {
            addCriterion("wuid <", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidLessThanOrEqualTo(Integer value) {
            addCriterion("wuid <=", value, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidIn(List<Integer> values) {
            addCriterion("wuid in", values, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotIn(List<Integer> values) {
            addCriterion("wuid not in", values, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidBetween(Integer value1, Integer value2) {
            addCriterion("wuid between", value1, value2, "wuid");
            return (Criteria) this;
        }

        public Criteria andWuidNotBetween(Integer value1, Integer value2) {
            addCriterion("wuid not between", value1, value2, "wuid");
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

        public Criteria andCouldSubletIsNull() {
            addCriterion("could_sublet is null");
            return (Criteria) this;
        }

        public Criteria andCouldSubletIsNotNull() {
            addCriterion("could_sublet is not null");
            return (Criteria) this;
        }

        public Criteria andCouldSubletEqualTo(Integer value) {
            addCriterion("could_sublet =", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletNotEqualTo(Integer value) {
            addCriterion("could_sublet <>", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletGreaterThan(Integer value) {
            addCriterion("could_sublet >", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletGreaterThanOrEqualTo(Integer value) {
            addCriterion("could_sublet >=", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletLessThan(Integer value) {
            addCriterion("could_sublet <", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletLessThanOrEqualTo(Integer value) {
            addCriterion("could_sublet <=", value, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletIn(List<Integer> values) {
            addCriterion("could_sublet in", values, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletNotIn(List<Integer> values) {
            addCriterion("could_sublet not in", values, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletBetween(Integer value1, Integer value2) {
            addCriterion("could_sublet between", value1, value2, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andCouldSubletNotBetween(Integer value1, Integer value2) {
            addCriterion("could_sublet not between", value1, value2, "couldSublet");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaIsNull() {
            addCriterion("min_sublet_area is null");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaIsNotNull() {
            addCriterion("min_sublet_area is not null");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaEqualTo(Integer value) {
            addCriterion("min_sublet_area =", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaNotEqualTo(Integer value) {
            addCriterion("min_sublet_area <>", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaGreaterThan(Integer value) {
            addCriterion("min_sublet_area >", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_sublet_area >=", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaLessThan(Integer value) {
            addCriterion("min_sublet_area <", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaLessThanOrEqualTo(Integer value) {
            addCriterion("min_sublet_area <=", value, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaIn(List<Integer> values) {
            addCriterion("min_sublet_area in", values, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaNotIn(List<Integer> values) {
            addCriterion("min_sublet_area not in", values, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaBetween(Integer value1, Integer value2) {
            addCriterion("min_sublet_area between", value1, value2, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andMinSubletAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("min_sublet_area not between", value1, value2, "minSubletArea");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesIsNull() {
            addCriterion("supporting_facilities is null");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesIsNotNull() {
            addCriterion("supporting_facilities is not null");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesEqualTo(String value) {
            addCriterion("supporting_facilities =", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesNotEqualTo(String value) {
            addCriterion("supporting_facilities <>", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesGreaterThan(String value) {
            addCriterion("supporting_facilities >", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("supporting_facilities >=", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesLessThan(String value) {
            addCriterion("supporting_facilities <", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("supporting_facilities <=", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesLike(String value) {
            addCriterion("supporting_facilities like", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesNotLike(String value) {
            addCriterion("supporting_facilities not like", value, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesIn(List<String> values) {
            addCriterion("supporting_facilities in", values, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesNotIn(List<String> values) {
            addCriterion("supporting_facilities not in", values, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesBetween(String value1, String value2) {
            addCriterion("supporting_facilities between", value1, value2, "supportingFacilities");
            return (Criteria) this;
        }

        public Criteria andSupportingFacilitiesNotBetween(String value1, String value2) {
            addCriterion("supporting_facilities not between", value1, value2, "supportingFacilities");
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
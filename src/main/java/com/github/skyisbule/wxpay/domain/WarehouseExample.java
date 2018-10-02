package com.github.skyisbule.wxpay.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public WarehouseExample() {
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
                //throw new RuntimeException("Value for condition cannot be null");
                return;
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                //throw new RuntimeException("Value for " + property + " cannot be null");
                return ;
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                //throw new RuntimeException("Between values for " + property + " cannot be null");
                return ;
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Integer value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Integer value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Integer value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Integer value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Integer value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Integer> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Integer> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Integer value1, Integer value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Integer value1, Integer value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andLocateIsNull() {
            addCriterion("locate is null");
            return (Criteria) this;
        }

        public Criteria andLocateIsNotNull() {
            addCriterion("locate is not null");
            return (Criteria) this;
        }

        public Criteria andLocateEqualTo(String value) {
            addCriterion("locate =", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotEqualTo(String value) {
            addCriterion("locate <>", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThan(String value) {
            addCriterion("locate >", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateGreaterThanOrEqualTo(String value) {
            addCriterion("locate >=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThan(String value) {
            addCriterion("locate <", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLessThanOrEqualTo(String value) {
            addCriterion("locate <=", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateLike(String value) {
            addCriterion("locate like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotLike(String value) {
            addCriterion("locate not like", value, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateIn(List<String> values) {
            addCriterion("locate in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotIn(List<String> values) {
            addCriterion("locate not in", values, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateBetween(String value1, String value2) {
            addCriterion("locate between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andLocateNotBetween(String value1, String value2) {
            addCriterion("locate not between", value1, value2, "locate");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andParkServiceIsNull() {
            addCriterion("park_service is null");
            return (Criteria) this;
        }

        public Criteria andParkServiceIsNotNull() {
            addCriterion("park_service is not null");
            return (Criteria) this;
        }

        public Criteria andParkServiceEqualTo(String value) {
            addCriterion("park_service =", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceNotEqualTo(String value) {
            addCriterion("park_service <>", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceGreaterThan(String value) {
            addCriterion("park_service >", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceGreaterThanOrEqualTo(String value) {
            addCriterion("park_service >=", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceLessThan(String value) {
            addCriterion("park_service <", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceLessThanOrEqualTo(String value) {
            addCriterion("park_service <=", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceLike(String value) {
            addCriterion("park_service like", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceNotLike(String value) {
            addCriterion("park_service not like", value, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceIn(List<String> values) {
            addCriterion("park_service in", values, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceNotIn(List<String> values) {
            addCriterion("park_service not in", values, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceBetween(String value1, String value2) {
            addCriterion("park_service between", value1, value2, "parkService");
            return (Criteria) this;
        }

        public Criteria andParkServiceNotBetween(String value1, String value2) {
            addCriterion("park_service not between", value1, value2, "parkService");
            return (Criteria) this;
        }

        public Criteria andSuitableForIsNull() {
            addCriterion("suitable_for is null");
            return (Criteria) this;
        }

        public Criteria andSuitableForIsNotNull() {
            addCriterion("suitable_for is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableForEqualTo(String value) {
            addCriterion("suitable_for =", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForNotEqualTo(String value) {
            addCriterion("suitable_for <>", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForGreaterThan(String value) {
            addCriterion("suitable_for >", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForGreaterThanOrEqualTo(String value) {
            addCriterion("suitable_for >=", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForLessThan(String value) {
            addCriterion("suitable_for <", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForLessThanOrEqualTo(String value) {
            addCriterion("suitable_for <=", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForLike(String value) {
            addCriterion("suitable_for like", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForNotLike(String value) {
            addCriterion("suitable_for not like", value, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForIn(List<String> values) {
            addCriterion("suitable_for in", values, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForNotIn(List<String> values) {
            addCriterion("suitable_for not in", values, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForBetween(String value1, String value2) {
            addCriterion("suitable_for between", value1, value2, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andSuitableForNotBetween(String value1, String value2) {
            addCriterion("suitable_for not between", value1, value2, "suitableFor");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("is_pass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("is_pass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(Integer value) {
            addCriterion("is_pass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(Integer value) {
            addCriterion("is_pass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(Integer value) {
            addCriterion("is_pass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(Integer value) {
            addCriterion("is_pass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(Integer value) {
            addCriterion("is_pass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<Integer> values) {
            addCriterion("is_pass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<Integer> values) {
            addCriterion("is_pass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(Integer value1, Integer value2) {
            addCriterion("is_pass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pass not between", value1, value2, "isPass");
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

        public Criteria andAdvantageIsNull() {
            addCriterion("advantage is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNotNull() {
            addCriterion("advantage is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageEqualTo(String value) {
            addCriterion("advantage =", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotEqualTo(String value) {
            addCriterion("advantage <>", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThan(String value) {
            addCriterion("advantage >", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("advantage >=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThan(String value) {
            addCriterion("advantage <", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThanOrEqualTo(String value) {
            addCriterion("advantage <=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLike(String value) {
            addCriterion("advantage like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotLike(String value) {
            addCriterion("advantage not like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageIn(List<String> values) {
            addCriterion("advantage in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotIn(List<String> values) {
            addCriterion("advantage not in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageBetween(String value1, String value2) {
            addCriterion("advantage between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotBetween(String value1, String value2) {
            addCriterion("advantage not between", value1, value2, "advantage");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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
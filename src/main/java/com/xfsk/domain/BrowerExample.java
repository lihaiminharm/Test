package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrowerExample() {
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

        public Criteria andBroIdIsNull() {
            addCriterion("Bro_id is null");
            return (Criteria) this;
        }

        public Criteria andBroIdIsNotNull() {
            addCriterion("Bro_id is not null");
            return (Criteria) this;
        }

        public Criteria andBroIdEqualTo(Integer value) {
            addCriterion("Bro_id =", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotEqualTo(Integer value) {
            addCriterion("Bro_id <>", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdGreaterThan(Integer value) {
            addCriterion("Bro_id >", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bro_id >=", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdLessThan(Integer value) {
            addCriterion("Bro_id <", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdLessThanOrEqualTo(Integer value) {
            addCriterion("Bro_id <=", value, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdIn(List<Integer> values) {
            addCriterion("Bro_id in", values, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotIn(List<Integer> values) {
            addCriterion("Bro_id not in", values, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdBetween(Integer value1, Integer value2) {
            addCriterion("Bro_id between", value1, value2, "broId");
            return (Criteria) this;
        }

        public Criteria andBroIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Bro_id not between", value1, value2, "broId");
            return (Criteria) this;
        }

        public Criteria andSaleGuidIsNull() {
            addCriterion("Sale_guid is null");
            return (Criteria) this;
        }

        public Criteria andSaleGuidIsNotNull() {
            addCriterion("Sale_guid is not null");
            return (Criteria) this;
        }

        public Criteria andSaleGuidEqualTo(String value) {
            addCriterion("Sale_guid =", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidNotEqualTo(String value) {
            addCriterion("Sale_guid <>", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidGreaterThan(String value) {
            addCriterion("Sale_guid >", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidGreaterThanOrEqualTo(String value) {
            addCriterion("Sale_guid >=", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidLessThan(String value) {
            addCriterion("Sale_guid <", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidLessThanOrEqualTo(String value) {
            addCriterion("Sale_guid <=", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidLike(String value) {
            addCriterion("Sale_guid like", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidNotLike(String value) {
            addCriterion("Sale_guid not like", value, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidIn(List<String> values) {
            addCriterion("Sale_guid in", values, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidNotIn(List<String> values) {
            addCriterion("Sale_guid not in", values, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidBetween(String value1, String value2) {
            addCriterion("Sale_guid between", value1, value2, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andSaleGuidNotBetween(String value1, String value2) {
            addCriterion("Sale_guid not between", value1, value2, "saleGuid");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeIsNull() {
            addCriterion("Bro_datetime is null");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeIsNotNull() {
            addCriterion("Bro_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeEqualTo(Date value) {
            addCriterion("Bro_datetime =", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeNotEqualTo(Date value) {
            addCriterion("Bro_datetime <>", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeGreaterThan(Date value) {
            addCriterion("Bro_datetime >", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Bro_datetime >=", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeLessThan(Date value) {
            addCriterion("Bro_datetime <", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Bro_datetime <=", value, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeIn(List<Date> values) {
            addCriterion("Bro_datetime in", values, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeNotIn(List<Date> values) {
            addCriterion("Bro_datetime not in", values, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeBetween(Date value1, Date value2) {
            addCriterion("Bro_datetime between", value1, value2, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Bro_datetime not between", value1, value2, "broDatetime");
            return (Criteria) this;
        }

        public Criteria andBroCodeIsNull() {
            addCriterion("Bro_code is null");
            return (Criteria) this;
        }

        public Criteria andBroCodeIsNotNull() {
            addCriterion("Bro_code is not null");
            return (Criteria) this;
        }

        public Criteria andBroCodeEqualTo(String value) {
            addCriterion("Bro_code =", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeNotEqualTo(String value) {
            addCriterion("Bro_code <>", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeGreaterThan(String value) {
            addCriterion("Bro_code >", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Bro_code >=", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeLessThan(String value) {
            addCriterion("Bro_code <", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeLessThanOrEqualTo(String value) {
            addCriterion("Bro_code <=", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeLike(String value) {
            addCriterion("Bro_code like", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeNotLike(String value) {
            addCriterion("Bro_code not like", value, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeIn(List<String> values) {
            addCriterion("Bro_code in", values, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeNotIn(List<String> values) {
            addCriterion("Bro_code not in", values, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeBetween(String value1, String value2) {
            addCriterion("Bro_code between", value1, value2, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroCodeNotBetween(String value1, String value2) {
            addCriterion("Bro_code not between", value1, value2, "broCode");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameIsNull() {
            addCriterion("Bro_Pro_username is null");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameIsNotNull() {
            addCriterion("Bro_Pro_username is not null");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameEqualTo(String value) {
            addCriterion("Bro_Pro_username =", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameNotEqualTo(String value) {
            addCriterion("Bro_Pro_username <>", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameGreaterThan(String value) {
            addCriterion("Bro_Pro_username >", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_username >=", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameLessThan(String value) {
            addCriterion("Bro_Pro_username <", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameLessThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_username <=", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameLike(String value) {
            addCriterion("Bro_Pro_username like", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameNotLike(String value) {
            addCriterion("Bro_Pro_username not like", value, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameIn(List<String> values) {
            addCriterion("Bro_Pro_username in", values, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameNotIn(List<String> values) {
            addCriterion("Bro_Pro_username not in", values, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameBetween(String value1, String value2) {
            addCriterion("Bro_Pro_username between", value1, value2, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProUsernameNotBetween(String value1, String value2) {
            addCriterion("Bro_Pro_username not between", value1, value2, "broProUsername");
            return (Criteria) this;
        }

        public Criteria andBroProSexIsNull() {
            addCriterion("Bro_Pro_sex is null");
            return (Criteria) this;
        }

        public Criteria andBroProSexIsNotNull() {
            addCriterion("Bro_Pro_sex is not null");
            return (Criteria) this;
        }

        public Criteria andBroProSexEqualTo(String value) {
            addCriterion("Bro_Pro_sex =", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexNotEqualTo(String value) {
            addCriterion("Bro_Pro_sex <>", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexGreaterThan(String value) {
            addCriterion("Bro_Pro_sex >", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexGreaterThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_sex >=", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexLessThan(String value) {
            addCriterion("Bro_Pro_sex <", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexLessThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_sex <=", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexLike(String value) {
            addCriterion("Bro_Pro_sex like", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexNotLike(String value) {
            addCriterion("Bro_Pro_sex not like", value, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexIn(List<String> values) {
            addCriterion("Bro_Pro_sex in", values, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexNotIn(List<String> values) {
            addCriterion("Bro_Pro_sex not in", values, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexBetween(String value1, String value2) {
            addCriterion("Bro_Pro_sex between", value1, value2, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProSexNotBetween(String value1, String value2) {
            addCriterion("Bro_Pro_sex not between", value1, value2, "broProSex");
            return (Criteria) this;
        }

        public Criteria andBroProLocationIsNull() {
            addCriterion("Bro_Pro_location is null");
            return (Criteria) this;
        }

        public Criteria andBroProLocationIsNotNull() {
            addCriterion("Bro_Pro_location is not null");
            return (Criteria) this;
        }

        public Criteria andBroProLocationEqualTo(String value) {
            addCriterion("Bro_Pro_location =", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationNotEqualTo(String value) {
            addCriterion("Bro_Pro_location <>", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationGreaterThan(String value) {
            addCriterion("Bro_Pro_location >", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_location >=", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationLessThan(String value) {
            addCriterion("Bro_Pro_location <", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationLessThanOrEqualTo(String value) {
            addCriterion("Bro_Pro_location <=", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationLike(String value) {
            addCriterion("Bro_Pro_location like", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationNotLike(String value) {
            addCriterion("Bro_Pro_location not like", value, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationIn(List<String> values) {
            addCriterion("Bro_Pro_location in", values, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationNotIn(List<String> values) {
            addCriterion("Bro_Pro_location not in", values, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationBetween(String value1, String value2) {
            addCriterion("Bro_Pro_location between", value1, value2, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLocationNotBetween(String value1, String value2) {
            addCriterion("Bro_Pro_location not between", value1, value2, "broProLocation");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeIsNull() {
            addCriterion("Bro_Pro_longitude is null");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeIsNotNull() {
            addCriterion("Bro_Pro_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeEqualTo(Float value) {
            addCriterion("Bro_Pro_longitude =", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeNotEqualTo(Float value) {
            addCriterion("Bro_Pro_longitude <>", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeGreaterThan(Float value) {
            addCriterion("Bro_Pro_longitude >", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Bro_Pro_longitude >=", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeLessThan(Float value) {
            addCriterion("Bro_Pro_longitude <", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("Bro_Pro_longitude <=", value, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeIn(List<Float> values) {
            addCriterion("Bro_Pro_longitude in", values, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeNotIn(List<Float> values) {
            addCriterion("Bro_Pro_longitude not in", values, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeBetween(Float value1, Float value2) {
            addCriterion("Bro_Pro_longitude between", value1, value2, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("Bro_Pro_longitude not between", value1, value2, "broProLongitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeIsNull() {
            addCriterion("Bro_Pro_latitude is null");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeIsNotNull() {
            addCriterion("Bro_Pro_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeEqualTo(Float value) {
            addCriterion("Bro_Pro_latitude =", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeNotEqualTo(Float value) {
            addCriterion("Bro_Pro_latitude <>", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeGreaterThan(Float value) {
            addCriterion("Bro_Pro_latitude >", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Bro_Pro_latitude >=", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeLessThan(Float value) {
            addCriterion("Bro_Pro_latitude <", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("Bro_Pro_latitude <=", value, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeIn(List<Float> values) {
            addCriterion("Bro_Pro_latitude in", values, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeNotIn(List<Float> values) {
            addCriterion("Bro_Pro_latitude not in", values, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeBetween(Float value1, Float value2) {
            addCriterion("Bro_Pro_latitude between", value1, value2, "broProLatitude");
            return (Criteria) this;
        }

        public Criteria andBroProLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("Bro_Pro_latitude not between", value1, value2, "broProLatitude");
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
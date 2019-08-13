package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PromulgatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromulgatorExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("Pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("Pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("Pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("Pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("Pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("Pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("Pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("Pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("Pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("Pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("Pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("Pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("Pro_id not between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProDatetimeIsNull() {
            addCriterion("Pro_datetime is null");
            return (Criteria) this;
        }

        public Criteria andProDatetimeIsNotNull() {
            addCriterion("Pro_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andProDatetimeEqualTo(Date value) {
            addCriterion("Pro_datetime =", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeNotEqualTo(Date value) {
            addCriterion("Pro_datetime <>", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeGreaterThan(Date value) {
            addCriterion("Pro_datetime >", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Pro_datetime >=", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeLessThan(Date value) {
            addCriterion("Pro_datetime <", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Pro_datetime <=", value, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeIn(List<Date> values) {
            addCriterion("Pro_datetime in", values, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeNotIn(List<Date> values) {
            addCriterion("Pro_datetime not in", values, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeBetween(Date value1, Date value2) {
            addCriterion("Pro_datetime between", value1, value2, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Pro_datetime not between", value1, value2, "proDatetime");
            return (Criteria) this;
        }

        public Criteria andProUsernameIsNull() {
            addCriterion("Pro_username is null");
            return (Criteria) this;
        }

        public Criteria andProUsernameIsNotNull() {
            addCriterion("Pro_username is not null");
            return (Criteria) this;
        }

        public Criteria andProUsernameEqualTo(String value) {
            addCriterion("Pro_username =", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameNotEqualTo(String value) {
            addCriterion("Pro_username <>", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameGreaterThan(String value) {
            addCriterion("Pro_username >", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_username >=", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameLessThan(String value) {
            addCriterion("Pro_username <", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameLessThanOrEqualTo(String value) {
            addCriterion("Pro_username <=", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameLike(String value) {
            addCriterion("Pro_username like", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameNotLike(String value) {
            addCriterion("Pro_username not like", value, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameIn(List<String> values) {
            addCriterion("Pro_username in", values, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameNotIn(List<String> values) {
            addCriterion("Pro_username not in", values, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameBetween(String value1, String value2) {
            addCriterion("Pro_username between", value1, value2, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProUsernameNotBetween(String value1, String value2) {
            addCriterion("Pro_username not between", value1, value2, "proUsername");
            return (Criteria) this;
        }

        public Criteria andProSexIsNull() {
            addCriterion("Pro_sex is null");
            return (Criteria) this;
        }

        public Criteria andProSexIsNotNull() {
            addCriterion("Pro_sex is not null");
            return (Criteria) this;
        }

        public Criteria andProSexEqualTo(String value) {
            addCriterion("Pro_sex =", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexNotEqualTo(String value) {
            addCriterion("Pro_sex <>", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexGreaterThan(String value) {
            addCriterion("Pro_sex >", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_sex >=", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexLessThan(String value) {
            addCriterion("Pro_sex <", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexLessThanOrEqualTo(String value) {
            addCriterion("Pro_sex <=", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexLike(String value) {
            addCriterion("Pro_sex like", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexNotLike(String value) {
            addCriterion("Pro_sex not like", value, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexIn(List<String> values) {
            addCriterion("Pro_sex in", values, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexNotIn(List<String> values) {
            addCriterion("Pro_sex not in", values, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexBetween(String value1, String value2) {
            addCriterion("Pro_sex between", value1, value2, "proSex");
            return (Criteria) this;
        }

        public Criteria andProSexNotBetween(String value1, String value2) {
            addCriterion("Pro_sex not between", value1, value2, "proSex");
            return (Criteria) this;
        }

        public Criteria andProLocationIsNull() {
            addCriterion("Pro_location is null");
            return (Criteria) this;
        }

        public Criteria andProLocationIsNotNull() {
            addCriterion("Pro_location is not null");
            return (Criteria) this;
        }

        public Criteria andProLocationEqualTo(String value) {
            addCriterion("Pro_location =", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationNotEqualTo(String value) {
            addCriterion("Pro_location <>", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationGreaterThan(String value) {
            addCriterion("Pro_location >", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Pro_location >=", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationLessThan(String value) {
            addCriterion("Pro_location <", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationLessThanOrEqualTo(String value) {
            addCriterion("Pro_location <=", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationLike(String value) {
            addCriterion("Pro_location like", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationNotLike(String value) {
            addCriterion("Pro_location not like", value, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationIn(List<String> values) {
            addCriterion("Pro_location in", values, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationNotIn(List<String> values) {
            addCriterion("Pro_location not in", values, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationBetween(String value1, String value2) {
            addCriterion("Pro_location between", value1, value2, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLocationNotBetween(String value1, String value2) {
            addCriterion("Pro_location not between", value1, value2, "proLocation");
            return (Criteria) this;
        }

        public Criteria andProLongitudeIsNull() {
            addCriterion("Pro_longitude is null");
            return (Criteria) this;
        }

        public Criteria andProLongitudeIsNotNull() {
            addCriterion("Pro_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andProLongitudeEqualTo(Float value) {
            addCriterion("Pro_longitude =", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeNotEqualTo(Float value) {
            addCriterion("Pro_longitude <>", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeGreaterThan(Float value) {
            addCriterion("Pro_longitude >", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Pro_longitude >=", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeLessThan(Float value) {
            addCriterion("Pro_longitude <", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("Pro_longitude <=", value, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeIn(List<Float> values) {
            addCriterion("Pro_longitude in", values, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeNotIn(List<Float> values) {
            addCriterion("Pro_longitude not in", values, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeBetween(Float value1, Float value2) {
            addCriterion("Pro_longitude between", value1, value2, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("Pro_longitude not between", value1, value2, "proLongitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeIsNull() {
            addCriterion("Pro_latitude is null");
            return (Criteria) this;
        }

        public Criteria andProLatitudeIsNotNull() {
            addCriterion("Pro_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andProLatitudeEqualTo(Float value) {
            addCriterion("Pro_latitude =", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeNotEqualTo(Float value) {
            addCriterion("Pro_latitude <>", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeGreaterThan(Float value) {
            addCriterion("Pro_latitude >", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Pro_latitude >=", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeLessThan(Float value) {
            addCriterion("Pro_latitude <", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("Pro_latitude <=", value, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeIn(List<Float> values) {
            addCriterion("Pro_latitude in", values, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeNotIn(List<Float> values) {
            addCriterion("Pro_latitude not in", values, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeBetween(Float value1, Float value2) {
            addCriterion("Pro_latitude between", value1, value2, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("Pro_latitude not between", value1, value2, "proLatitude");
            return (Criteria) this;
        }

        public Criteria andProLikeCountIsNull() {
            addCriterion("Pro_like_count is null");
            return (Criteria) this;
        }

        public Criteria andProLikeCountIsNotNull() {
            addCriterion("Pro_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andProLikeCountEqualTo(Integer value) {
            addCriterion("Pro_like_count =", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountNotEqualTo(Integer value) {
            addCriterion("Pro_like_count <>", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountGreaterThan(Integer value) {
            addCriterion("Pro_like_count >", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pro_like_count >=", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountLessThan(Integer value) {
            addCriterion("Pro_like_count <", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("Pro_like_count <=", value, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountIn(List<Integer> values) {
            addCriterion("Pro_like_count in", values, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountNotIn(List<Integer> values) {
            addCriterion("Pro_like_count not in", values, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("Pro_like_count between", value1, value2, "proLikeCount");
            return (Criteria) this;
        }

        public Criteria andProLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Pro_like_count not between", value1, value2, "proLikeCount");
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
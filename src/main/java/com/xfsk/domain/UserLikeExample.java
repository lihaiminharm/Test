package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLikeExample() {
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

        public Criteria andLikeUuidIsNull() {
            addCriterion("Like_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLikeUuidIsNotNull() {
            addCriterion("Like_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLikeUuidEqualTo(Integer value) {
            addCriterion("Like_uuid =", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidNotEqualTo(Integer value) {
            addCriterion("Like_uuid <>", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidGreaterThan(Integer value) {
            addCriterion("Like_uuid >", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Like_uuid >=", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidLessThan(Integer value) {
            addCriterion("Like_uuid <", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidLessThanOrEqualTo(Integer value) {
            addCriterion("Like_uuid <=", value, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidIn(List<Integer> values) {
            addCriterion("Like_uuid in", values, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidNotIn(List<Integer> values) {
            addCriterion("Like_uuid not in", values, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidBetween(Integer value1, Integer value2) {
            addCriterion("Like_uuid between", value1, value2, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("Like_uuid not between", value1, value2, "likeUuid");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNull() {
            addCriterion("Like_id is null");
            return (Criteria) this;
        }

        public Criteria andLikeIdIsNotNull() {
            addCriterion("Like_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikeIdEqualTo(String value) {
            addCriterion("Like_id =", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotEqualTo(String value) {
            addCriterion("Like_id <>", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThan(String value) {
            addCriterion("Like_id >", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdGreaterThanOrEqualTo(String value) {
            addCriterion("Like_id >=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThan(String value) {
            addCriterion("Like_id <", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLessThanOrEqualTo(String value) {
            addCriterion("Like_id <=", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdLike(String value) {
            addCriterion("Like_id like", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotLike(String value) {
            addCriterion("Like_id not like", value, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdIn(List<String> values) {
            addCriterion("Like_id in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotIn(List<String> values) {
            addCriterion("Like_id not in", values, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdBetween(String value1, String value2) {
            addCriterion("Like_id between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeIdNotBetween(String value1, String value2) {
            addCriterion("Like_id not between", value1, value2, "likeId");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeIsNull() {
            addCriterion("Like_datetime is null");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeIsNotNull() {
            addCriterion("Like_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeEqualTo(Date value) {
            addCriterion("Like_datetime =", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeNotEqualTo(Date value) {
            addCriterion("Like_datetime <>", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeGreaterThan(Date value) {
            addCriterion("Like_datetime >", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Like_datetime >=", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeLessThan(Date value) {
            addCriterion("Like_datetime <", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Like_datetime <=", value, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeIn(List<Date> values) {
            addCriterion("Like_datetime in", values, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeNotIn(List<Date> values) {
            addCriterion("Like_datetime not in", values, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeBetween(Date value1, Date value2) {
            addCriterion("Like_datetime between", value1, value2, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andLikeDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Like_datetime not between", value1, value2, "likeDatetime");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNull() {
            addCriterion("Vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNotNull() {
            addCriterion("Vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidIdEqualTo(Integer value) {
            addCriterion("Vid_id =", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotEqualTo(Integer value) {
            addCriterion("Vid_id <>", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThan(Integer value) {
            addCriterion("Vid_id >", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Vid_id >=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThan(Integer value) {
            addCriterion("Vid_id <", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThanOrEqualTo(Integer value) {
            addCriterion("Vid_id <=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdIn(List<Integer> values) {
            addCriterion("Vid_id in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotIn(List<Integer> values) {
            addCriterion("Vid_id not in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdBetween(Integer value1, Integer value2) {
            addCriterion("Vid_id between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Vid_id not between", value1, value2, "vidId");
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
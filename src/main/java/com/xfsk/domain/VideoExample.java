package com.xfsk.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVidVideoIsNull() {
            addCriterion("Vid_video is null");
            return (Criteria) this;
        }

        public Criteria andVidVideoIsNotNull() {
            addCriterion("Vid_video is not null");
            return (Criteria) this;
        }

        public Criteria andVidVideoEqualTo(String value) {
            addCriterion("Vid_video =", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoNotEqualTo(String value) {
            addCriterion("Vid_video <>", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoGreaterThan(String value) {
            addCriterion("Vid_video >", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoGreaterThanOrEqualTo(String value) {
            addCriterion("Vid_video >=", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoLessThan(String value) {
            addCriterion("Vid_video <", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoLessThanOrEqualTo(String value) {
            addCriterion("Vid_video <=", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoLike(String value) {
            addCriterion("Vid_video like", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoNotLike(String value) {
            addCriterion("Vid_video not like", value, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoIn(List<String> values) {
            addCriterion("Vid_video in", values, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoNotIn(List<String> values) {
            addCriterion("Vid_video not in", values, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoBetween(String value1, String value2) {
            addCriterion("Vid_video between", value1, value2, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andVidVideoNotBetween(String value1, String value2) {
            addCriterion("Vid_video not between", value1, value2, "vidVideo");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("Type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("Type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("Type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("Type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("Type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("Type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("Type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("Type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountIsNull() {
            addCriterion("Vid_like_count is null");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountIsNotNull() {
            addCriterion("Vid_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountEqualTo(Long value) {
            addCriterion("Vid_like_count =", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountNotEqualTo(Long value) {
            addCriterion("Vid_like_count <>", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountGreaterThan(Long value) {
            addCriterion("Vid_like_count >", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("Vid_like_count >=", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountLessThan(Long value) {
            addCriterion("Vid_like_count <", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountLessThanOrEqualTo(Long value) {
            addCriterion("Vid_like_count <=", value, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountIn(List<Long> values) {
            addCriterion("Vid_like_count in", values, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountNotIn(List<Long> values) {
            addCriterion("Vid_like_count not in", values, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountBetween(Long value1, Long value2) {
            addCriterion("Vid_like_count between", value1, value2, "vidLikeCount");
            return (Criteria) this;
        }

        public Criteria andVidLikeCountNotBetween(Long value1, Long value2) {
            addCriterion("Vid_like_count not between", value1, value2, "vidLikeCount");
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
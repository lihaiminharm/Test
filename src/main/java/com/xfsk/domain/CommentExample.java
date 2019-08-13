package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentUuidIsNull() {
            addCriterion("Comment_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCommentUuidIsNotNull() {
            addCriterion("Comment_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUuidEqualTo(Integer value) {
            addCriterion("Comment_uuid =", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidNotEqualTo(Integer value) {
            addCriterion("Comment_uuid <>", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidGreaterThan(Integer value) {
            addCriterion("Comment_uuid >", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Comment_uuid >=", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidLessThan(Integer value) {
            addCriterion("Comment_uuid <", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidLessThanOrEqualTo(Integer value) {
            addCriterion("Comment_uuid <=", value, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidIn(List<Integer> values) {
            addCriterion("Comment_uuid in", values, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidNotIn(List<Integer> values) {
            addCriterion("Comment_uuid not in", values, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidBetween(Integer value1, Integer value2) {
            addCriterion("Comment_uuid between", value1, value2, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("Comment_uuid not between", value1, value2, "commentUuid");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("Comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("Comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("Comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("Comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("Comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("Comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("Comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("Comment_id like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("Comment_id not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("Comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("Comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("Comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("Comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeIsNull() {
            addCriterion("Comment_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeIsNotNull() {
            addCriterion("Comment_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeEqualTo(Date value) {
            addCriterion("Comment_datetime =", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeNotEqualTo(Date value) {
            addCriterion("Comment_datetime <>", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeGreaterThan(Date value) {
            addCriterion("Comment_datetime >", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Comment_datetime >=", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeLessThan(Date value) {
            addCriterion("Comment_datetime <", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Comment_datetime <=", value, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeIn(List<Date> values) {
            addCriterion("Comment_datetime in", values, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeNotIn(List<Date> values) {
            addCriterion("Comment_datetime not in", values, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeBetween(Date value1, Date value2) {
            addCriterion("Comment_datetime between", value1, value2, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Comment_datetime not between", value1, value2, "commentDatetime");
            return (Criteria) this;
        }

        public Criteria andCommentContextIsNull() {
            addCriterion("Comment_context is null");
            return (Criteria) this;
        }

        public Criteria andCommentContextIsNotNull() {
            addCriterion("Comment_context is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContextEqualTo(String value) {
            addCriterion("Comment_context =", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextNotEqualTo(String value) {
            addCriterion("Comment_context <>", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextGreaterThan(String value) {
            addCriterion("Comment_context >", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_context >=", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextLessThan(String value) {
            addCriterion("Comment_context <", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextLessThanOrEqualTo(String value) {
            addCriterion("Comment_context <=", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextLike(String value) {
            addCriterion("Comment_context like", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextNotLike(String value) {
            addCriterion("Comment_context not like", value, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextIn(List<String> values) {
            addCriterion("Comment_context in", values, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextNotIn(List<String> values) {
            addCriterion("Comment_context not in", values, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextBetween(String value1, String value2) {
            addCriterion("Comment_context between", value1, value2, "commentContext");
            return (Criteria) this;
        }

        public Criteria andCommentContextNotBetween(String value1, String value2) {
            addCriterion("Comment_context not between", value1, value2, "commentContext");
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
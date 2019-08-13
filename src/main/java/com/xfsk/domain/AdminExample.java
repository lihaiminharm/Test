package com.xfsk.domain;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmIdIsNull() {
            addCriterion("Adm_id is null");
            return (Criteria) this;
        }

        public Criteria andAdmIdIsNotNull() {
            addCriterion("Adm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmIdEqualTo(Integer value) {
            addCriterion("Adm_id =", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotEqualTo(Integer value) {
            addCriterion("Adm_id <>", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThan(Integer value) {
            addCriterion("Adm_id >", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Adm_id >=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThan(Integer value) {
            addCriterion("Adm_id <", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdLessThanOrEqualTo(Integer value) {
            addCriterion("Adm_id <=", value, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdIn(List<Integer> values) {
            addCriterion("Adm_id in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotIn(List<Integer> values) {
            addCriterion("Adm_id not in", values, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdBetween(Integer value1, Integer value2) {
            addCriterion("Adm_id between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Adm_id not between", value1, value2, "admId");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIsNull() {
            addCriterion("Adm_username is null");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIsNotNull() {
            addCriterion("Adm_username is not null");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameEqualTo(String value) {
            addCriterion("Adm_username =", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotEqualTo(String value) {
            addCriterion("Adm_username <>", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameGreaterThan(String value) {
            addCriterion("Adm_username >", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Adm_username >=", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLessThan(String value) {
            addCriterion("Adm_username <", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLessThanOrEqualTo(String value) {
            addCriterion("Adm_username <=", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLike(String value) {
            addCriterion("Adm_username like", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotLike(String value) {
            addCriterion("Adm_username not like", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIn(List<String> values) {
            addCriterion("Adm_username in", values, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotIn(List<String> values) {
            addCriterion("Adm_username not in", values, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameBetween(String value1, String value2) {
            addCriterion("Adm_username between", value1, value2, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotBetween(String value1, String value2) {
            addCriterion("Adm_username not between", value1, value2, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIsNull() {
            addCriterion("Adm_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIsNotNull() {
            addCriterion("Adm_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordEqualTo(String value) {
            addCriterion("Adm_password =", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotEqualTo(String value) {
            addCriterion("Adm_password <>", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThan(String value) {
            addCriterion("Adm_password >", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Adm_password >=", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThan(String value) {
            addCriterion("Adm_password <", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThanOrEqualTo(String value) {
            addCriterion("Adm_password <=", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLike(String value) {
            addCriterion("Adm_password like", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotLike(String value) {
            addCriterion("Adm_password not like", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIn(List<String> values) {
            addCriterion("Adm_password in", values, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotIn(List<String> values) {
            addCriterion("Adm_password not in", values, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordBetween(String value1, String value2) {
            addCriterion("Adm_password between", value1, value2, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotBetween(String value1, String value2) {
            addCriterion("Adm_password not between", value1, value2, "admPassword");
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
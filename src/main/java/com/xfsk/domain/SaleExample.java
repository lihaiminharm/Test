package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSaleAddressIsNull() {
            addCriterion("Sale_address is null");
            return (Criteria) this;
        }

        public Criteria andSaleAddressIsNotNull() {
            addCriterion("Sale_address is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAddressEqualTo(String value) {
            addCriterion("Sale_address =", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressNotEqualTo(String value) {
            addCriterion("Sale_address <>", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressGreaterThan(String value) {
            addCriterion("Sale_address >", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Sale_address >=", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressLessThan(String value) {
            addCriterion("Sale_address <", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressLessThanOrEqualTo(String value) {
            addCriterion("Sale_address <=", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressLike(String value) {
            addCriterion("Sale_address like", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressNotLike(String value) {
            addCriterion("Sale_address not like", value, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressIn(List<String> values) {
            addCriterion("Sale_address in", values, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressNotIn(List<String> values) {
            addCriterion("Sale_address not in", values, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressBetween(String value1, String value2) {
            addCriterion("Sale_address between", value1, value2, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleAddressNotBetween(String value1, String value2) {
            addCriterion("Sale_address not between", value1, value2, "saleAddress");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNull() {
            addCriterion("Sale_name is null");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNotNull() {
            addCriterion("Sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNameEqualTo(String value) {
            addCriterion("Sale_name =", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotEqualTo(String value) {
            addCriterion("Sale_name <>", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThan(String value) {
            addCriterion("Sale_name >", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("Sale_name >=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThan(String value) {
            addCriterion("Sale_name <", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThanOrEqualTo(String value) {
            addCriterion("Sale_name <=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLike(String value) {
            addCriterion("Sale_name like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotLike(String value) {
            addCriterion("Sale_name not like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameIn(List<String> values) {
            addCriterion("Sale_name in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotIn(List<String> values) {
            addCriterion("Sale_name not in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameBetween(String value1, String value2) {
            addCriterion("Sale_name between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotBetween(String value1, String value2) {
            addCriterion("Sale_name not between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeIsNull() {
            addCriterion("Sale_datetime is null");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeIsNotNull() {
            addCriterion("Sale_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeEqualTo(Date value) {
            addCriterion("Sale_datetime =", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeNotEqualTo(Date value) {
            addCriterion("Sale_datetime <>", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeGreaterThan(Date value) {
            addCriterion("Sale_datetime >", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Sale_datetime >=", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeLessThan(Date value) {
            addCriterion("Sale_datetime <", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Sale_datetime <=", value, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeIn(List<Date> values) {
            addCriterion("Sale_datetime in", values, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeNotIn(List<Date> values) {
            addCriterion("Sale_datetime not in", values, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeBetween(Date value1, Date value2) {
            addCriterion("Sale_datetime between", value1, value2, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Sale_datetime not between", value1, value2, "saleDatetime");
            return (Criteria) this;
        }

        public Criteria andSaleTelIsNull() {
            addCriterion("Sale_tel is null");
            return (Criteria) this;
        }

        public Criteria andSaleTelIsNotNull() {
            addCriterion("Sale_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTelEqualTo(Integer value) {
            addCriterion("Sale_tel =", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotEqualTo(Integer value) {
            addCriterion("Sale_tel <>", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelGreaterThan(Integer value) {
            addCriterion("Sale_tel >", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale_tel >=", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelLessThan(Integer value) {
            addCriterion("Sale_tel <", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelLessThanOrEqualTo(Integer value) {
            addCriterion("Sale_tel <=", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelIn(List<Integer> values) {
            addCriterion("Sale_tel in", values, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotIn(List<Integer> values) {
            addCriterion("Sale_tel not in", values, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelBetween(Integer value1, Integer value2) {
            addCriterion("Sale_tel between", value1, value2, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale_tel not between", value1, value2, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistIsNull() {
            addCriterion("Sale_isexist is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistIsNotNull() {
            addCriterion("Sale_isexist is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistEqualTo(Integer value) {
            addCriterion("Sale_isexist =", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistNotEqualTo(Integer value) {
            addCriterion("Sale_isexist <>", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistGreaterThan(Integer value) {
            addCriterion("Sale_isexist >", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale_isexist >=", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistLessThan(Integer value) {
            addCriterion("Sale_isexist <", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistLessThanOrEqualTo(Integer value) {
            addCriterion("Sale_isexist <=", value, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistIn(List<Integer> values) {
            addCriterion("Sale_isexist in", values, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistNotIn(List<Integer> values) {
            addCriterion("Sale_isexist not in", values, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistBetween(Integer value1, Integer value2) {
            addCriterion("Sale_isexist between", value1, value2, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsexistNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale_isexist not between", value1, value2, "saleIsexist");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseIsNull() {
            addCriterion("Sale_isuse is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseIsNotNull() {
            addCriterion("Sale_isuse is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseEqualTo(Integer value) {
            addCriterion("Sale_isuse =", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseNotEqualTo(Integer value) {
            addCriterion("Sale_isuse <>", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseGreaterThan(Integer value) {
            addCriterion("Sale_isuse >", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale_isuse >=", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseLessThan(Integer value) {
            addCriterion("Sale_isuse <", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseLessThanOrEqualTo(Integer value) {
            addCriterion("Sale_isuse <=", value, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseIn(List<Integer> values) {
            addCriterion("Sale_isuse in", values, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseNotIn(List<Integer> values) {
            addCriterion("Sale_isuse not in", values, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseBetween(Integer value1, Integer value2) {
            addCriterion("Sale_isuse between", value1, value2, "saleIsuse");
            return (Criteria) this;
        }

        public Criteria andSaleIsuseNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale_isuse not between", value1, value2, "saleIsuse");
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
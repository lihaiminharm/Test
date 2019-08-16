package com.xfsk.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andMsgIdIsNull() {
            addCriterion("Msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMsgIdIsNotNull() {
            addCriterion("Msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsgIdEqualTo(String value) {
            addCriterion("Msg_id =", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotEqualTo(String value) {
            addCriterion("Msg_id <>", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThan(String value) {
            addCriterion("Msg_id >", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("Msg_id >=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThan(String value) {
            addCriterion("Msg_id <", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLessThanOrEqualTo(String value) {
            addCriterion("Msg_id <=", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdLike(String value) {
            addCriterion("Msg_id like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotLike(String value) {
            addCriterion("Msg_id not like", value, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdIn(List<String> values) {
            addCriterion("Msg_id in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotIn(List<String> values) {
            addCriterion("Msg_id not in", values, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdBetween(String value1, String value2) {
            addCriterion("Msg_id between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgIdNotBetween(String value1, String value2) {
            addCriterion("Msg_id not between", value1, value2, "msgId");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordIsNull() {
            addCriterion("Msg_password is null");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordIsNotNull() {
            addCriterion("Msg_password is not null");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordEqualTo(String value) {
            addCriterion("Msg_password =", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordNotEqualTo(String value) {
            addCriterion("Msg_password <>", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordGreaterThan(String value) {
            addCriterion("Msg_password >", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Msg_password >=", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordLessThan(String value) {
            addCriterion("Msg_password <", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordLessThanOrEqualTo(String value) {
            addCriterion("Msg_password <=", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordLike(String value) {
            addCriterion("Msg_password like", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordNotLike(String value) {
            addCriterion("Msg_password not like", value, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordIn(List<String> values) {
            addCriterion("Msg_password in", values, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordNotIn(List<String> values) {
            addCriterion("Msg_password not in", values, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordBetween(String value1, String value2) {
            addCriterion("Msg_password between", value1, value2, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgPasswordNotBetween(String value1, String value2) {
            addCriterion("Msg_password not between", value1, value2, "msgPassword");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNull() {
            addCriterion("Msg_title is null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIsNotNull() {
            addCriterion("Msg_title is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTitleEqualTo(String value) {
            addCriterion("Msg_title =", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotEqualTo(String value) {
            addCriterion("Msg_title <>", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThan(String value) {
            addCriterion("Msg_title >", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Msg_title >=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThan(String value) {
            addCriterion("Msg_title <", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLessThanOrEqualTo(String value) {
            addCriterion("Msg_title <=", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleLike(String value) {
            addCriterion("Msg_title like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotLike(String value) {
            addCriterion("Msg_title not like", value, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleIn(List<String> values) {
            addCriterion("Msg_title in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotIn(List<String> values) {
            addCriterion("Msg_title not in", values, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleBetween(String value1, String value2) {
            addCriterion("Msg_title between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgTitleNotBetween(String value1, String value2) {
            addCriterion("Msg_title not between", value1, value2, "msgTitle");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgIsNull() {
            addCriterion("Msg_leavemsg is null");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgIsNotNull() {
            addCriterion("Msg_leavemsg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgEqualTo(String value) {
            addCriterion("Msg_leavemsg =", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgNotEqualTo(String value) {
            addCriterion("Msg_leavemsg <>", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgGreaterThan(String value) {
            addCriterion("Msg_leavemsg >", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgGreaterThanOrEqualTo(String value) {
            addCriterion("Msg_leavemsg >=", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgLessThan(String value) {
            addCriterion("Msg_leavemsg <", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgLessThanOrEqualTo(String value) {
            addCriterion("Msg_leavemsg <=", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgLike(String value) {
            addCriterion("Msg_leavemsg like", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgNotLike(String value) {
            addCriterion("Msg_leavemsg not like", value, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgIn(List<String> values) {
            addCriterion("Msg_leavemsg in", values, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgNotIn(List<String> values) {
            addCriterion("Msg_leavemsg not in", values, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgBetween(String value1, String value2) {
            addCriterion("Msg_leavemsg between", value1, value2, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgLeavemsgNotBetween(String value1, String value2) {
            addCriterion("Msg_leavemsg not between", value1, value2, "msgLeavemsg");
            return (Criteria) this;
        }

        public Criteria andMsgTimesIsNull() {
            addCriterion("Msg_times is null");
            return (Criteria) this;
        }

        public Criteria andMsgTimesIsNotNull() {
            addCriterion("Msg_times is not null");
            return (Criteria) this;
        }

        public Criteria andMsgTimesEqualTo(Long value) {
            addCriterion("Msg_times =", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesNotEqualTo(Long value) {
            addCriterion("Msg_times <>", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesGreaterThan(Long value) {
            addCriterion("Msg_times >", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("Msg_times >=", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesLessThan(Long value) {
            addCriterion("Msg_times <", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesLessThanOrEqualTo(Long value) {
            addCriterion("Msg_times <=", value, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesIn(List<Long> values) {
            addCriterion("Msg_times in", values, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesNotIn(List<Long> values) {
            addCriterion("Msg_times not in", values, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesBetween(Long value1, Long value2) {
            addCriterion("Msg_times between", value1, value2, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgTimesNotBetween(Long value1, Long value2) {
            addCriterion("Msg_times not between", value1, value2, "msgTimes");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeIsNull() {
            addCriterion("Msg_datetime is null");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeIsNotNull() {
            addCriterion("Msg_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeEqualTo(Date value) {
            addCriterion("Msg_datetime =", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeNotEqualTo(Date value) {
            addCriterion("Msg_datetime <>", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeGreaterThan(Date value) {
            addCriterion("Msg_datetime >", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Msg_datetime >=", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeLessThan(Date value) {
            addCriterion("Msg_datetime <", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("Msg_datetime <=", value, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeIn(List<Date> values) {
            addCriterion("Msg_datetime in", values, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeNotIn(List<Date> values) {
            addCriterion("Msg_datetime not in", values, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeBetween(Date value1, Date value2) {
            addCriterion("Msg_datetime between", value1, value2, "msgDatetime");
            return (Criteria) this;
        }

        public Criteria andMsgDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("Msg_datetime not between", value1, value2, "msgDatetime");
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

        public Criteria andPicIdIsNull() {
            addCriterion("Pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("Pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Integer value) {
            addCriterion("Pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Integer value) {
            addCriterion("Pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Integer value) {
            addCriterion("Pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Integer value) {
            addCriterion("Pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("Pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Integer> values) {
            addCriterion("Pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Integer> values) {
            addCriterion("Pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Integer value1, Integer value2) {
            addCriterion("Pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("Video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("Video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("Video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("Video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("Video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("Video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("Video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("Video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("Video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("Video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdIsNull() {
            addCriterion("Voice_id is null");
            return (Criteria) this;
        }

        public Criteria andVoiceIdIsNotNull() {
            addCriterion("Voice_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceIdEqualTo(Integer value) {
            addCriterion("Voice_id =", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdNotEqualTo(Integer value) {
            addCriterion("Voice_id <>", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdGreaterThan(Integer value) {
            addCriterion("Voice_id >", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Voice_id >=", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdLessThan(Integer value) {
            addCriterion("Voice_id <", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("Voice_id <=", value, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdIn(List<Integer> values) {
            addCriterion("Voice_id in", values, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdNotIn(List<Integer> values) {
            addCriterion("Voice_id not in", values, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdBetween(Integer value1, Integer value2) {
            addCriterion("Voice_id between", value1, value2, "voiceId");
            return (Criteria) this;
        }

        public Criteria andVoiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Voice_id not between", value1, value2, "voiceId");
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
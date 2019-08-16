package com.xfsk.domain;

import java.util.Date;

public class Message {
    private String saleGuid;

    private String msgId;

    private String msgPassword;

    private String msgTitle;

    private String msgLeavemsg;

    private Long msgTimes;

    private Date msgDatetime;

    private String broCode;

    private Integer picId;

    private Integer videoId;

    private Integer voiceId;

    private Integer typeId;

    public String getSaleGuid() {
        return saleGuid;
    }

    public void setSaleGuid(String saleGuid) {
        this.saleGuid = saleGuid == null ? null : saleGuid.trim();
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getMsgPassword() {
        return msgPassword;
    }

    public void setMsgPassword(String msgPassword) {
        this.msgPassword = msgPassword == null ? null : msgPassword.trim();
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    public String getMsgLeavemsg() {
        return msgLeavemsg;
    }

    public void setMsgLeavemsg(String msgLeavemsg) {
        this.msgLeavemsg = msgLeavemsg == null ? null : msgLeavemsg.trim();
    }

    public Long getMsgTimes() {
        return msgTimes;
    }

    public void setMsgTimes(Long msgTimes) {
        this.msgTimes = msgTimes;
    }

    public Date getMsgDatetime() {
        return msgDatetime;
    }

    public void setMsgDatetime(Date msgDatetime) {
        this.msgDatetime = msgDatetime;
    }

    public String getBroCode() {
        return broCode;
    }

    public void setBroCode(String broCode) {
        this.broCode = broCode == null ? null : broCode.trim();
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(Integer voiceId) {
        this.voiceId = voiceId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
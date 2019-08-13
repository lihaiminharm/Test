package com.xfsk.domain;

import java.util.Date;

public class Comment {
    private Integer commentUuid;

    private String commentId;

    private Date commentDatetime;

    private String commentContext;

    private Integer vidId;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Integer getCommentUuid() {
        return commentUuid;
    }

    public void setCommentUuid(Integer commentUuid) {
        this.commentUuid = commentUuid;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public Date getCommentDatetime() {
        return commentDatetime;
    }

    public void setCommentDatetime(Date commentDatetime) {
        this.commentDatetime = commentDatetime;
    }

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext == null ? null : commentContext.trim();
    }

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }
}
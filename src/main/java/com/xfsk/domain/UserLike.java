package com.xfsk.domain;

import java.util.Date;

public class UserLike {
    private Integer likeUuid;

    private String likeId;

    private Date likeDatetime;

    private Integer vidId;

    public Integer getLikeUuid() {
        return likeUuid;
    }

    public void setLikeUuid(Integer likeUuid) {
        this.likeUuid = likeUuid;
    }

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId == null ? null : likeId.trim();
    }

    public Date getLikeDatetime() {
        return likeDatetime;
    }

    public void setLikeDatetime(Date likeDatetime) {
        this.likeDatetime = likeDatetime;
    }

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }
}
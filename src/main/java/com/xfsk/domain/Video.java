package com.xfsk.domain;

public class Video {
    private Integer vidId;

    private String vidVideo;

    private Integer typeId;

    private Long vidLikeCount;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public String getVidVideo() {
        return vidVideo;
    }

    public void setVidVideo(String vidVideo) {
        this.vidVideo = vidVideo == null ? null : vidVideo.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Long getVidLikeCount() {
        return vidLikeCount;
    }

    public void setVidLikeCount(Long vidLikeCount) {
        this.vidLikeCount = vidLikeCount;
    }
}
package com.xfsk.domain;

public class Voice {
    private Integer voiceId;

    private String voiceVoice;

    private Integer typeId;

    public Integer getVoiceId() {
        return voiceId;
    }

    public void setVoiceId(Integer voiceId) {
        this.voiceId = voiceId;
    }

    public String getVoiceVoice() {
        return voiceVoice;
    }

    public void setVoiceVoice(String voiceVoice) {
        this.voiceVoice = voiceVoice == null ? null : voiceVoice.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
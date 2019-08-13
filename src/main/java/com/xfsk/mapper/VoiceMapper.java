package com.xfsk.mapper;

import com.xfsk.domain.Voice;
import com.xfsk.domain.VoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoiceMapper {
    int countByExample(VoiceExample example);

    int deleteByExample(VoiceExample example);

    int deleteByPrimaryKey(Integer voiceId);

    int insert(Voice record);

    int insertSelective(Voice record);

    List<Voice> selectByExample(VoiceExample example);

    Voice selectByPrimaryKey(Integer voiceId);

    int updateByExampleSelective(@Param("record") Voice record, @Param("example") VoiceExample example);

    int updateByExample(@Param("record") Voice record, @Param("example") VoiceExample example);

    int updateByPrimaryKeySelective(Voice record);

    int updateByPrimaryKey(Voice record);

}
package com.xfsk.mapper;

import com.xfsk.domain.UserLike;
import com.xfsk.domain.UserLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLikeMapper {
    int countByExample(UserLikeExample example);

    int deleteByExample(UserLikeExample example);


    int deleteByKey(Integer likeUuid);

    int deleteByPrimaryKey(String likeId);

    int insert(UserLike record);

    int insertSelective(UserLike record);

    List<UserLike> selectByExample(UserLikeExample example);

    UserLike selectByPrimaryKey(String likeId);

    UserLike selectByKey(Integer likeUuid);

    int updateByExampleSelective(@Param("record") UserLike record, @Param("example") UserLikeExample example);

    int updateByExample(@Param("record") UserLike record, @Param("example") UserLikeExample example);

    int updateByPrimaryKeySelective(UserLike record);

    int updateByPrimaryKey(UserLike record);
    //根据视频id对数据进行删除
    int deleteByVideoId(@Param("likeId")String likeId,@Param("vidId")Integer VidId);
    Integer selectTF(@Param("likeId") String likeId,@Param("vidId") Integer vidId);
    List<UserLike> getUserLikeInfo(@Param("likeId")String likeId,@Param("vidId")Integer vidId);
}
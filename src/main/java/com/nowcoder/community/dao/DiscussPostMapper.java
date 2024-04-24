package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    // 分页查询:用户id，每一页起始行的行号，每一页最多显示多少条数据
    // 动态sql，userId是0的时候，查询所有，userId有值的时候，查出来的是这位用户的所有帖子
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit, int orderMode);

    // 查询表里一共有多少条数据
    // @Param是为了给参数起一个别名
    // 需要动态拼接条件，如果这个参数（条件）只有一个，并且在<if>里使用，那这个参数必须起别名
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);

    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);
}

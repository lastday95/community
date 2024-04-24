package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) // 以CommunityApplication为配置类
public class DiscussTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testInsertDiscuss() {
        DiscussPost discussPost = new DiscussPost();
        discussPost.setUserId(111);
        discussPost.setContent("hahaha");
        discussPost.setTitle("test");
        discussPost.setCreateTime(new Date());
        int i = discussPostMapper.insertDiscussPost(discussPost);
        System.out.println(i);
	// 1
    }
}

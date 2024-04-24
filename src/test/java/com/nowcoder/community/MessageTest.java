package com.nowcoder.community;

import com.nowcoder.community.dao.MessageMapper;
import com.nowcoder.community.entity.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) // 以CommunityApplication为配置类
public class MessageTest {

    @Autowired
    private MessageMapper messageMapper;

    @Test
    public void testMessage() {
        List<Message> list = messageMapper.selectConversations(111, 0, 20);
        for (Message message : list) {
            System.out.println(message);
        }

        int cnt1 = messageMapper.selectConversationCount(111);
        System.out.println(cnt1);

        list = messageMapper.selectLetters("111_112", 0, 10);
        for (Message message : list) {
            System.out.println(message);
        }
        int cnt2 = messageMapper.selectLetterCount("111_112");
        System.out.println(cnt2);

        int count = messageMapper.selectLetterUnreadCount(131, "111_131");
        System.out.println(count);
    }

}

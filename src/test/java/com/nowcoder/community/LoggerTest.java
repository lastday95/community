package com.nowcoder.community;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) // 以CommunityApplication为配置类
public class LoggerTest {

    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger() {
        System.out.println(logger.getName());
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
    }

}

package com.nowcoder.community.util;

public interface CommunityConstant {
    /**
     * 激活成功
     *
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;

    /**
     * 默认状态的登录凭证超时时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;  // 0.5 day

    /**
     * 勾上了“记住我”
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;  // 100 day

    /**
     * 实体类型
     */
    int ENTITY_TYPE_POST = 1;  // 评论帖子
    int ENTITY_TYPE_COMMENT = 2;  // 评论评论
    int ENTITY_TYPE_USER = 3;  // 评论评论

    /**
     * kafka主题
     */
    String TOPIC_COMMENT = "comment";
    String TOPIC_LIKE = "like";
    String TOPIC_FOLLOW = "follow";
    // 发帖
    String TOPIC_PUBLISH = "publish";
    // 删帖
    String TOPIC_DELETE = "delete";

    /**
     * 系统用户id
     */
    int SYSTEM_USER_ID = 1;

    /**
     * 权限：普通用户
     */
    String AUTHORITY_USER = "user";

    /**
     * 权限：管理员
     */
    String AUTHORITY_ADMIN = "admin";

    /**
     * 权限：版主
     */
    String AUTHORITY_MODERATOR = "moderator";
}

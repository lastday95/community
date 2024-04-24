package com.nowcoder.community.util;

public class RedisKeyUtil {

    private static final String SPLIT = ":";
    // 点赞
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";
    // 关注
    private static final String PREFIX_FOLLOWEE = "followee";
    private static final String PREFIX_FOLLOWER = "follower";
    // 验证码
    private static final String PREFIX_KAPTCHA = "kaptcha";
    private static final String PREFIX_TICKET = "ticket";
    // 用户缓存
    private static final String PREFIX_USER = "user";
    // 统计
    private static final String PREFIX_UV = "uv";
    private static final String PREFIX_DAU = "dau";
    // 热帖排行
    private static final String PREFIX_POST = "post";

    // 某个实体的赞
    // "like:entity:entityType:entityId" -> set(userId)
    // 谁给点赞l，就把谁的userId存到set中
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

    // 某个用户的赞
    // "like:user:userId" ->int
    public static String getUserLikeKey(int userId) {
        return PREFIX_USER_LIKE + SPLIT + userId;
    }

    // 某个用户关注的实体
    // followee:userId:entityType -> zset(entityId, 以now date作为分数来排序)
    public static String getFolloweeKey(int userId, int entityType) {
        return PREFIX_FOLLOWEE + SPLIT + userId + SPLIT + entityType;
    }

    // 某个实体的拥有的粉丝
    // follower:entityType:entityId -> zset(userId, 以now date作为分数来排序)
    public static String getFollowerKey(int entityType, int entityId) {
        return PREFIX_FOLLOWER + SPLIT + entityType + SPLIT + entityId;
    }

    // 登录验证码
    // owner:该用户登录的一个临时凭证
    public static String getKaptchaKey(String owner) {
        return PREFIX_KAPTCHA + SPLIT + owner;
    }

    // 返回登录凭证
    public static String getTicketKey(String ticket) {
        return PREFIX_TICKET + SPLIT + ticket;
    }

    // 返回用户数据
    public static String getUserKey(int userId) {
        return PREFIX_USER + SPLIT + userId;
    }

    // 返回单日UV
    public static String getUVKey(String date) {
        return PREFIX_UV + SPLIT + date;
    }

    // 区间UV
    public static String getUVKey(String start, String end) {
        return PREFIX_UV + SPLIT + start + SPLIT + end;
    }

    // 返回单日DAU
    public static String getDAUKey(String date) {
        return PREFIX_DAU + SPLIT + date;
    }

    // 区间DAU
    public static String getDAUKey(String start, String end) {
        return PREFIX_DAU + SPLIT + start + SPLIT + end;
    }

    // 返回帖子分数
    public static String getPostScoreKey() {
        return PREFIX_POST + SPLIT + "score";
    }

}

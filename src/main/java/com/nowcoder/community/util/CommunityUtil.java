package com.nowcoder.community.util;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.handlers.GsonTypeHandler;
import com.sun.corba.se.spi.ior.ObjectKey;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CommunityUtil {

    // 生成一个随机字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    // MD5加密(只能加密，不能解密）
    // hello(初始密码) + solt(随机字符串),让密码更不容易破解
    public static String md5(String key) {
        if (StringUtils.isBlank(key)) {  // commons lang工具包
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

    // 返回JSON格式的字符串
    public static String getJSONString(int code, String msg, Map<String, Object> map) {
        JSONObject json = new JSONObject();
        json.put("code", code);
        json.put("msg", msg);
        if (map != null) {
            for (String key : map.keySet()) {
                json.put(key,map.get(key));
            }
        }
        return json.toJSONString();
    }

    public static String getJSONString(int code, String msg) {
        return getJSONString(code,msg,null);
    }

    public static String getJSONString(int code) {
        return getJSONString(code,null,null);
    }

    /**
     * 测试返回的JSON字符串数据
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xiaowang");
        map.put("age", "21");

        System.out.println(getJSONString(0, "OK", map));
    }
     **/
}

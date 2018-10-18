package com.yxz.xingyuornament.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : niithub
 * @description :
 * @date : 2018/7/18
 */
public class ConvertDataUtil {

    private ConvertDataUtil() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 组装微信发送模板中的data参数
     * @param value
     * @param color
     * @return
     */
    public static Map setMap(Object value, String color) {
        Map first = new HashMap(16);
        first.put("value", value);
        first.put("color", color);
        return first;
    }

    public static Map setMap(Object value) {
        Map first = new HashMap(16);
        first.put("value", value);
        first.put("color", "#173177");
        return first;
    }
}

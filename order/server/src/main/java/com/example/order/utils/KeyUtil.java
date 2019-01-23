package com.example.order.utils;

import java.util.Random;

/**
 * @author THY
 * @date 2018/12/3
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间戳+随机数
     * 当数量大的时候可能会产生相同的主键
     * 仅降低了重复的可能性
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}

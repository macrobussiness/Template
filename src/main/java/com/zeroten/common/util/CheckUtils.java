package com.zeroten.common.util;

public class CheckUtils {

    // String... strings 为可变参数，你可以认为它是 String[] strings。
    // 如果 strings 中有任意一个字符串为空，则返回 true，否则返回 false。
    public static boolean isAnyEmpty(String... strings) {
        if (isEmpty(strings)) {
            return true;
        }
        for (String str : strings) {
            if (str == null || str.length() == 0) {
                return true;
            }
        }
        return false;
    }

    // 判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false。
    public static boolean isEmpty(Object[] arr) {
        return arr == null || arr.length == 0;
    }

    public static boolean equals(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }

    public static boolean equals(Integer n1, Integer n2) {
        return n1 != null && n1.equals(n2);
    }

}

package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CheckUtilsTest {
//
//    public static boolean equals(Integer n1, Integer n2)
//
//    判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。


    @Test
    public void testIntEquals() {
        Assert.assertEquals(CheckUtils.equals(2, 2), true);
        Assert.assertEquals(CheckUtils.equals(null, 2), false);
        Assert.assertEquals(CheckUtils.equals(2, 3), false);
    }

    @Test
    public void testStrEquals() {
        Assert.assertEquals(CheckUtils.equals("", ""), true);
        Assert.assertEquals(CheckUtils.equals("", null), false);
        Assert.assertEquals(CheckUtils.equals("abc", "abc"), true);
        Assert.assertEquals(CheckUtils.equals("abc", "abcd"), false);
    }

    @Test
    public void testAnyStrIsEmpty() {
        Assert.assertEquals(CheckUtils.isAnyEmpty(), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty(""), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("abc", ""), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("abc", null), true);
        Assert.assertEquals(CheckUtils.isAnyEmpty("abc", "123", "eee"), false);
    }
}
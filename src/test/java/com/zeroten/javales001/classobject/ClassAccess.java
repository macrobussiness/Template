package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class ClassAccess {
    public String pub = "public公开";
    protected String pro = "protected保护";
    String def = "default默认";
    private String pri = "private私有";

    public String getPub() {
        return pub;
    }

    protected String getPro() {
        return pro;
    }


    String getDef() {
        return def;
    }

    private String getPri() {
        return pri;
    }

    @Test
    public void testInnerAcl() {
        System.out.println(pub);
        System.out.println(pro);
        System.out.println(def);
        System.out.println(pri);

        System.out.println(getPub());
        System.out.println(getPro());
        System.out.println(getDef());
        System.out.println(getPri());
    }
}

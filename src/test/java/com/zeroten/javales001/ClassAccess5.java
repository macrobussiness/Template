package com.zeroten.javales001;

import com.zeroten.javales001.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess5 {

    @Test
    public void testAcl() {
        ClassAccess ca = new ClassAccess();
        System.out.println(ca.pub);
        System.out.println(ca.getPub());

//        System.out.println(ca.pro);
//        System.out.println(ca.getPro());
//
//        System.out.println(ca.def);
//        System.out.println(ca.getDef());
//
//        System.out.println(ca.pri);
//        System.out.println(ca.getPri());
    }

}

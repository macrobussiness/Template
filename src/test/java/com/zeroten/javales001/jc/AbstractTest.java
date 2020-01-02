package com.zeroten.javales001.jc;

import org.junit.Test;

public class AbstractTest {

    @Test
    public void testPrint() {
        Person p1 = new Teacher();
        System.out.println(p1.getDescrition());

        Person p2 = new XueSheng();
        System.out.println(p2.getDescrition());

//        Person p3 = new Person();
//        System.out.println(p3.getDescrition());
    }

}

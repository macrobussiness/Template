package com.zeroten.javales001;

import com.zeroten.javales001.classobject.ClassAccess;
import org.testng.annotations.Test;

public class ClassAccess4 extends ClassAccess {

    @Test
    public void testAcl() {
        System.out.println(pub);
        System.out.println(pro);

        System.out.println(getPub());
        System.out.println(getPro());
    }
}

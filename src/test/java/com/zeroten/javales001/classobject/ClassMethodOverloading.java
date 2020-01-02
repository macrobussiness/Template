package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class ClassMethodOverloading {

    public void println() {
    }

    public void println(int numb) {
    }

    public void println(String str) {
    }

    public void println(int numb1, int numb2) {
    }

    @Test
    public void testOverloading() {
        println();
        println(1);
        println("str");
        println(1, 2);
    }
}

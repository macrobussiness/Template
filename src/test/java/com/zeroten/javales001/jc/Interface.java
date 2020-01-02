package com.zeroten.javales001.jc;

public interface Interface {
    class InnerClass {
    }

    interface InnerInterface {
    }

    int MAX_COUNT = 100;
//    public static final int MAX_COUNT = 100;

    public void method();

    default void print() {
        System.out.println("我是一个默认方法");
    }

    static void print0() {
        System.out.println("我是接口中Java8才开始可以有的静态方法");
    }
}


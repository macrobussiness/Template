package com.zeroten.javales001.classobject;

public class ClassCreateTest {
//    private String name = "这是一个成员变量";
    private static int maxCount = 10;
    private final String name;

    {
        // name = "这是一个成员变量";
        System.out.println("执行代码块1");
    }

    static {
        maxCount = 10;
        System.out.println("执行静态代码块1");
    }

    public ClassCreateTest() {
        name = "这是一个成员变量";
        System.out.println("执行代码块2");
    }

    public void println() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new ClassCreateTest().println();
    }

    {
        System.out.println("执行代码块2");
    }

    static {
        System.out.println("执行静态代码块2");
    }
}

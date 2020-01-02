package com.zeroten.javales001.classobject;

public class ClassStaticTest {
    private static final int MAX_COUNT;
    private static int count = 0;

    {
        // 代码块，也可称为初始化代码块
        System.out.println("代码块1");
    }

    static {
        // 静态代码块，也可以称为静态初始化代码块
        MAX_COUNT = 6;
        System.out.println("静态代码块1");
    }

    {
        System.out.println("代码块2");
    }

    static {
        // 静态代码块，也可以称为静态初始化代码块
        System.out.println("静态代码块2");
    }

    public ClassStaticTest() throws Exception {
        count++;
        if (count > MAX_COUNT) {
            throw new Exception("只能创建" + MAX_COUNT + "个对象");
        }
    }

    public static void printCount() {
        System.out.println("总共有" + count + "个实例");
    }

    public static void main(String[] args) throws Exception {
        new ClassStaticTest();
        ClassStaticTest obj2 = new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();
        new ClassStaticTest();

        ClassStaticTest.printCount();
        obj2.printCount();
    }
}

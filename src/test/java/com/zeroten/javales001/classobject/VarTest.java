package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class VarTest {
    // 使用 static 修饰的是类变量，所有的实例共享
    // count 用于记录创建的该类的实例的个数
    public static int count = 0;

    // 没有使用 static 修饰的是实例变量，
    // 每个实例有单独的拷贝
    // index 用于存放当前是类的第一个实例
    public int index = 0;

    public VarTest() {
    }

    public VarTest(int index) {
        this();
        this.index = index;
    }

    public VarTest(int index, int count) {
        this(index);
        this.count = count;
    }

    public void println() {
        String logStr = String.format("当前创建第%d个实例，共%d个", index, count);
        System.out.println(logStr);
    }

    public static void main(String[] args) {
        VarTest v1 = new VarTest();
        v1.index = 1;
        VarTest.count++;

        // System.out.println("当前创建第" + v1.index + "个实例，共" + VarTest.count + "个");
        v1.println();

        VarTest v2 = new VarTest();
        v2.index = 2;
        v2.count++;
        // System.out.println("当前创建第" + v2.index + "个实例，共" + VarTest.count + "个");
        v2.println();

        System.out.println("v1看到的count=" + v1.count);
        System.out.println("v2看到的count=" + v2.count);
        System.out.println("v1看到的index=" + v1.index);
        System.out.println("v2看到的index=" + v2.index);

        VarTest v3 = new VarTest(3, 3);
        v3.println();
        System.out.println("v3看到的index=" + v3.index);
        System.out.println("v3看到的count=" + v3.count);
    }
}

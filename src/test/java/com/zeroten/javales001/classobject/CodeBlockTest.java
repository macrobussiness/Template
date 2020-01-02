package com.zeroten.javales001.classobject;

public class CodeBlockTest {
    {
        numb = 2;
    }

    private int numb = 1;

    {
        System.out.println(">>>" + numb);
    }


    public static void main(String[] args) {
        new CodeBlockTest();
    }
}

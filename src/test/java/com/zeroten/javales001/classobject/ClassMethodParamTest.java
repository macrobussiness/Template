package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;

public class ClassMethodParamTest {

    private void changePrimitive(int numb) {
        System.out.println("传入：" + numb);
        numb = 20;
        System.out.println("修改后：" + numb);
    }

    private void changeReference(StringBuilder sb) {
        System.out.println("传入：" + sb.toString());
        sb.append("-追加");
        System.out.println("修改后：" + sb.toString());

        sb = new StringBuilder();
        sb.append("新字符串");
    }

    @Test
    public void testModifyMethodParam() {
        int numb = 10;
        changePrimitive(numb);
        System.out.println("numb=" + numb);

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println("sb=" + sb.toString());
    }

}

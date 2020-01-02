package com.zeroten.javales001.innerclass;

import java.util.ArrayList;
import java.util.List;

public class DoubleInit {
    public static void main(String[] args) {
        // 双括号初始化
        List<Integer> numbs = new ArrayList();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        System.out.println(numbs);

//        class ArrayListNew extends ArrayList {
//            {
//                // 初始化代码块
//                add(1);
//                add(2);
//                add(3);
//                add(4);
//                add(5);
//            }
//        }
//        List<Integer> numbs2 = new ArrayListNew();
//        numbs2.add(1);
//        numbs2.add(2);
//        numbs2.add(3);
//        numbs2.add(4);
//        numbs2.add(5);
//        System.out.println("numbs2=" + numbs2);

        List<Integer> numbs3 = new ArrayList() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        System.out.println("numbs3=" + numbs3);
    }
}

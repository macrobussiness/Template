package com.zeroten.javales001.innerclass;

import org.testng.annotations.Test;

public class ArraySequenceTest {

    @Test
    public void testPrint() {
        ArraySequence as = new ArraySequence(5);
        as.add(1);
        as.add(2);
        as.add(3);
        as.print();

        as.add(4);
        as.add(5);
        as.add(6);
        as.print();

//        ArraySequence.SelectorImpl impl = as.new SelectorImpl();

//        Selector impl = as.selector();
//        while (!impl.end()) {
//            System.out.println(">" + impl.current());
//            impl.next();
//        }
//
//        System.out.println("倒序遍历");
//        Selector impl2 = as.selectorReverse();
//        while (!impl2.end()) {
//            System.out.println(">" + impl2.current());
//            impl2.next();
//        }
//
        boolean reverse = true;
        Selector selector;
        if (reverse) {
            System.out.println("倒序");
            selector = as.selectorReverse();
        } else {
            System.out.println("正序");
            selector = as.selector();
        }
        while (!selector.end()) {
            System.out.println(">" + selector.current());
            selector.next();
        }
    }
}

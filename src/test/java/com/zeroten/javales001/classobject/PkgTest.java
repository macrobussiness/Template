package com.zeroten.javales001.classobject;

import org.testng.annotations.Test;
//import java.util.Date;
//import java.util.Arrays;
import java.util.*;
import java.util.zip.ZipFile;

public class PkgTest {

    @Test
    public void testPkg() {
//        java.util.Date date = new java.util.Date();
//        System.out.println(date.toString());
//
//        java.util.Date date2 = new java.util.Date();
//        System.out.println(date2.toString());

        Date date3 = new Date();
        System.out.println(date3.toString());

        int[] numbs1 = new int[3];
        int[] numbs2 = new int[] {1, 2, 3};
        int[] numbs3 = {1, 2, 3};
        //System.out.println(java.util.Arrays.toString(numbs3));
        System.out.println(Arrays.toString(numbs3));

        Collection c;

        // java.util.zip.ZipFile zipFile;
        ZipFile zipFile;
    }
}

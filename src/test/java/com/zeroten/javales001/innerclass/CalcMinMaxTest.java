package com.zeroten.javales001.innerclass;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CalcMinMaxTest {

    @Test
    public void testCalc() {
        int[] params = { 1, 3, 2, 9, 30, 7, 2 };
//        int[] result = CalcMinMax.calc(params);
//        System.out.println(Arrays.toString(result));
//        System.out.println("最小值：" + result[0]);
//        System.out.println("最大值：" + result[1]);

        CalcMinMax.Pair pair = CalcMinMax.calc2(params);
        System.out.println("最小值：" + pair.getMinValue());
        System.out.println("最大值：" + pair.getMaxValue());
      

        // CalcMin.calc(1, 2, 3).getMin();
    }

}

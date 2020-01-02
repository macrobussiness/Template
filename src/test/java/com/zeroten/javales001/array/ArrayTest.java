package com.zeroten.javales001.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    @Test
    public void testArrayDeclare() {
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }

    @Test
    public void testFuzhi() {
        int[] arr0 = new int[0];
        System.out.println(Arrays.toString(arr0));

        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));

        Object[] arr4 = new Object[5];
        System.out.println(Arrays.toString(arr4));

        int[] arr5;
        System.out.println();
        arr5 = new int[2];
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[]{3, 2, 3};
        System.out.println("arr6 = " + Arrays.toString(arr6));

        int[] arr7 = {3, 2, 3};
        System.out.println("arr7 = " + Arrays.toString(arr7));

        String[] arr8 = {"字符串1", null, "字符串2", ""};
        System.out.println("arr8 = " + Arrays.toString(arr8));

        Integer[] arr9 = {2, 9, 7, null, 0, 5};
        System.out.println("arr9 = " + Arrays.toString(arr9));
    }

    @Test
    public void testBianLi() {
        // 示例：分别使用上述三种方式遍历数组 Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr = {1, 2, 3, 4, 5};

        for (int index = 0; index < arr.length; index++) {
            // System.out.println("下标：" + index + ", 存放的值是：" + arr[index]);
            System.out.println(String.format("下标：%d, 存放的值是：%d", index, arr[index]));
        }

        int index = 0;
        for (int val : arr) {
            System.out.println("第" + index + "次取到" + val);
            index++;
        }

//        Arrays.asList(arr).forEach(val -> {
//            System.out.println("值是：" + val);
//            if (val % 2 == 0) {
//                System.out.println("  它是一个偶数");
//            } else {
//                System.out.println("  它是一个奇数");
//            }
//        });
    }

    @Test
    public void testCopy() {
        Integer[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        Integer[] arr2 = {6, 7, 8, 9, 10};
        // 拷贝数组 arr1 的前 3 个元素生成一个新的数组
        Integer[] arr11 = new Integer[3];
        arr11[0] = arr1[0];
        arr11[1] = arr1[1];
        arr11[2] = arr1[2];
        System.out.println("arr11 = " + Arrays.toString(arr11));

        Integer arr12[] = Arrays.copyOf(arr1, 3);
        System.out.println("arr12 = " + Arrays.toString(arr12));

        // 拷贝数组 arr1 的后 3 位的元素到一个新的数组
        Integer arr13[] = Arrays.copyOfRange(arr1, arr1.length - 3, arr1.length);
        System.out.println("arr13 = " + Arrays.toString(arr13));

        // 拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer arr14[] = Arrays.copyOfRange(arr1, 0, 2);
        System.out.println("arr14 = " + Arrays.toString(arr14));

        // 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
        System.arraycopy(arr2, arr2.length - 3, arr1, arr1.length - 3, 3);
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }

    @Test
    public void testFill() {
        // 示例：定义一个大小为 10 的 int 数组，并将数组全部初始化为指定的值 5，打印数组；
        // 然后将数组后 3 为赋值为 3，再次打印数组。
        int[] arr = new int[10];
//        for (int index = 0; index < arr.length; index++) {
//            arr[index] = 5;
//        }
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

//        for (int index = arr.length - 3; index < arr.length; index++) {
//            arr[index] = 3;
//        }

        Arrays.fill(arr, arr.length - 3, arr.length, 3);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 3, 3, 3);

    }

    @Test
    public void testSort() {
        // 示例：
        // 1.定义一个大小为 100 的 int 数组，
        // 2.随机给每一位赋值一个 0 ~ 100 之间的数值，
        // 3.然后对该数组进行排序
        // 4.并打印排序结果。
        int[] arr = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testDuoWeiShuZu() {
        // 示例：定义一个二维数组，
        // 第一维表示用户，
        // 第二维表示用户的具体信息
        // （1. 编码, 2. 姓名, 3.性别, 4.年龄）。
        // 定义赋值并打印。
        String[][] users = new String[5][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "男";
        users[0][3] = "25";

        users[1] = new String[3];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "女";
        // users[1][3] = "未知";

//        for (int index = 0; index < users.length; index++) {
//            System.out.println(Arrays.toString(users[index]));
//        }

//        for (String[] user : users) {
//            System.out.println(Arrays.toString(user));
//        }

        // Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));
    }

    public int[] twoSum(int[] nums, int target) {
        int times = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            for (int twoIndex = index + 1; twoIndex < nums.length; twoIndex++) {
                times++;
                if (nums[index] + nums[twoIndex] == target) {
                    System.out.println("循环" + times + "次");
                    return new int[]{index, twoIndex};
                }
            }
        }
        System.out.println("循环" + times + "次");
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        System.out.println("传入数组：" + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序数组：" + Arrays.toString(nums));

        int times = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] >= target) {
                System.out.println("第一个数(" + index + ")" + nums[index] + "已经大于" + target + "，返回不存在");
                System.out.println("循环" + times + "次");
                return null;
            }
            for (int twoIndex = index + 1; twoIndex < nums.length; twoIndex++) {
                times++;
                if (nums[twoIndex] > target) {
                    break;
                }
                if (nums[index] + nums[twoIndex] == target) {
                    System.out.println("循环" + times + "次");
                    return new int[]{index, twoIndex};
                }
            }
        }
        System.out.println("循环" + times + "次");
        return null;
    }

    @Test
    public void testTWoSum() {
        int[] intArray = {20, 7, 11, 15, 30, 6};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(intArray, target)));
        System.out.println("===================================");
        System.out.println(Arrays.toString(twoSum2(intArray, target)));
    }
}

package com.zeroten.javales001.innerclass;

public class CalcMinMax {
    public static int[] calc(int... numbs) {
        Integer min = null;
        Integer max = null;

        for (int numb : numbs) {
            if (min == null || min > numb) {
                min = numb;
            }
            if (max == null || max < numb) {
                max = numb;
            }
        }

        return new int[] {min, max};
    }

    public static Pair calc2(int... numbs) {
        Integer min = null;
        Integer max = null;

        for (int numb : numbs) {
            if (min == null || min > numb) {
                min = numb;
            }
            if (max == null || max < numb) {
                max = numb;
            }
        }

        return new Pair(min, max);
    }

    protected static class Pair {
        private int minValue;
        private int maxValue;

        public Pair(int minValue, int maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }
    }

}

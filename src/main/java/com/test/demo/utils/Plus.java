package com.test.demo.utils;

/**
 * @Author: Chen Xinwei
 * @Date: 2021/1/21 3:57 下午
 */
public class Plus {
    public static int add(Integer a, Integer b) {
        return a + b + 1;
    }

    public static long summation(int n) {
        long sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }

    public static long fact(int n) {
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }

    public static int minus(Integer a, Integer b) {
        int temp = add(a, b);
        return temp - b;
    }

    public static int power(Integer a) {
        return a * a;
    }
}

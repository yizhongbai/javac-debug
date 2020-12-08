package com.sun;

/**
 * @author baiyizhong
 * @Description:
 * @date 2020-12-08 13:50
 */
public class Hello<T, M> {

    /**
     * 相加
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        int m = a + b;
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Hello.main");
    }
}

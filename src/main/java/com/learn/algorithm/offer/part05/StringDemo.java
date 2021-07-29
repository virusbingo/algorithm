package com.learn.algorithm.offer.part05;

import java.util.Locale;

/**
 * TODO
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/28 5:08 下午
 **/
public class StringDemo {

    public static void main(String[] args) {
        String[] str1 = new String[]{"1", "2", "3"};
        String[] str2 = new String[]{"1", "2", "3"};
        String s1 = "123";
        String s2 = "123";
        if (str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
    }

}

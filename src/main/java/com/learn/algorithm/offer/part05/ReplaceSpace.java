package com.learn.algorithm.offer.part05;

/**
 * TODO
 *
 * @author zhaozhichao@cestc.cn
 * @date 2021/07/29 9:48 上午
 **/
public class ReplaceSpace {

    public static void main(String[] args) {
        ReplaceSpace rs = new ReplaceSpace();
        System.out.println(rs.replaceSpace("We are happy."));
    }

    public String replaceSpace(String s) {
        int sLength = s.length();
        char[] chars = new char[sLength * 3];
        int newLength = 0;
        for (int i = 0; i < sLength; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                chars[newLength++] = '%';
                chars[newLength++] = '2';
                chars[newLength++] = '0';
            } else {
                chars[newLength++] = c;
            }
        }
        return new String(chars, 0, newLength);
    }

}

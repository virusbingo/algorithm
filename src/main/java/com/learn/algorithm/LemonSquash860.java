package com.learn.algorithm;

/**
 * TODO
 *
 * @author VirusBingo
 * @date 2021/06/29 10:27 下午
 **/
public class LemonSquash860 {

    public static void main(String[] args) {
        int[] bills = new int[]{5,5,5,10,5,5,10,20,20,20};
        boolean result = lemonadeChange(bills);
        System.out.println(result);
    }

    /**
     * @return boolean
     * @author VirusBingo
     * @date 2021/06/29 23:11:19
     */
    private static boolean lemonadeChange(int[] bills) {
        // 手中5美元数量
        int five = 0;
        // 手中10美元数量
        int ten = 0;
        for(int pay : bills) {
            if (pay == 5) {
                five++;
            } else if (pay == 10) {
                if (five == 0) {
                    return Boolean.FALSE;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 3){
                    five-=3;
                } else {
                    return Boolean.FALSE;
                }
            }

        }
        return Boolean.TRUE;
    }

}

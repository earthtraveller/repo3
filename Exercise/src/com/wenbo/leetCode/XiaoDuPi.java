package com.wenbo.leetCode;

import java.text.DecimalFormat;
import java.util.*;

/**
 * 李文博
 *Tel:13183335310
 */

public class XiaoDuPi {
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        boolean oldUser = true;
        boolean newUser = false;
//        showBargain();
        System.out.println(bargain(100, 50, 0, newUser));
    }

    //userType     true is OldUser, false is newUser.
    public static double bargain(double total, double cutDown, int num, boolean userType) {//函数1
        //如果砍价超过定价的一半，砍价速度减少10倍。新用户的砍价速度是老用户的10倍。
        if (cutDown < total / 2) {
            return userType ? 5.0 : 50.0;
        } else {
            return userType ? 1.0 : 5.0;
        }
    }

    public static void showBargain() {//函数2
        double total = 100;
        for (int i = 0; i < 91; i++) {
            if (i < 10) {
                List list = getCutDownList(10, 5);
                for (Object o : list) {
                    System.out.println("oldUser " + df.format(o));
                }
            } else if (i < 90) {
                List list = getCutDownList(80, 0.55);
                for (Object o : list) {
                    System.out.println("oldUser " + df.format(o));
                }
            } else {
                List list = getCutDownList(1, total - 5 * 10 - 0.55 * 80);
                for (Object o : list) {
                    System.out.println("newUser " + df.format(o));
                }
            }
        }
    }

    private static ArrayList<Double> getCutDownList(int cutTimes, double mean) {//传入砍价次数，平均值
        ArrayList<Double> list = new ArrayList<Double>();
        Random rand = new Random();
        for (int i = 0; i < cutTimes / 2; i++) {//为了确保价格之和不变，一次生成两个数据。一个数据增加后一个随机数后，另一个数据减去这个增加的量。
            double cutMoney = Double.parseDouble(df.format(mean * (rand.nextDouble() * 2 - 1) / 10));
            list.add(mean + cutMoney);
            list.add(mean - cutMoney);
        }
        if (cutTimes % 2 == 1) list.add(mean);//如果传入的砍价次数为奇数，则再最后增加一个平均值。
        Collections.shuffle(list);
        return list;
    }
}

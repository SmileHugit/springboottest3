package com.sptringboot.springboottest2.LianXi;

public class Exist {


    static {

    }


static int a;
    public  static   int exist(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= n - 1;
            System.out.println("小修改");
            System.out.println("我的修改");
        }
        return sum;

    }
}

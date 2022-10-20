package com.sptringboot.springboottest2.LianXi;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

public class Solution {
    public int minArreay(int[] numbers){
        int reslut = 0;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int a =0 ; a < numbers.length ;a++){
            treeSet.add(numbers[a]);

        }

        return treeSet.first();

    }
}
        //  int[] ints={4,5,6,7,-3};
//        System.out.println("我是size="+treeSet.size());
//        System.out.println("我是last="+treeSet.last());
//        System.out.println("我是pollpollLast="+treeSet.pollLast());
//        System.out.println("我是pollFirst"+treeSet.pollFirst());




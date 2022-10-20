package com.sptringboot.springboottest2.LianXi;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class jisuanchongfudecishu {

    public Map<Integer, Integer>  repetition(int[] ints ){

        int start =0;
        Map<Integer,Integer>  map=new TreeMap<>();
        for (int a=0 ; a < ints.length;a++){
            if (map.containsKey(ints[a])){
               int i = map.get(ints[a]);
               i++;
               map.put(ints[a],i);
            }else {
                map.put(ints[a],start);
            }
        }
        return map;
    }
}

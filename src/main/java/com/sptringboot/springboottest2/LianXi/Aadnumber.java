package com.sptringboot.springboottest2.LianXi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.LockSupport;

//  在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class Aadnumber {
/*
* [
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]*/

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int ss = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length; b++) {
                map.put(matrix[a][b], ss);
                ss++;
                if (map.containsKey(target)) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.sptringboot.springboottest2.LianXi;


import java.util.HashMap;
import java.util.Map;
// 给个数字 计算数组里面两个数据之和等于给定数字的下标
public class Test1 {

    /*public int[] toSum(int[] nums, int target) {

        int sum = 0;
        for (int a = 0; a < nums.length - 1; a++) {
            for (int b = a+1; b < nums.length; b++) {
                sum = nums[a] + nums[b];
                if (target == sum) {
                  return new int[]{a,b};
                }
            }
            if (target == sum) {
                break;
            }
        }
      return new int[0];
    }
    */

       /* public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }*/
//根据hash表  判断里面是否包含这个键（知道target减去当前对象知道差是多少  9-3=6 判断hash表是否包含6 如果包含则根据键获得值也就是下标。）
        public  int[] toSums(int[] sum , int target){

            Map<Integer,Integer> map = new HashMap<>();
            for (int a=0 ; a < sum.length ; a++){
                if (map.containsKey(target-sum[a])){
                    return  new int[]{map.get(target-sum[a]),a};
                }else {
                    map.put(sum[a],a);
                }
            }
            return  new int[0];
        }



}

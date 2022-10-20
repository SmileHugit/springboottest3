package com.sptringboot.springboottest2;

import com.sptringboot.springboottest2.LianXi.Exist;
import com.sptringboot.springboottest2.LianXi.ReplaceSpace;
import com.sptringboot.springboottest2.LianXi.Solution;
import com.sptringboot.springboottest2.LianXi.jisuanchongfudecishu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletRegistrationBean;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SpringBootTest
class Springboottest2ApplicationTests {

    @Test
    void contextLoads() {

    /*    int[] ints ={1,2,3,4,5,6};
        Test1 test1 = new Test1();
       *//*int[]   result1 = test1.toSum(ints,9);
       for (int a : result1){
           System.out.println(a);
           if (result1 ==null){
               System.out.println("你的输入有误");
           }*//*

         int[]  reslut = test1.toSums(ints,11);
        System.out.println(reslut[0]+"="+reslut[1]);

       }*/
      /*   int[][] aa ={{1,2,3,4,6},{-9}};
        Aadnumber p = new Aadnumber();
         boolean s =   p.findNumberIn2DArray(aa,-9);
        System.out.println(s);
*/
  /*      ReplaceSpace replaceSpace = new ReplaceSpace();
         String s =  replaceSpace.replaceSpace("小胡  小李  小张");
        System.out.println(s);
*/

    }
    @Test
    public  void  Http(){
         int[]  Http ={1,2,3,4,4,4,3,-21,2,1,4,2,1,1,1,1,-21};
        jisuanchongfudecishu  t =new jisuanchongfudecishu();
         Map<Integer,Integer> treeMap=t.repetition(Http);
         int age = treeMap.size();
        System.out.println("这是长度="+age);
        treeMap.forEach((key,value)-> System.out.println(key+"="+value));
     /*   Set set = treeMap.entrySet();
        for (Object set1 : set){
            System.out.println(set1);
        }*/

      /* for (int b=age ; age >3 ; age--){
           System.out.println(treeMap.get(b));
       }
*/

    }

    @Test
    public void  target(){
        int[] ints={4,5,6,7,-3};
        Solution solution =new Solution();
       int  s =  solution.minArreay(ints);
        System.out.println(s);

    }

    @Test
    public void  sum(){
        int aim =1010101001;
        Exist exist = new Exist();
       int  reslut = exist.exist(aim);
        System.out.println(reslut);


    }
}



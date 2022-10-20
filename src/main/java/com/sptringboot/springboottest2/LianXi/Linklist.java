package com.sptringboot.springboottest2.LianXi;


import java.util.LinkedList;
import java.util.Stack;

public class Linklist {

    LinkedList<Integer>  A,B;

    public Linklist() {

        A = new LinkedList<>();
        B = new LinkedList<>();
    }
    public  void appendadd(int  value){
        A.addLast(value);
    }
    public int remove(){
        if ( !B.isEmpty()){
          return B.removeLast();
        }
        if (A.isEmpty()){
            return -1;
        }
        while (!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}

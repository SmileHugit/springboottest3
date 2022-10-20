package com.sptringboot.springboottest2.LianXi;


//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
public class ReplaceSpace {

    public String replaceSpace(String s) {

        return s.replace(" ", "%20");

    }

    //输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
   /* public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = stack.removeLast();
        return res;

        }
        }*/





}

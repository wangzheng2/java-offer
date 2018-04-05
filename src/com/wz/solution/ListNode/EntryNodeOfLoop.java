package com.wz.solution.ListNode;

import java.util.HashSet;

//题目描述:一个链表中包含环，请找出该链表的环的入口结点。
//思路：利用hashset不可以存重复元素的特点，listNode虽然不是基本类型，但是比较时比较的是对象地址
public class EntryNodeOfLoop {
		public ListNode method(ListNode pHead){
			 HashSet<ListNode> set=new HashSet<ListNode>();
		        while(pHead!=null){
		            if(!set.add(pHead))
		                return pHead;
		            pHead=pHead.next;
		        }
		        return null;
		}

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
 }
}

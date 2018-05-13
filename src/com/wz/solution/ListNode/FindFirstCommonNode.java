package com.wz.solution.ListNode;

import java.util.HashSet;

import com.wz.solution.ListNode.EntryNodeOfLoop.ListNode;

/*题目描述
输入两个链表，找出它们的第一个公共结点。*/
/*思路1：设A的长度为a+c，设B的长度为b+c，c为公共部分的长度。则a+c+b=b+c+a.当访问A链表结束时，从链表B的头部重新访问
链表当访问链表B结束时，从链表A头部重新开始遍历。这样就能控制访问链表A和B的指针同时访问到交点。*/
/*思路2：先把链表A存起来，再拿链表B去一个个比对，可以用hashSet。*/
public class FindFirstCommonNode {
	public ListNode solution1(ListNode phead1, ListNode phead2) {
		ListNode l1 = phead1, l2 = phead2;
		l1 = (l1 == null) ? phead2 : l1.next;
		l2 = (l2 == null) ? phead1 : l2.next;
		return l1;
	}
	//解法2
	public ListNode solution2(ListNode phead1,ListNode phead2){
		HashSet<ListNode> set=new HashSet<ListNode>();
		while(phead1!=null){
		    set.add(phead1);
		    phead1=phead1.next;
		}
		while(phead2!=null){
			if(set.contains(phead2))
				return phead2;
			phead2=phead2.next;
		}
		return null;
	}
}
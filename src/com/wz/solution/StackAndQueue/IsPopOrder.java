package com.wz.solution.StackAndQueue;

import java.util.Stack;

/*题目描述
输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）*/
/*思路：使用一个栈来模拟压入弹出操作，类似消消乐，都消没了就是其可能的弹出序列,即栈空。*/
public class IsPopOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA){
		int len=pushA.length;
		Stack<Integer> stack=new Stack<Integer>();
		for(int pushindex=0,popindex=0;pushindex<len;pushindex++){
			stack.push(pushA[pushindex]);
			while(popindex<len && stack.peek()==popA[popindex]){
				stack.pop();
				popindex++;
			}
		}
		return stack.isEmpty();
	}
}

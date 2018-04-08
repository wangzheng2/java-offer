package com.wz.solution.Array;
/*题目描述
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

此题很简单，两个容器，第一个装不能被2整除的，第二个装能被2整除的。*/
import java.util.ArrayList;

public class reOrderArray {
	public static void method(int[] array) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int len = array.length;
		for (Integer i : array) {
			if (i % 2 != 0)
				arr1.add(i);
			else
				arr2.add(i);
		}
		arr1.addAll(arr2);
		for(int i=0;i<len;i++)
			array[i]=arr1.get(i);
	}
//测试
	public static void main(String[] args) {
		int[] arr={1,3,5,7,2,4,6};
		for(Integer i:arr)
			System.out.println(i);
		
	}
}

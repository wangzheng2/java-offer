package com.wz.solution.Array;

import java.util.Arrays;

import org.junit.Test;

/*题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/
/*思路：可以看成是一个排序问题，在比较两个字符串S1和s2的大小时，应该比较的是s1+s2<s2+s1，那么应该
把s1排在前面，否则应该把s2排在前边。用比较器按指定规则排序*/
public class PrintMinNumber {
       public static String solution(int[] numbers){
    	  int n=numbers.length;
    	  String[] nums=new String[n];
    	  for(int i=0;i<n;i++)
    		  nums[i]=numbers[i]+"";
    	  Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));//根据指定比较器产生的顺序对指定对象数组排序
    	  String ret="";
    	  for(String str:nums)
    		  ret+=str;
    	  return ret;    	  
       }    
       public static void main(String[] args){
    	   int[] numbers={21,1,3};
    	    String r2=solution(numbers);
    	    System.out.println(r2);
       }
}
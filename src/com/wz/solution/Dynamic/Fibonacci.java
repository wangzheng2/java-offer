package com.wz.solution.Dynamic;
/*题目描述
大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
n<=39*/
/*思路1：基本递归的方法*/
public class Fibonacci {
//思路1:基本递归：因为很多节点是重复的，所以效率低下。最好用循环，不用递归。
     public int solution1(int n){
        if(n<=0)
        	return 0;
        if(n==1)
        	return 1;
        return solution1(n-1)+solution1(n-2);
     }
//思路2：使用循环。
     public int solution2(int n){
    	 int target=0;
    	 int one=0;
    	 int two=1;
    	 if(n==0)
    		 return 0;
    	 if(n==1)
    		 return 1;
    	 for(int i=2;i<=n;i++){
    		 target=one+two;
    		 one=two;
    		 two=target;
    	 }
    	 return target;
     }
}
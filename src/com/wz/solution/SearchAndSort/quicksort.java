package com.wz.solution.SearchAndSort;
//快速排序:分治法，从区间里取出一个数，把序列分成两部分，比它大放左边，比它小放右边，重复这个过程，直到区间只剩一个数。
public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr={5,3,8,1,9,4,7};
           int len=arr.length;
           quicksort(arr,0,len-1);
	}
	private static void quicksort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=high;
		int temp=arr[low];
		if(i<j){ //中断
		while(i!=j){
			while(i<j && arr[j]>temp)
				j--;
			if(i<j){
				arr[i]=arr[j];
				i++;
				}
			while(i<j && arr[i]<temp)
				i++;
			if(i<j){
				arr[j]=arr[i];
				j--;
			}
		}			
		}
		arr[i]=temp;
		quicksort(arr,1,i-1);
		quicksort(arr,i+1,high);
	}
}


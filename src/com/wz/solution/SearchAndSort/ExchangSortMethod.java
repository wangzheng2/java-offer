       package com.wz.solution.SearchAndSort;

public class ExchangSortMethod {
	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 3, 9, 4, 2, 8 };
		int low = 0;
		int high = 7;
		 quicksort(array, low, high);
		//Bubblesort(array);
		for (Integer i : array)
			System.out.print(i);
	}

	public static void quicksort(int[] arr, int low, int high) {
        int i,j,temp,t;
        i=low;
        j=high;     
        if(low>high)
        	return;
        temp = arr[low];                     //temp就是基准位
        while (i<j) {                        
            while (temp<=arr[j]&&i<j) j--;    //先看右边，依次往左递减
            while (temp>=arr[i]&&i<j) i++;   //再看左边，依次往右递增      
            if (i<j) {                       //如果满足条件则交换
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }    
         arr[low] = arr[i];                      //最后将基准为与i和j相等位置的数字交换
         arr[i] = temp;  
        quicksort(arr, low, j-1);                //递归调用左半数组
        quicksort(arr, j+1, high);               //递归调用右半数组
    }
	
	
	

	// 冒泡排序
	public static void Bubblesort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) { // 外层控制遍历次数
			for (int j = 0; j < arr.length - i - 1; j++) { // 内层控制一趟比较次数
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
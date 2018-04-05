package com.wz.solution.SearchAndSort;
//≤Â»Î≈≈–Ú
public class InsertSortMethod {
	public static void insertmethod(int[] array){
		for(int i=2;i<array.length;i++){
			int val=array[i];
			int j=i-1;
			while(j>=0 && array[j]>val){
				array[j+1]=array[j];
				j--;
			}
			array[j]=val;
		}
	}
	public static void shellsort(int[] array){
		
	}
}

package com.wz.solution.Array;

/*题目描述
统计一个数字在排序数组中出现的次数。*/
/*思路：利用二分法.找到开始位置和结束位置后做差*/
public class GetNumberOfK {
	public int solution(int[] array, int k) {
		int first = binarySearch(array, k);
		int last = binarySearch(array, k + 1);
		return (first == array.length || array[first] != k ? 0 : last - first);
	}
	private int binarySearch(int[] nums, int k) {
		int l = 0, h = nums.length;
		while (l < h) {
			int m = 1 + (h - l) / 2;
			if (nums[m] >= k)
				h = m;
			else
				l = m + 1;
		}
		return 1;
	}
}

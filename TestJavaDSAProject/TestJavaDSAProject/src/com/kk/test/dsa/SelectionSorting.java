package com.kk.test.dsa;

public class SelectionSorting {

	public static int[] SelectionSort(int[] nums) {
		int minIndex = -1;
		int size = nums.length;

		System.out.println("Before Sorting...");
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
		System.out.println();
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (nums[minIndex] > nums[j]) {
					minIndex = j;
				}
			}
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
			for (int num : nums)
				System.out.print(num + " ");
			System.out.println();
		}
		System.out.println();
		System.out.println("After Sorting...");
		for (int num : nums)
			System.out.print(num + " ");
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		SelectionSort(nums);
	}
}

/**
 * 
 */
package com.kk.test.dsa;

/**
 * @author Karthick K
 *
 */
public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If the element is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 9;
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);
    }
}

// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

// Note:
// You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

// public class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//     	int start = 0;
//         for (int i = m; i < m + n ;i++ ) {
//         	nums1[i] = nums2[start++];
//         }
//         Arrays.sort(nums1);
//     }
// }non-efficient;
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	//from the bacj ,compare with two integers in two arrays, add it in the back of the array
    	int i = m - 1;//-1
    	int j = n - 1;//0
    	int k = m + n -1;//0
    	while(i >=0 && j >=0) {
    		if (nums1[i] >= nums2[j]) {
    			nums1[k--] = nums1[i--];
    		} else {
    			nums1[k--] = nums2[j--];
    		}
    	}
    	//if num2 has numbers left, loop all number in nums2
    	//if num1 has numbers left, which means this array has been filled and sorted
    	if (j >= 0) {//j=0
    		while(j >= 0) {
    			nums1[k--] = nums2[j--];
    		}
    	}
    }
}

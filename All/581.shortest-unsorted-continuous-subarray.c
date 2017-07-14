// Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.  

// You need to find the shortest such subarray and output its length.

// Example 1:

// Input: [2, 6, 4, 8, 10, 9, 15]
// Output: 5
// Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.



// Note:

// Then length of the input array is in range [1, 10,000].
// The input array may contain duplicates, so ascending order here means <=. 


#include <stdio.h>
#include <stdlib.h>

///////////////////////////////////////////////////////////////////////////////////
// int findUnsortedSubarray(int* nums, int numsSize) {
//     int length = 0;
//     if (nums == 0|| numsSize <= 1)
//     {
//     	return length;
//     }
//     int start = -1;
//     int end = -1;
//     int same = -1;
//     int samevalue;
//     int flag = 0;
//     for (int i = 1; i < numsSize; ++i)
//     {

//     	printf("curr is %d, compared is %d\n",nums[i], nums[i -1]);
//     	// if (nums[i] <= nums[i - 1])
//     	// {
//     	// 	if (nums[i] == nums[i - 1])
//     	// 	{
//     	// 		same = i;
//     	// 	}
//     	// 	printf("updated\n");
//     	// 	if (start == -1)
//     	// 	{
//     	// 		start = i - 1;
//     	// 	}
//     	// 	end = i;
//     	// }
//     	if (nums[i] <= nums[i - 1]) {
//     		if (start == -1) {
//     			printf("aaaaaaaaaa\n");
//     			start = i - 1;
//     		}
//     		if (nums[i] == nums[i - 1])
//     		{
//     			if (flag == 0)
//     			{
//     				same = i - 1;
//     				samevalue = nums[i - 1];
//     				flag = 1;
//     			}

//     		} else {
//     			same = -1;
//     			flag = 0;
//     		}
//     		end = i;
//     	} 
//     }
//     if (nums[end] == samevalue && start == -1)
//     {
//     	end = same;
//     }
//     printf("start is %d, %d, end is %d, %d\n",start, nums[start], end, nums[end]);
//     length = end - start + 1;
//     // printf("length is %d\n", length);
//     if (end == start)
//     {
//     	return 0;
//     }
//     return length;
// }
//////////////////////////////////////////////////////////////////////////

int findUnsortedSubarray(int* nums, int numsSize) {
	int * arr = (int *)malloc(numsSize * sizeof(int));
	int start = -1;
	int end = -1;
	for (int i = 0; i < numsSize; ++i)
	{
		arr[i] = nums[i];
	}

	for (int i = 0; i < numsSize; ++i)
	{
		for (int j = 1; j < numsSize - i; ++j)
		{
			if (arr[j - 1] > arr[j])
			{
				int tem = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = tem;
			}
		}
	}

	for (int i = 0; i < numsSize; ++i)
	{
		// printf("arr[i] is %d, nums[i] is %d\n", arr[i], nums[i] );
		if (arr[i] != nums[i])
		{
			start = i;
			break;
		}
	}

	for (int i = numsSize -1; i >= 0; --i)
	{
		if (arr[i] != nums[i])
		{
			end = i;
			break;
		}
	}
	// printf("start is %d, end is %d\n", start, end );
	if (start == end)
	{
		return 0;
	}
	return end - start + 1;

}
// 解题思路：
// 排序（Sort）

// 对数组nums排序，记排序后的数组为snums，数组长度为n

// 令s = e = -1

// 从0到n-1枚举i，记满足nums[i] != snums[i]的最小i值为s，最大i值为e

// 则当s != e时，所求最短连续子数组为nums[s .. e] 

// 否则，所求子数组为空
// // int main(int argc, char const *argv[])
// {
// 	int arr[] = {9,1,2,7,2};
// 	int count  =  findUnsortedSubarray(arr, 5);
// 	printf("count is %d\n", count);
// 	return 0;
// }
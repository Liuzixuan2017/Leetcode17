// Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

// Example 1:

// Input: [1,4,3,2]

// Output: 4
// Explanation: n is 2, and the maximum sum of pairs is 4.


// Note:

// n is a positive integer, which is in the range of [1, 10000].
// All the integers in the array will be in the range of [-10000, 10000].



// int arrayPairSum(int* nums, int numsSize) {
// 	if (nums == 0 || numsSize <= 0 || numsSize %2 != 0)
// 	{
// 		return -20000;
// 	}
// 	for (int i = 0; i < numsSize; ++i)
// 	{
// 		for (int j = 1; j < numsSize - i; ++j)
// 		{
// 			if (nums[j - 1] > nums[j])
// 			{
// 				int tem =  nums[j - 1];
// 				nums[j - 1] = nums[j];
// 				nums[j] = tem;
// 			}
// 		}
// 	}
// 	int n = numsSize /2 ;
// 	int sum = 0;
// 	for (int i = 0; i < numsSize; i+= 2)
// 	{
// 		sum += nums[i];
// 	}
// 	return sum;  
// }
//exceed time complexity O(n^2)

//use quicksort

// int cmpfunc (const void * a, const void * b)
// {
//    return ( *(int*)a - *(int*)b );
// }
int comparefunc (const void * a, const void * b) {
	int *a_p = (int*)a;
	int *b_p = (int*)b;
	return ( *a_p - *b_p );
	// return ( *(int*)a - *(int*)b );
}

int arrayPairSum(int* nums, int numsSize) {
	//sort the array
	int sum = 0;
	qsort(nums, numsSize, sizeof(int), comparefunc);
	for (int i = 0; i < numsSize; i+=2)
	{
		sum += nums[i];
	}
	return sum;
}


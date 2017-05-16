// Given an array and a value, remove all instances of that value in place and return the new length.


// Do not allocate extra space for another array, you must do this in place with constant memory.

// The order of elements can be changed. It doesn't matter what you leave beyond the new length.


// Example:
// Given input array nums = [3,2,2,3], val = 3


// Your function should return length = 2, with the first two elements of nums being 2.




int removeElement(int* nums, int numsSize, int val) {
    if (nums == 0 || numsSize <= 0)
    {
    	return 0;
    }
    int indexForSwap = numsSize -1;
    for (int i = 0; i < numsSize; ++i)
    {
    	if (nums[i] == val)
    	{
    		while(nums[indexForSwap] == val) {
    			indexForSwap--;
    		}
    		if (indexForSwap > i)
    		{
    			nums[i] = nums[indexForSwap];
    			nums[indexForSwap] = val;
    		}
    	}
    }
    int size = indexForSwap + 1;
    // printf("size is %d\n", size);
    return size;
}

// int removeElement(int* nums, int numsSize, int val) {
//    int tail=0;      //代表新array的結尾
//    for(int i=0;i<numsSize;i++){
//        if(nums[i]!=val) nums[tail++]=nums[i];
//    }
//    // for (int i = 0; i < numsSize; ++i)
//    // {
//    // 	printf("%d\n",nums[i]);
//    // }
//    return tail;//no need to add 1, the final array is not right
// }
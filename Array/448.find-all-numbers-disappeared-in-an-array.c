/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
#include <stdlib.h>
#include <stdio.h>

int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
	if (numsSize <= 0 || nums == 0)
	{
		*returnSize = 0;
		return 0;
	}
    int * arr = (int*)malloc(sizeof(int)*numsSize);
    for (int i = 0; i < numsSize; ++i)
    {
    	arr[i] = i + 1;
    }

    for (int i = 0; i < numsSize; ++i)
    {
    	int index = nums[i];
    	if (arr[index - 1] != 0)
    	{
    		arr[index - 1] = 0;
    	}
    }
    // printf("/////////////////////////////////////////////\n");
    // for (int i = 0; i < numsSize; ++i)
    // {
    // 	printf("%d ",arr[i]);
    // }
    // printf("\n");
    // printf("/////////////////////////////////////////////\n");
    int indexof0 = -1;
    int first = 0;
    int size = 0;
    for (int i = 0; i < numsSize; ++i)
    {
    	//shift all elements which are not 0
    	if (arr[i] == 0 && first == 0)
    	{
    		indexof0 = i;
    		first = 1;
    	}
    	if (arr[i] != 0 && first == 1)
    	{
    		arr[indexof0] = arr[i];
    		arr[i] = 0;
    		size++;
    		for (int j = indexof0; j < numsSize; ++j)
    		{
    			if (arr[j] == 0)
    			{
    				indexof0 = j;
    				break;
    			}
    		}
    	}
    }
    // printf("/////////////////////////////////////////////\n");
    // for (int i = 0; i < numsSize; ++i)
    // {
    // 	printf("%d ",arr[i]);
    // }
    // printf("\n");
    // printf("/////////////////////////////////////////////\n");
    *returnSize = indexof0;
    return arr;
}

// int main(int argc, char const *argv[])
// {
// 	int array[] = {2,2};
// 	int size = 0;
// 	int * r = findDisappearedNumbers(array, 2, &size); 
// 	for (int i = 0; i < size; ++i)
// 	{
// 		printf("%d\n", r[i]);
// 	}
// 	return 0;
// }
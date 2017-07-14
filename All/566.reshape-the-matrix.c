/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *columnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */


/*In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.


Example 1:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.



Example 2:
Input: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
Output: 
[[1,2],
 [3,4]]
Explanation:There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.
Note:

The height and width of the given matrix is in range [1, 100].
The given r and c are all positive.*/
// int** matrixReshape(int** nums, int numsRowSize, int numsColSize, int r, int c, int** columnSizes, int* returnSize) {
//     if (nums == 0 || numsRowSize * numsColSize != r*c)
//     {
//     	*returnSize = numsRowSize;
//     	**columnSizes = numsColSize;
//     	return 0;
//     } else {
//     	for (int i = 0; i < numsRowSize; ++i)
//     	{
//     		for (int j = 0; j < numsColSize; ++j)
//     		{
//     			printf("0x%x ",&nums[i][j]);
//     		}
//     		printf("\n");
//     	}

//     	printf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
//     	 	for (int i = 0; i < r; ++i)
//     	{
//     		for (int j = 0; j < c; ++j)
//     		{
//     			printf("0x%x ",&nums[i][j]);
//     		}
//     		printf("\n");
//     	}
//     	*returnSize = r;
//     	*columnSizes = (int *)malloc(r*sizeof(int));
//     	for (int i = 0; i < r; ++i)
//     	{
//     		*columnSizes[i] = c;
//     	}
//     	return nums;
//     }
// }
int** matrixReshape(int** nums, int numsRowSize, int numsColSize, int r, int c, int** columnSizes, int* returnSize) {
	if (nums == 0 || numsColSize*numsRowSize != r*c)
	{
		*columnSizes = (int *)malloc(r*sizeof(int));
    	for (int i = 0; i < r; ++i)
    	{
    		*columnSizes[i] = numsColSize;
    	}
		*returnSize = numsRowSize;
		return nums;
	}
	//initialize two dimesional array 
	int **arr = (int**)malloc(r*sizeof(int*));

	for (int i = 0; i < r; ++i)
	{
		// *arr = (int*)malloc(c*sizeof(int));
		arr[i] = (int*)malloc(c*sizeof(int));
	}

	//reshape the matrix
	int count = 0;
	for (int i = 0; i < numsRowSize; ++i)
	{
		for (int j = 0; j < numsColSize; ++j)
		{
			arr[count / c][count % c] = nums[i][j];
			count++; 
		}
	}
	//allocate space for colunsize and returnS
	*columnSizes = (int *)malloc(r*sizeof(int));
    	for (int i = 0; i < r; ++i)
    	{
    		*columnSizes[i] = c;
    	}
		*returnSize = r;
		// printf("hahahahhahahahah\n");
		return arr;
}
 // ✔ runtime: 0 ms
 //    ✘ answer: [[1,2,0,0]]
 //    ✘ output: 0x1a94290 0x1a94294 ,0x1a942b0 0x1a942b4 
 //    		  0x1a94290 0x1a94294 0x1a94298 0x1a9429c 

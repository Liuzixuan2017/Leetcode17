/**
 * Return an array of arrays.
 * The sizes of the arrays are returned as *columnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
int** generate(int numRows, int** columnSizes) {
    if (numRows <= 0)
    {
        columnSizes = 0;
        return 0;
    }
    *columnSizes = (int*)malloc(sizeof(int) * numRows);
    int **arr = (int**)malloc(numRows*sizeof(int*));
    for (int i = 0; i < numRows; ++i)
    {
        
        (*columnSizes)[i] = i+1;//*columnSizes[i] = i+1，this is not right, it will 
        //give a runtime error since we have defer it first before accessing the elements
        //in the array, have to include the bracket
        arr[i] = (int*)malloc(sizeof(int)*(i+1));
        for (int j = 0; j < i+1; ++j)
        {
            if (j ==0 || j == i)
            {
                arr[i][j] = 1;
            } else {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
    }
    return arr;
}


// int main(int argc, char const *argv[])
// {
//     int size;
//     int *ptr = &size;
//     int** returned = generate(4, &ptr);
//     for (int i = 0; i < 4; i++) {
//         printf("%d ", ptr[i]);
//     }
//     printf("\n");
//     for (int i = 0; i < 4; i++) {
//         for (int j = 0; j < i+1; j++) {
//             printf("%d ", returned[i][j]);
//         }
//         printf("\n");
//     }
    
//     return 0;
// }
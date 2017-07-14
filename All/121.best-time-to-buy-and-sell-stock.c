// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

// Example 1:
// Input: [7, 1, 5, 3, 6, 4]
// Output: 5

// max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
// Example 2:
// Input: [7, 6, 4, 3, 1]
// Output: 0

// In this case, no transaction is done, i.e. max profit = 0.
///////////////////////////////////////////////////////////////////////////////////
// // classic solution, will time limit exceeded. O(n^2)
// int maxProfit(int* prices, int pricesSize) {
// 	int max = 0;
// 	//check the conditions
// 	if (prices == NULL)
// 	{
// 		return max;
// 	}
    
//     for (int i = 0; i < pricesSize; ++i)
//     {
//     	int curr = prices[i];
//     	for (int j = i+1; j < pricesSize; ++j)
//     	{
//     		int compare = prices[j];
//     		int diff = compare - curr;
//     		if (diff > 0 && diff > max)
//     		{
//     			max = diff;
//     		}
//     	}
//     }
//     // printf("maxprofit is %d\n",max);
//     return max;
// }
///////////////////////////////////////////////////////////////////////////////

//O(N)
int maxProfit(int* prices, int pricesSize) {
	int min = prices[0];//record the minimum value found so far
	int profit = 0;
	//check curr int with the min
	//if the difference is less than 0, compare it with min if
	//it is smaller than the min, update the min
	//else if it is greater than 0, which is profitable but
	//it is not necessary the max profit, so compare with profit
	//if it is greater profit, then update the profit
	for (int i = 1; i < pricesSize; ++i)
	{
		int curr = prices[i];
		int diff = curr - min;
		if (diff > profit) {
			profit = diff;
		} else {
			if (diff < 0 && curr < min)
			{
				min = curr;
			}
		}
	}
	// printf("max profit is %d\n", profit);
	return profit;
}
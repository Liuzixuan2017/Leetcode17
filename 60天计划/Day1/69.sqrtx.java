public class Solution {
    public int mySqrt(int x) {
        //the answer need the integer which is smaller but the closest to the true answer
        if (x == 0) {
            return 0;
        }
        int left = 1; 
        int right = x;
        // int answer = 0;
        while (left <= right) {
             int mid = (left + right) /2;
             if (mid <= x / mid) {
                 left = mid + 1;
             } else {
                right = mid - 1;
             }
        }
        return left - 1; 
    }

	//another approach is to use newton's method approaching the correct answer
	// public int mySqrt(int x) {
	// 	double test = x;
	// 	while (Math.abs(test*test - x) > 0.00001) {
	// 		test = (test + x / test) /2;
	// 	}//this will overfl
	// 	return (int)test;
	// }
}
public class Solution {
	//initialize the data structrue
        
    public double myPow(double x, int n) {
    // 	if (n == 0) return 1;
    // 	if (n == 1) return x;
    //     int length = Math.abs(n);
    // 	Double record[] = new Double [length + 1];
    //     record[0] = 1.0;
    //     record[1] = x;
    //     helperPower(x, length, record);
    //     double ans = record[length];
    //     if (n > 0) {
    //     	return ans;
    //     } else {
    //     	return 1/ans;
    //     }
        
    // }

    // public void helperPower(double x, int n, Double[] record) {
    // 	if (record[n] != null) {
    //        return;
    //    	}
    //     if(record[n/2] != null && record[n - n/2] != null){
    //         record[n] = record[n/2] * record[n-n/2];
    //         return;
    //     }
    //     helperPower(x, n/2, record);
    //     helperPower(x, n - n/2, record);
    //     record[n] = record[n/2] * record[n-n/2];
    	if (n == 0) {
    		return 1;
    	}
    	if (n == 1) {
    		return x;
    	}
    	double ans = helper(x, Math.abs(n));
    	if (n  > 0) {
    		return ans;
    	} else {
    		return 1/ans;
    	}
    }

    public double helper(double x, int n) {
    	if (n == 1) {
    		return x;
    	}
    	double value = helper(x, n /2);
    	if (n % 2 == 0) {
    		return value * value;
    	} else {
    		return x * value *value;
    	}
    }
}
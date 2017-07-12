public class Solution {
    public int reverse(int x) {
    	int temp = x;
    	int new_value = 0;
    	int old_value = 0;
    	while(temp != 0) {
    		int store = temp % 10;
    		new_value = old_value * 10 + store;
    		if ((new_value - store) /10 != old_value) {
    			return 0;
    		}
    		old_value = new_value;
    		temp /= 10;
    	}
    	return new_value;
    }
}
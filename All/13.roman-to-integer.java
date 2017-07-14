public class Solution {
    public int romanToInt(String s) {
        char arr[] = s.toCharArray();
        int sum = 0;
        int i;
        for (i = 0; i < arr.length -1; i++ ) {
        	int c1 = convert(arr[i]);
        	int c2 = convert(arr[i+1]);
        	if (c1 >= c2) {
        		sum += c1;
        	} else {
        		sum = sum + (c2 - c1);
        		i++;
        	}
        }

        if (i == arr.length - 1) {
        	sum += convert(arr[i]);
        }
        return sum;
    }

    public int convert(char roman) {
 		if (roman == 'I') return 1;
 		if (roman == 'V') return 5;
 		if (roman == 'X') return 10;
 		if (roman == 'L') return 50;
 		if (roman == 'C') return 100;
 		if (roman == 'D') return 500;
 		if (roman == 'M') return 1000;
 		return -1;
    }
}
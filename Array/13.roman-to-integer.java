// Given a roman numeral, convert it to an integer.

// Input is guaranteed to be within the range from 1 to 3999.


// Symbol	I	V	X	L	C	D	M
// Value	1	5	10	50	100	500	1,000



// A number in Roman Numerals is a string of these symbols written in descending order(e.g. M’s first, followed by D’s, etc.). However, in a few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:
// I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10).
// X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
// C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).
// public class Solution {
//     public int romanToInt(String s) {
//         int count  = 0;
//         char[] split = s.toCharArray();
//         for (int i = 0; i < split.length;i++ ) {
//         	switch(split[i]){
//         		case 'I':
//         			count += 1;
//         			break;
//         		case 'V':
//         			count += 5;
//         			break;
//         		case 'X':
//         			count += 10;
//         			break;
//         		case 'L':
//         			count += 50;
//         			break;
//         		case 'C':
//         			count += 100;
//         			break;
//         		case 'D':
//         			count += 500;
//         			break;
//         		case 'M':
//         			count += 1000;
//         			break;
//         	}
//         }
//         return count;
//     }
// }//not right does not consider the substraction system
public class Solution {
	public int convert(char c) {
		int value = 0;
		switch(c) {
			case 'I':
				value = 1;
				break;
			case 'V':
				value = 5;
				break;
			case 'X':
				value = 10;
				break;
			case 'L':
				value = 50;
				break;
			case 'C':
				value = 100;
				break;
			case 'D':
				value = 500;
				break;
			case 'M':
				value = 1000;
				break;
		}
		return value;
	}
    public int romanToInt(String s) {
    	int sum = 0 ;
    	int i = 0;
    	while (i < s.length() - 1) {
    		if (convert(s.charAt(i)) >= convert(s.charAt(i+1))) {
    			sum += convert(s.charAt(i));
    			i++;
    		} else {
    			sum += convert(s.charAt(i + 1)) - convert(s.charAt(i));
    			i += 2;
    		}
    	}
    	if (i < s.length()) {
    		sum += convert(s.charAt(i));
    	}
    	return sum;
    }
}
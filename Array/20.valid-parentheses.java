// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
        		st.push(arr[i]);
        	} else {
        		if (st.empty() == false) {
        			char p = st.pop();
        			if ((arr[i] == '}' && p != '{') ||(arr[i] == ']' && p != '[')
        				||(arr[i] == ')' && p != '(')){
        				return false;
        			}
        		} else {
        			return false;
        		}
        	}
        }
        if (st.empty() == false) {
        	return false;
        } else {
        	return true;
        }
    }
}
public class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        if (s.length() == 0) {
        	return true;
        }
        for (int i = 0; i < arr.length; i++ ) {
        	if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
        		st.push(arr[i]);
        	} else {
        		if (st.empty() == true) {
        			return false;
        		} else {
        			char p = st.pop();
        			if (p == '{' && arr[i] != '}' || p == '(' && arr[i] != ')' || p == '[' && arr[i] != ']') {
        				return false;
        			}
        		}
        	}
        }
        if (st.empty() != true) {
        	return false;
        } else {
        	return true;
        }
    }
}
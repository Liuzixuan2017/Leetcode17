import java.util.*;
public class BalancedParentheses{
	public static boolean test(String s) {
		char [] arr = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(' || arr[i] == '{' || arr[i] =='[') {
				st.push(arr[i]);
			} else {
				if (st.isEmpty() == true) {
					return false;
				}
				char p = st.pop();
				char t = arr[i];
				if (!(p == '(' && t == ')' || p == '{' && t == '}' || p == '[' && t == ']')) {
					return false;
				}
			}
		}
		if (st.isEmpty() == true) {
			return true;
		} else {
			return false;
		}
	}
}
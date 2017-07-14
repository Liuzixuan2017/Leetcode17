public class Solution {
    public String reverseWords(String s) {
    	if (s.length() == 0) {
    		return "";
    	}
    	s = s.trim();
    	StringBuilder b = new StringBuilder(); 
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length / 2; i++ ) {
        	String temp = arr[i];
        	arr[i] = arr[arr.length - 1 -i];
        	arr[arr.length - 1 -i] = temp;
        }

        for (int i = 0; i < arr.length ;i++ ) {
        	// if (arr[i] != " ") {
        	//cannot compare string like this !!!!!!!
        	//if you split the string by space how could this statment be evaluated to be true
        	if (arr[i].equals("") == false) {
        		b.append(arr[i]);
        		b.append(" ");
        	}
        }

        String val = b.toString();
        if (val.length() == 0) {
        	return "";
        } else {
        	return val.substring(0, val.length() - 1);
        }  
    }
}
// Write a function that takes a string as input and returns the string reversed.

/*
String are immutable in Java. You can't change them.

You need to create a new string with the character replaced.

String myName = "domanokz";
String newName = myName.substring(0,4)+'x'+myName.substring(5);
Or you can use a StringBuilder:

StringBuilder myName = new StringBuilder("domanokz");
myName.setCharAt(4, 'x');
toString()

Turn the String into a char[], replace the letter by index, then convert the array back into a String.

String myName = "domanokz";
char[] myNameChars = myName.toCharArray();
myNameChars[4] = 'x';
myName = String.valueOf(myNameChars);
*/
public class Solution {
    public String reverseString(String s) {
    	// StringBuilder b = new StringBuilder(s);
     //    for (int i = 0; i < s.length() / 2; i++ ) {
     //    	b.setCharAt(i, s.charAt(s.length() -1 -i));
     //    }
     //    String newString = b.toString();
     //    return newString;
    	char arr[] = s.toCharArray();
    	for (int i = 0; i < arr.length /2; i++ ) {
    		char temp =  arr[i];
    		arr[i] = arr[arr.length - 1 - i];
    		arr[arr.length - 1 - i] = temp;
    	}
    	return String.valueOf(arr);
    }
}
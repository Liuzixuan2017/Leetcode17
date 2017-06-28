// Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
// Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
// The order of output does not matter.


/*
//How to test if two strings are anagrams,
create a hash array with size of 256, one for each char,
loop two strings at the same time, for the first string, increase
the count of that char, for the second string, decrease the count of that
char. At the end, if the whole array with each element 0 means that this
two strings are anagram.

or quicksort 2 arrays if each element in two arrays are the same, they are anagram
*/
import java.util.*;
public class Solution {//O(N) TLE
    // public List<Integer> findAnagrams(String s, String p) {
    //     List<Integer> list = new ArrayList<Integer>();
    //     for (int i = 0; i <= s.length() - p.length(); i++ ) {
    //     	String s1 = s.substring(i, i+p.length());
    //     	if (testAnagram(s1, p) == true) {
    //     		list.add(i);
    //     	}
    //     }
    //     return list;
    // }
    // public boolean testAnagram(String s1, String s2) {
    // 	if (s1.length() != s2.length()) {
    // 		return false;
    // 	}
    // 	int count[] = new int[256];
    // 	for (int i = 0; i< s1.length(); i++) {
    // 		count[(int) s1.charAt(i)]++;
    // 	}

    // 	for (int i = 0; i < s2.length(); i++) {
    // 		count[(int) s2.charAt(i)]--;
    // 	}

    // 	for (int i = 0; i< s2.length(); i++ ) {
    // 		if (count[(int) s2.charAt(i)] != 0) {
    // 			return false;
    // 		}
    // 	}
    // 	return true;
    // }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        //create a hash array, loop through all char and increase element by 1
        int count[] = new int[256];
        for (char c : p.toCharArray()) {
            count[(int) c]++;
        }

        //sliding the windows
        int left = 0;
        int right = 0;
        int len = p.length();

        //当right小于s的长度
        while(right < s.length()) {
            //System.out.print(s.charAt(right) + " this is without ++ " );
            //System.out.print(s.charAt(right++) + " this is with ++");

            int refer = count[s.charAt(right++)]--;
            //如果此位置的数字仍然大于0说明这个char是目标的char，right向右移动

            //在这个数字decrease之前
            if (refer >= 1) {
                len--;
            }
            //相差无遗
            if (len == 0) {
                list.add(left);
            }
            //why is greater than and equal to 0, is because that you have already decease by 1
            //if the count >= 1 means it is in the string but because for every char , you decrease by 1 first,
            //so for now it is greater and equal to 0 
            //why you need to see the length, you only move left when you already check the whole substring
            if (right - left == p.length() && count[s.charAt(left++)]++ >= 0) {
                //count是用来记录当前的string和目标string相差几个char
                //如果发现left的位置上大于0说明他也是目标char之一，现在left向右移动
                //说明目标少了一个，相差的多了一个，因此count++；
                len++;
            }
        }
        return list;
    }
    // public static void main(String[] argvs) {
    //     solution1 s = new solution();
    //     List<Integer> list = s.findAnagrams("ab", "a");
    //     for (int i = 0; i < list.size(); i++)
    //         System.out.println(list.get(i));
    // }
}
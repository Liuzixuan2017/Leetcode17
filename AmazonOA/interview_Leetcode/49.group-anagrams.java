// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
// Return:

// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note: All inputs will be in lower-case.
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    // 	List<List<String>> arr = new ArrayList<List<String>>();
    // 	if (strs.length == 0) {
    // 		return arr;
    // 	}
    // 	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    //     for (int i = 0; i < strs.length; i++) {
    //     	String tar = strs[i];
    //     	//iterate all keys in the hash map to see if this string is anagram of any
    //     	boolean flag = false;
    //     	for (String key: map.keySet()) {
    //     		if (isAnagram(tar, key) == true) {
    //     			ArrayList l = map.get(key);
    //     			l.add(tar);
    //     			flag = true;
    //     		}
    //     	}
    //     	if (flag == false) {
    //     		map.put(tar, new ArrayList<String>());
    //     	}
    //     }

    //     for (String key: map.keySet()) {
    //     	ArrayList l = map.get(key);
    //     	l.add(key);
    //     	arr.add(l);
    //     }
    //     return arr;
    // }

    // public boolean isAnagram(String s1, String s2) {
    // 	if (s1.length() != s2.length()) {
    // 		return false;
    // 	}

    // 	int count[] = new int[256];
    // 	for (int i = 0; i < s1.length(); i++ ) {
    // 		count[(int) s1.charAt(i)]++;
    // 	}

    // 	for (int i = 0; i < s2.length(); i++ ) {
    // 		count[(int) s2.charAt(i)]--;
    // 	}

    // 	for (int i = 0; i < s1.length(); i++ ) {
    // 		if(count[(int) s1.charAt(i)] != 0) {
    // 			return false;
    // 		}
    // 	}
    // 	return true;
    // }works fine but it is too slow, it will have a tle
    	List<List<String>> arr = new ArrayList<List<String>>();
    	if (strs.length == 0) {
    		return arr;
    	}
    	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < strs.length; i++) {
        	String tar = strs[i];
        	//System.out.print(" Current string is " + tar + " ");

        	//sort the string first and use it as the key in the hashmap
        	char[] a = tar.toCharArray();
        	Arrays.sort(a);
        	String a1 = new String(a);
        	if (map.containsKey(a1) == true) {
        		//System.out.print(" This string is contained, added to arraylist ");
        		map.get(a1).add(tar);
        	} else {
        		//System.out.print(" This string is not contained, add a new key ");
        		ArrayList li = new ArrayList<String>();
        		li.add(tar);
        		map.put(a1, li);
        	}
        }

        for (String key: map.keySet()) {
        	ArrayList l = map.get(key);
        	arr.add(l);
        }
        return arr;
    }

}
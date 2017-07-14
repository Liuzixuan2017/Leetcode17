public class Solution {
	
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++ ) {
        	q.add(nums[i]);
        }
        int val = 0;
        for (int i = 0; i < k; i++) {
        	val = q.poll();
        }
        return val;
    }

    // public class HeapComparator implements Comparator<Integer> {
    // 	public int compare(int x, int y) {
    // 		if (x > y) {
    // 			return -1;
    // 		} else if (x < y) {
    // 			return 1;
    // 		} else {
    // 			return 0;
    // 		}
    // 	}
    // }

    //default maxheap
}
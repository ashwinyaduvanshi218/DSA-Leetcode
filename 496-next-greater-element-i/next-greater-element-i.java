import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: process nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int curr = nums2[i];

            // pop all smaller elements
            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            // store answer in map
            int nextGreater = st.isEmpty() ? -1 : st.peek();
            map.put(curr, nextGreater);

            // push current element
            st.push(curr);
        }

        // Step 2: build result for nums1
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        //4 1 2  1 3 4 2 

        for(int i = nums2.length-1 ; i >= 0 ; i--){
            int curr = nums2[i];

            while(!st.isEmpty() && st.peek()<curr){
                st.pop();


            }
            int greatest = (st.isEmpty() ? -1 : st.peek());
            map.put(curr , greatest); 

            st.push(curr);  

        }
        int[] res = new int[nums1.length];
        for(int i =0 ; i<nums1.length ; i++){
            res[i] = map.get(nums1[i]);
        }
        return res ;


       

    }
}
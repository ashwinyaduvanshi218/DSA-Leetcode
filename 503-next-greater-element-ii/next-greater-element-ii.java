import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();
        Arrays.fill(res, -1);
        for(int i =0 ; i<n*2 ; i++){
            int idx = i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[idx]){
                int poped = st.pop();
                res[poped]=nums[idx];


            }

            
            if(i<n){
                st.push(idx);
            }

            
        } return res ;


        





        
    }
}
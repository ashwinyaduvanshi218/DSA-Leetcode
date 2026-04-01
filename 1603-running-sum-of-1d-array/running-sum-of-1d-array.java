class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        
        int[] res = new int[n];
        int add = 0 ;
        for(int i = 0; i < n; i++){
            add+=nums[i];
            res[i]=add;


        }return res;
    }
}
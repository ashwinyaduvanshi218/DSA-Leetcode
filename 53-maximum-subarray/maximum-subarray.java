class Solution {
    public int maxSubArray(int[] nums) {
        int p = nums[0];
        int q = nums[0];
        for(int i = 1 ; i<nums.length; i++ ){
            if(p<0){
                p=nums[i];

            }
            else{
                p+=nums[i];

            }
            if(p>q){
                q=p;
            }
        }
        return q;
    }
}
/* for ( int i = 0 ; i < n ; i++){
    currSum += num[i];
    maxSum= Math.max(maxSum , currSum);
    if(currSum<0){
        
    }
}*/
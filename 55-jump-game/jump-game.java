class Solution {
    public boolean canJump(int[] nums) {

        int  finalPosition = nums.length-1;
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(i + nums[i]>=finalPosition){
                finalPosition = i ;
            }
           
        }return finalPosition == 0 ; 





       /* int n = nums.length;

        int max = 0;

        for(int i = 0 ; i<n ; i++){

            if(i>max){
                return false ;
            }

            max = Math.max(max , i + nums[i]);
        }return true;*/
    }
}
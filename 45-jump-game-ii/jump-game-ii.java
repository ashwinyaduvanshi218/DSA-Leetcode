class Solution {
    public int jump(int[] nums) {


        int n = nums.length ; 
        int jump = 0;
        int maxfar = 0 ;
        int currentEnd  = 0 ;

        for(int i = 0 ; i<n-1 ; i++){

            maxfar = Math.max(maxfar , i + nums[i]);

            if(i == currentEnd){
                jump++;
                currentEnd = maxfar ;
                
            }


        }return jump ;
        
    }
}
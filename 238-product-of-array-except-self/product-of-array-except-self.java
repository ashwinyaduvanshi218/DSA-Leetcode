class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0]=1;
        

        for(int i=1 ; i<n ; i++){
            result[i]=result[i-1]*nums[i-1];
            }

        // [1, 1, 2, 6]
        int sufix =1; 
        for(int i = n-1; i>=0;i--){
            result[i]*=sufix;
            sufix*=nums[i];

        }
        return result;
        




        
        



        
    }
}
/* 
 
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int = nums.length;
        int[] result = new int[n];

        int prefix = 1 ; 
        int sufix = 1 ;

        for(int i = 0 ; i<n ; i++){

            result[i]*=prefix;
            prefix*=nums[i];

            result[n-1-i]*=sufix;
            sufix*=nums[n-1-i];
        }

    }
}    */
// try solving with hash set for optimal solution 
/*class Solution {
    public boolean containsDuplicate(int[] nums) {

        int n = nums.length;
        if(n==1 ) return false ; 

        int start = 0;
        int end = n-1 ;
        for(int i = 0 ; i<n ; i++){

            while(start<end){
                if(nums[start] == nums[end]){
                    return true ;
                }
                end --;
            }
            start++;
            end= n-1; 
        
        }
        return false ;
    }
}*/
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){

            if(set.contains(num)){
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
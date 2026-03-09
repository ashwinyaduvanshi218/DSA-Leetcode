class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;

        

        for(int i =0 ; i<n ; i++){

            for(int j=i+1 ; j<n ; j++){

                if(nums[j]<=nums[i]){

                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;


                }
            }
        }
        return ;
        
    }
}

// optimal solution in O(1) and O(n)
/* Dutch National Flag Algorithm

class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }

            else if(nums[mid] == 1){
                mid++;
            }

            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return ;
    }
}*/
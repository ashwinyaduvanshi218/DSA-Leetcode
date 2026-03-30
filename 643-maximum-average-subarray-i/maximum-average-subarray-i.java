class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sumWindow = 0 ; 
        for(int i = 0 ; i<k ; i++){
            sumWindow+=nums[i];

        }
        int maxwindow = sumWindow ; 
        for(int i = k ; i<nums.length; i++){
            sumWindow+=nums[i]-nums[i-k];
            maxwindow = Math.max(maxwindow , sumWindow);
        }return (double) maxwindow/k;
    }
}
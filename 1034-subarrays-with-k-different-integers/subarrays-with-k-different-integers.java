class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    int atMost(int[] nums,int k){
        int l=0,res=0;
        Map<Integer,Integer> m=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.size()>k){
                int x=nums[l++];
                m.put(x,m.get(x)-1);
                if(m.get(x)==0)m.remove(x);
            }
            res+=r-l+1;
        }
        return res;
    }
}
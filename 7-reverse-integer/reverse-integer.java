class Solution {
    public int reverse(int x) {
        int rev = 0 ;
        while(x!= 0){
            int rem=x%10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10 ){
            return 0 ; 

            }
            rev = rev*10 + rem ;
            x = x/10 ; 
        }
        
        return rev ;
    
        
        
    }
}
/*advance checking 
if (rev == MAX/10 && digit > 7) return 0;
if (rev == MIN/10 && digit < -8) return 0;*/
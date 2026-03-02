/* without recursion with pure manupulation 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}*/

/* with loops 
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }
}

*/

//with re cursion 
/*class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;      
        if (n <= 0 || n % 2 != 0) return false;

        return isPowerOfTwo(n / 2);
    }
}*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false ;
        }
        while(n%2==0){
            n/=2;
                
            
            

        }return n==1;


    }
}
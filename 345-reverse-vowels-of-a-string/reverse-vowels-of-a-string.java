class Solution {
    boolean isVowel(char ch)
    
    {
    
        return ch== 'a' || ch == 'i' || ch == 'e' || ch =='o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U' ;
            
        
         
    }
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length-1;
        char temp;
        
        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if (!isVowel(arr[right])){
                right--;
            }
            else{
                temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
                
                
            }
        }return new String(arr) ;
    }
}
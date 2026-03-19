class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false ;

        /*int[] arr = new int[26];

        for(int i = 0; i<s.length(); i ++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        } 
        for(int check : arr){
            if(check!=0){
                return false ;
            }
        }return true ;*/
        HashMap< Character, Integer > map = new HashMap<>();
        for(int i =0 ; i<s.length(); i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i) ;


            map.put(ch1 , map.getOrDefault(ch1 , 0) + 1);
            map.put(ch2 , map.getOrDefault(ch2 , 0 ) - 1);
        }
        for(int check : map.values()){
            if(check != 0){
                return false ;
            }
        }

        return true ;

       
    }
}



import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(pattern.length() != words.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // agar mapping already exist karti hai
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(word)) {
                    return false;
                }
            } 
            // new mapping banani hai
            else {
                // check word already kisi aur char ko assign to nahi hai
                if(usedWords.contains(word)) {
                    return false;
                }

                map.put(ch, word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
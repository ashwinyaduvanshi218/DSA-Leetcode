class Solution {
    public String longestCommonPrefix(String[] strs){ 
        if(strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        
        String first = strs[0];
        String last = strs[strs.length - 1];
        
        int i = 0;
        while(i < first.length() && i < last.length()) {
            if(first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        
        return first.substring(0, i);
    }
}
/*
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            // shrink prefix until it matches current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}*/
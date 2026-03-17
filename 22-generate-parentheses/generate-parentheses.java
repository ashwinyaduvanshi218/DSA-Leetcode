import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        helper(result, current, 0, 0, n);
        return result;
    }

    public void helper(List<String> result, StringBuilder current, int open, int close, int n) {

        // Base case
        if(current.length() == 2 * n){
            result.add(current.toString());
            return;
        }

        // Add '('
        if(open < n){
            current.append('(');                 // choose
            helper(result, current, open + 1, close, n);
            current.deleteCharAt(current.length() - 1); // backtrack
        }

        // Add ')'
        if(close < open){
            current.append(')');                 // choose
            helper(result, current, open, close + 1, n);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
class Solution {
    public boolean checkRecord(String s) {

        int absentCount = 0;
        int lateCount = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Count A
            if(ch == 'A') {
                absentCount++;
                if(absentCount >= 2) return false;
            }

            // Count consecutive L
            if(ch == 'L') {
                lateCount++;
                if(lateCount >= 3) return false;
            } else {
                lateCount = 0; // reset if not L
            }
        }

        return true;
    }
}
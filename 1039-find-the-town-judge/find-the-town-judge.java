
class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] score = new int[n + 1];

        // Track incoming and outgoing trust
        for (int[] t : trust) {
            score[t[0]]--;  // Person trusts someone
            score[t[1]]++;  // Person is trusted
        }

        // Find the Town Judge
        for (int person = 1; person <= n; person++) {
            if (score[person] == n - 1) {
                return person;
            }
        }

        return -1;
    }
}

package C40ChallengingDynamicProgramming;

public class P3LCSBottomUp {

    public int findLCSLengthBU(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = s1.length(); i >= 1; i--) {
            for (int j = s2.length(); j >= 1; j--) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i - 1][j - 1] = Math.max(1 + dp[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
                } else {
                    dp[i - 1][j - 1] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        P3LCSBottomUp lcs = new P3LCSBottomUp();

        String s1 = "ABCBDAB";
        String s2 = "BDCABA";

        int result = lcs.findLCSLengthBU(s1, s2);
        System.out.println(result);
    }
}

package C40ChallengingDynamicProgramming;

public class P2LCSTopDown {

    public static void main(String[] args) {
        P2LCSTopDown p2 = new P2LCSTopDown();
        int result = p2.findLCSLengthTD("ABCBDAB", "BDCABA");
        System.out.println(result);
    }

    public int findLCSLengthTD(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];

        for (int i = 0; i < s1.length(); i++)
            for (int j = 0; j < s2.length(); j++)
                dp[i][j] = -1;

        return findLCSLengthAux(dp, s1, s2, 0, 0);
    }

    private int findLCSLengthAux(
            int[][] dp, String s1, String s2, int i1, int i2
    ){
        if(i1 == s1.length() || i2 == s2.length()){
            return 0;
        }

        if(dp[i1][i2] == - 1){
            if(s1.charAt(i1) == s2.charAt(i2)){
                dp[i1][i2] = 1 + findLCSLengthAux(dp, s1, s2, i1 + 1, i2 + 1);
                return dp[i1][i2];
            }else{
                int c1 = findLCSLengthAux(dp, s1, s2, i1, i2 + 1);
                int c2 = findLCSLengthAux(dp, s1, s2, i1 + 1, i2);

                dp[i1][i2] = Math.max(c1, c2);
            }
        }

        return dp[i1][i2];
    }
}

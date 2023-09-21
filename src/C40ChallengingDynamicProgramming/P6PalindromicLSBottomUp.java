package C40ChallengingDynamicProgramming;

public class P6PalindromicLSBottomUp {

    public int findLPSLengthBU(String st) {
        int[][] dp = new int[st.length()][st.length()];
        for (int col = 0; col < st.length(); col++) {
            for (int row = st.length() - 1; row >= 0; row--) {

                if(row > col){
                    dp[row][col] = 0;
                } else if(row == col){
                    dp[row][col] = 1;
                } else {
                    if(st.charAt(row) == st.charAt(col)){
                        dp[row][col] = Math.max(2 + dp[row + 1][col - 1],
                                Math.max(dp[row][col - 1], dp[row + 1][col]));
                    } else {
                        dp[row][col] = Math.max(dp[row][col - 1], dp[row + 1][col]);
                    }
                }
            }
        }

        return dp[0][st.length() - 1];
    }

    public static void main(String[] args) {
        P6PalindromicLSBottomUp pls = new P6PalindromicLSBottomUp();
        int result = pls.findLPSLengthBU("ELRMENMET");
        System.out.println(result);
    }
}

package C40ChallengingDynamicProgramming;

public class P5LongestPalindromicSubTopDown {

    public int findLPSLength(String string) {
        Integer[][] dp = new Integer[string.length()][string.length()];
        return lps_Aux(dp, string, 0, string.length() - 1);
    }

    private int lps_Aux(Integer[][] dp, String string, int startIndex,
                        int endIndex) {
        if(startIndex > endIndex) {
            return 0;
        }

        if(startIndex == endIndex) {
            return 1;
        }

        int c3 = 0;
        if(dp[startIndex][endIndex] == null) {
            if(string.charAt(startIndex) == string.charAt(endIndex)){
                c3 = 2 + lps_Aux(dp, string, startIndex + 1, endIndex - 1);
            }

            int c1 = lps_Aux(dp, string, startIndex + 1, endIndex);
            int c2 = lps_Aux(dp, string, startIndex, endIndex - 1);
            dp[startIndex][endIndex] = Math.max(c3, Math.max(c1, c2));
        }

        return dp[startIndex][endIndex];
    }

    public static void main(String[] args) {
        P5LongestPalindromicSubTopDown ldown = new P5LongestPalindromicSubTopDown();
        int result = ldown.findLPSLength("ELRMENMET");
        System.out.println(result);
    }
}

package C40ChallengingDynamicProgramming;

public class P7LongestPalindromicSubstring {

    public String longestPalindrome(String s){
        int length = s.length();
        String res= s.substring(0, 1);
        for (int i = 0; i < length; i++) {
            String ps = getPalindrome(s, i, i);
            res = (ps.length() > res.length()) ? ps: res;
            ps = getPalindrome(s, i, i +1);
            res = (ps.length() > res.length()) ? ps : res;
        }
        return res;
    }

    private String getPalindrome(String s, int l, int r) {
        while(l >= 0 && r <s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static void main(String[] args) {
        P7LongestPalindromicSubstring lp = new P7LongestPalindromicSubstring();
        String result = lp.longestPalindrome("BABAD");
        System.out.println(result);
    }
}

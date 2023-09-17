package C17RecursionProblems;

import java.util.Arrays;

public class P2Solution2 {

    public static void main(String[] args) {
        P2Solution2 rec = new P2Solution2();
        OddFunction odd = new OddFunction();

        // String result = rec.reverse("java");

        // int[] arr = {1,2,3,4};
        // int[] arr = {4, 6, 8};
        // boolean result = rec.someRecursive(arr, odd);

        // char result = rec.first("appmillerA");

        String result = rec.capitalizeWord("i love java");

        System.out.println(result);
    }

    public String reverse(String str){
        if(str.isEmpty()){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        return false;
    }

    public boolean someRecursive(int[] arr, OddFunction odd){
        if(arr.length == 0){
            return false;
        } else if(odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }

    public static class OddFunction {
        boolean run(int num) {
            if (num % 2 == 0) {
                return false; }
            else {
                return true;
            }
        }
    }

    public char first(String str) {
        if(str.isEmpty()){
            return ' ';
        }
        if(Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        } else {
            return first(str.substring(1, str.length()));
        }
    }

    public static String capitalizeWord(String str) {
        if(str.isEmpty()){
            return str;
        }
        char chr = str.charAt(str.length() - 1);
        if(str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length() - 2, str.length() - 1).equals(" "))){
            chr = Character.toUpperCase(chr);
        }

        return capitalizeWord(str.substring(0, str.length() - 1)) + Character.toString(chr);
    }
}

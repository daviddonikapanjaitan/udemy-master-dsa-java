package C41RecipeForProblemSolving;

import java.util.HashMap;

public class P1SolveOrSimply {

    public static void main(String[] args) {
        String content = charCount("My name is Elshad");
        System.out.println(content);
    }

    public static String charCount(String str) {
        String result;
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                Character chr = Character.toLowerCase(str.charAt(i));
                if (hashMap.containsKey(chr)) {
                    hashMap.put(chr, hashMap.get(chr) + 1);
                } else {
                    hashMap.put(chr, 1);
                }
            }
        }

        result = hashMap.toString();
        return result;
    }
}

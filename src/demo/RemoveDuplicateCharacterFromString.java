package demo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

    public static String solve(String giv){
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c: giv.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }


        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbccde";
        String ans=solve(input);
        System.out.println(ans);

    }
}

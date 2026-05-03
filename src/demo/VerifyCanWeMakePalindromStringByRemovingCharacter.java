package demo;

public class VerifyCanWeMakePalindromStringByRemovingCharacter {

    public static char solve(String s){

        int n = s.length();

        for (int i = 0; i < n; i++) {

            // remove character at index i
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);

            if (isPalindrome(sb.toString())) {
                return s.charAt(i);
            }
        }

        return 0; // no solution
    }

    private static boolean isPalindrome(String str) {

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static void main(String[] args) {

        String s="cbaab";
        char ans=solve(s);
        System.out.println(ans);
    }


}

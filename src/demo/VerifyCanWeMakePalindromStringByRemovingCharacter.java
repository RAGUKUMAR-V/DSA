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


    public static String solve2(String s){

        int n = s.length();

        for (int i = 0; i < n; i++) {

            // remove character at index i
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);

            if (isPalindrome2(sb)) {
                char anschar=s.charAt(i);
                int mid=(n/2);
                StringBuilder ans = new StringBuilder(s);
                ans.deleteCharAt(i) ;
                ans.insert(mid, anschar);

                return ans.toString();

            }
        }

        return "NA"; // no solution
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

    private static boolean isPalindrome2(StringBuilder str) {

        String original = str.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);

    }

    static void main(String[] args) {

        String s="cbaab";
        String s1="raacacar";
        String s2="xabccba";
        String s3="abccba";



        char ans=solve(s);
        System.out.println(ans);

       String ans1= solve2(s3);
        System.out.println(ans1);
    }


}

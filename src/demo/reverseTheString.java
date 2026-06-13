package demo;

public class reverseTheString {


    public static String solve(String word){

        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }

        return reverse;
    }


    public static void solve2(String input) {

//        input:
//        I AM AUTOMATION ENINEER
//
//        Output:
//        R EE NINENOITAM OTUAMAI


        String[] words = input.split(" ");

        // Store original word lengths
        int[] lengths = new int[words.length];
        StringBuilder merged = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
            merged.append(words[i]);
        }

        // Reverse the merged string
        String reversed = merged.reverse().toString();

        // Reconstruct using original lengths
        StringBuilder result = new StringBuilder();
        int start = 0;

        for (int len : lengths) {
            result.append(reversed, start, start + len).append(" ");
            start += len;
        }

        System.out.println(result.toString().trim());
    }


    public static void main(String[] args) {

        String given="ragukumar";
        String ans=solve(given);
        System.out.println(ans);


        solve2( "I AM AUTOMATION ENINEER");

    }


}

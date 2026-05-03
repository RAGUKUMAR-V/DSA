package demo;

public class reverseTheString {


    public static String solve(String word){

        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }

        return reverse;
    }


    public static void main(String[] args) {

        String given="ragukumar";
        String ans=solve(given);
        System.out.println(ans);

    }


}

package demo;

public class SubArrayPatterMatch {

    public static void solve(String text,String pattern){

        for(int i=0;i<=text.length()-pattern.length();i++){
            if(text.substring(i, i+pattern.length()).equals(pattern)){
                System.out.print(i +" ");
            }
        }

    }

    public static void main(String[] args) {

        String text = "ABAABABAABAA";
        String pattern = "ABA";
        solve(text,pattern);
    }
}

package demo;

public class LongestPlaindromicSubString {

 public static String solve(String given) {

     if (given.length() < 1 || given == null) {
         return "";
     }

     int start = 0, end = 0 ;

     for (int i = 0; i < given.length(); i++) {

        int  len1=expand(given,i,i);
        int  len2=expand(given,i,i+1);

        int len=Math.max(len1,len2);
        if(len>(end-start)){
            start=i-(len-1)/2;
            end=i+len/2;
        }

     }
    return given.substring(start, end+1);

 }


 public static int expand(String s, int left, int right){
     while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
         left--;
         right++;
     }
     return right-left-1;
 }
    static void main(String[] args) {

     String s="rmadamd";

     String ans=solve(s);
     System.out.println(ans);

    }
}

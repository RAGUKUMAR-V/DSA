package demo;

public class ValidPalindrom {

    public static Boolean solve(String s){

        StringBuilder sb = new StringBuilder();
        String proc= s.toLowerCase();
        for(char ch : proc.toCharArray()) {

            if(Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }


      return palindrom(sb.toString());

    }


    public static boolean palindrom(String s){

        int left=0;
        int right=s.length()-1;

        while(left<right){

            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;

    }


    public static void main(String[] args) {

          String s="A man, a plan, a canal: Panama";
         boolean ans= solve(s);
         System.out.println(ans);
    }

}

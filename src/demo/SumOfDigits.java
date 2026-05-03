package demo;

public class SumOfDigits {

    public static int solve(String given){

        int sum=0;

        for(int i=0;i<given.length();i++){

            if(Character.isDigit(given.charAt(i))){
                sum=sum+Character.getNumericValue(given.charAt(i));
            }
        }
        return sum;
    }



    static void main(String[] args) {

        String given="r2agu14kumar55";

       int ans= solve(given);
       System.out.println(ans);




    }
}

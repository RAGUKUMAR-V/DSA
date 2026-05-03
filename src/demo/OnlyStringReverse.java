package demo;

public class OnlyStringReverse {

        public static String solve1(String words){

            StringBuilder ans= new StringBuilder();
            String word="";

            for(int i=0;i<words.length();i++){
                // "1ragu3kum3ar14r"

                if(Character.isDigit(words.charAt(i))) {

                    ans.append(words.charAt(i));

                }

                else{
                    word+=words.charAt(i);
                    if( i==words.length()-1 || Character.isDigit(words.charAt(i+1)) ){
                        String rev= reverse1(word);
                        ans.append(rev);
                        word="";

                    }
                }

            }

            return ans.toString();
        }



        public static String reverse1(String word){

            String reverse="";
            for(int i=word.length()-1;i>=0;i--){
                reverse=reverse+word.charAt(i);
            }

            return reverse;
        }


        public static void main(String[] args) {

            String ans= solve1("r1ragu3kum3ar14r");

            System.out.println(ans);


        }


    }





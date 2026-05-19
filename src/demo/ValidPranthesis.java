package demo;

import java.util.Stack;

public class ValidPranthesis {

    public static boolean solve(String s){

        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

               char top= stack.pop();
                if((ch==')' && top != '(') || (ch==']' && top != '[') || (ch=='}' && top != '{')){
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }


    public static boolean isBalancedQuotes(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Process only quotes
            if (ch == '\'' || ch == '"') {

                // If same quote is on top -> close it
                if (!stack.isEmpty() && stack.peek() == ch) {
                    stack.pop();
                }

                // Otherwise open new quote
                else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }




    static void main(String[] args) {


        String s="{}(){[]}";



        String s1="\"He said 'this is great\"";

        boolean ans=solve(s);
        isBalancedQuotes(s1);
        System.out.println(ans);
        System.out.println( isBalancedQuotes(s1));
    }
}

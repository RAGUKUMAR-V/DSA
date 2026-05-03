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


    static void main(String[] args) {


        String s="{}(){[]}";

        boolean ans=solve(s);
        System.out.println(ans);
    }
}

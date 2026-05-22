package demo;

import java.util.*;

public class LongestValidPranthesis {

    public static String solve(String s){

        Stack<Integer>stack=new Stack<Integer>();

        stack.push(-1);
        int maxlen=0;
        int startind=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){

                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    int curr=i-stack.peek();
                    if(curr>maxlen){
                        maxlen=curr;
                        startind=stack.peek()+1;
                    }
                }

            }

        }

        if(stack.isEmpty()){
            return"";
        }

        return s.substring(startind,startind+maxlen);
    }

    public static void main(String[] args) {

        String s="\")()())\")";
         String ans=solve(s);
         System.out.println(ans);

    }
}

package com.ds.practice;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean checkValidParanthesis(String str){
        char[] ch=str.toCharArray();
        boolean flag=false;
        Stack<Character> stack=new Stack<>();
        int i=0;
       while(i<str.length()){
            if(ch[i]=='('|| ch[i]=='{'|| ch[i]=='['){
                stack.push(ch[i]);
            }
            else {
                    if (!stack.isEmpty() && ch[i] == ')' &&stack.peek()=='(') {
                    stack.pop();
                    } else if (!stack.isEmpty() && ch[i] == '}' && stack.peek() == '{') {
                        stack.pop();
                    }
                    else if (!stack.isEmpty() && ch[i] == ']' && stack.peek() == '[') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            i++;
            }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String params="(){}]";
        System.out.println(checkValidParanthesis(params));
    }
}

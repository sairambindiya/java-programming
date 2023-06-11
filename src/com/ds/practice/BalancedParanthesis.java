package com.ds.practice;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean checkBalancedParanthesis(String str){
        Stack<Character> stack=new Stack<>();
        for(char ca:str.toCharArray()){
            if(isOpenParanthesis(ca)){
                stack.push(ca);
            }
            else if(isClosedParanthesis(ca)){
                if(!stack.isEmpty() && isMatchingPair(stack.peek(),ca)){
                    stack.pop();
                }
                else if(!stack.isEmpty() && isMatchingPair(stack.peek(),ca)){
                    stack.pop();
                }
                else if (!stack.isEmpty() && isMatchingPair(stack.peek(),ca)){
                    stack.pop();
                }

            }
}
        return stack.isEmpty();
    }

    public static boolean isOpenParanthesis(char c){
        if(c=='('|| c=='[' || c=='{'){
            return true;
        }
        return false;
    }

    public static boolean isClosedParanthesis(char c){
        if(c==')'|| c==']'|| c=='}'){
            return true;
        }
        return false;
    }

    public static boolean isMatchingPair(char open, char close){
        if(open=='(' && close==')')
            return true;
        if(open=='[' && close==']')
            return true;
        if(open=='{' && close=='}')
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str="({[])";
        System.out.println(checkBalancedParanthesis(str));

    }
}

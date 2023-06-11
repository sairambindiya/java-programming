package com.ds.practice;

public class ValidPalindrome {
    public static boolean checkValidPalindrome(String input){
        if(input.isEmpty() || input.equals(" "))
            return true;
        else{
            String output=input.trim().replace(" ","").replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            StringBuilder sb=new StringBuilder();
            char[] array=output.toCharArray();
            for(int i=output.toCharArray().length-1;i>=0;i--){
                sb.append(array[i]);
            }
            if(output.equals(sb.toString()))
                return true;
            return false;
        }
    }
    public static void main(String[] args) {

        String input="race a car";
        System.out.println(checkValidPalindrome(input));
    }
}

//String input=" ";
//String input="A man, a plan, a canal: Panama";

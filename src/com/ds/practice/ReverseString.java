package com.ds.practice;

public class ReverseString {
    public static void reverse(char[] input){
        int start=0,end=input.length-1;
        while(start<end){
            char temp=input[start];
            input[start]=input[end];
            input[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
       // String input="hello";
        String input="Haannah";
        char[] array=input.toCharArray();
        reverse(array);
        System.out.println(array);
    }
}

package com.ds.practice;

import java.util.StringTokenizer;

public class LengthOfLastWord {
    public static int findLengthOfLastWord(String inputString){
        String[] numberOfWords=inputString.trim().split(" ");
        return numberOfWords[numberOfWords.length-1].length();
    }
    public static void main(String[] args) {
        //String inputString="   fly me   to   the moon  ";
        //String inputString="Hello World";
        String inputString="luffy is still joyboy";
        System.out.println(findLengthOfLastWord(inputString));
    }
}

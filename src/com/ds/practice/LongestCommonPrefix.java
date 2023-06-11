package com.ds.practice;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] elements){
        if(elements.length==0)
            return "";
        Arrays.sort(elements);
        String first=elements[0];
        String last=elements[elements.length-1];
        int index=0;
        while(index<first.length() && index<last.length()){
            if(first.charAt(index)==last.charAt(index)){
                index++;
            }
            else{
                break;
            }

        }
        return index>0?first.substring(0,index):"";
    }
    public static void main(String[] args) {
       // String[] elements={"geeksforgeeks","geeks","geek","geezer"};
        // String[] elements={"apple","ape","april"};
        String [] elements={"dog","racecar","car"};
        System.out.println(findLongestCommonPrefix(elements));
    }
}

package com.ds.practice;

public class IndexOfFirstOccurence {
    private static int findFirstOccurence(String haystack,String needle){
        if(!haystack.isEmpty() && haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack="leetcode";
        String needle="leeto";
        System.out.println(findFirstOccurence(haystack,needle));
    }
}

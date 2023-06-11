package com.ds.practice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean checkValidAnagram(String firstInput, String secondInput) {
       if(checkLength(firstInput,secondInput)){
        Map<Character, Integer> firstInputMap = new HashMap<>();
        int initialValue = 1;
        for (char key : firstInput.toCharArray()) {
            if (firstInputMap.containsKey(key)) {
                firstInputMap.put(key, firstInputMap.get(key) + 1);
            } else {
                firstInputMap.put(key, initialValue);
            }
        }

        for (char key : secondInput.toCharArray()) {
            if (firstInputMap.containsKey(key)) {
                firstInputMap.put(key, firstInputMap.get(key) - initialValue);
            }
        }

        for (Map.Entry<Character, Integer> eachEntry : firstInputMap.entrySet()) {
            if (eachEntry.getValue() > 0)
                return false;
        }}
       else{
           return false;
       }
        return true;
    }

    public static boolean checkLength(String firstInput, String secondInput){
        if(firstInput.length()==secondInput.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String input1="a";
        String input2="ab";
        System.out.println(checkValidAnagram(input1,input2));
    }
}

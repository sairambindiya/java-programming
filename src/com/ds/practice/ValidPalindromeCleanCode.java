package com.ds.practice;

public class ValidPalindromeCleanCode {
    public static boolean isPalindrome(String input) {
        if (input.isEmpty() || input.isBlank())
            return true;
        else {
            StringBuilder sb = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    sb.append(Character.toLowerCase(c));
                }
            }
            String normalizedInput = sb.toString();
            int left = 0, right = normalizedInput.length() - 1;
            while (left < right) {
                if (normalizedInput.charAt(left) != normalizedInput.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String input=" ";
        String input="A man, a plan, a canal: Panama";
       // String input="race a car";
        System.out.println(isPalindrome(input));
    }
}

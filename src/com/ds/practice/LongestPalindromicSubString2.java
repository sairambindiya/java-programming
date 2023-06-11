package com.ds.practice;

public class LongestPalindromicSubString2 {
        public static String longestPalindrome(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];

            int maxLength = 1;
            int start = 0;

            // All substrings of length 1 are palindromes
            for (int i = 0; i < n; i++) {
                dp[i][i] = true;
            }

            // Check for substrings of length 2
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    dp[i][i + 1] = true;
                    maxLength = 2;
                    start = i;
                }
            }

            // Check for substrings of length greater than 2
            for (int len = 3; len <= n; len++) {
                for (int i = 0; i < n - len + 1; i++) {
                    int j = i + len - 1;

                    if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        if (len > maxLength) {
                            maxLength = len;
                            start = i;
                        }
                    }
                }
            }

            return s.substring(start, start + maxLength);
        }

        public static void main(String[] args) {
           // String input = "babad";
            String input="geeksskeeg";
            System.out.println("Longest palindromic substring: " + longestPalindrome(input));
        }
    }



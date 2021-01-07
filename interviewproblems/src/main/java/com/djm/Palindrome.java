package com.djm;

public class Palindrome {
    
    public static void main(String[] args) {
        
        String word1 = "racecar";
        String word2 = "notracecar";
        System.out.println(word1 + " is a palindrome? " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome? " + isPalindrome(word2));

    }

    
    public static boolean isPalindrome(String word){
        String wordToLower = word.toLowerCase();
        int i = 0;
        int j = word.length() - 1;

        while ( i < j){

            if(wordToLower.charAt(i) != wordToLower.charAt(j)){
                return false;
            }

            i++;
            j--;

        }

        return true;
    }
}

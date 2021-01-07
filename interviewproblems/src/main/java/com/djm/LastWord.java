package com.djm;

public class LastWord {
    
    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "Waffles are the best breakfast";

        System.out.println("The length of the last word of: " + sentence1.toUpperCase() + " is: " + lastWordLength(sentence1));
        System.out.println("The length of the last word of: " + sentence2.toUpperCase() + " is: " + lastWordLength(sentence2));

    }
    public static int lastWordLength(String sentence){
        String[] words = sentence.split(" ");
        return words[words.length -1].length();
    }
}

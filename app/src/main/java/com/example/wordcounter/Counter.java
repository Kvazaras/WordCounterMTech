package com.example.wordcounter;

public class Counter {
    public static int getCharCount(String input){
        if (input == null){
            return -1;
        }
        else {
            return input.length();
        }
    }
    public static int getSpecCount(String input) {
        if (input == null) {
            return -1;
        } else {
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar == '?' || currentChar == '!' || currentChar == '/' || currentChar == '*') {
                    count++;
                }
            }
            return count;
        }
    }
    public static int getWordCount(String input){
        return input.split("\\s").length;
    }
    public static int getSentencesCount(String input){
        int count=0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='.') {
                count++;
            }
        }
        return count;
    }
}
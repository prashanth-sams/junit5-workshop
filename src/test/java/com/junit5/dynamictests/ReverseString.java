package com.junit5.dynamictests;

public class ReverseString {

    // reverse string
    public String reverse(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] chars = input.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    
}

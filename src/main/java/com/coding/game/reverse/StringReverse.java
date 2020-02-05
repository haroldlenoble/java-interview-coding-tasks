package com.coding.game.reverse;

/**
 * StringReverse
 */
public class StringReverse {

    public static String reverse(String text) {
        if(text == null){
            return "";
        }
        char[] tChar = text.toCharArray();
        int n = tChar.length-1;
        char temp ;
        for(int i = 0; i <= n/2; i++){
            temp = tChar[i];
            tChar[i] = tChar[n-i];
            tChar[n-i] = temp;
        }
        return String.valueOf(tChar);
    }
    
}
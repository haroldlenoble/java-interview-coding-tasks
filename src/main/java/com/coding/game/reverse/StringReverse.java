package com.coding.game.reverse;

/**
 * StringReverse
 */
public class StringReverse {

    public static String reverse(String input) {
        if (input == null) {
            return "";
        }
        char[] array = input.toCharArray();
        final int halfLength = array.length / 2;
        int idx2;
        char clipboard;
        for (int idx1 = 0; idx1 < halfLength; idx1++) {
            idx2 = array.length - 1 - idx1;
            clipboard = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = clipboard;
        }
        return String.valueOf(array);
    }

}
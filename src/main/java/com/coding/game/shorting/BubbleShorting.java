package com.coding.game.shorting;

public class BubbleShorting {
    public static void sort(int array[]){
        if(array == null){
            return;
        }

        int length = array.length;
        int clipboard;
        for (int i = 0; i < length; i++){
            for(int j = 1; j < (length - i); j++){
                if(array[j-1] > array[j]){
                    clipboard =  array[j-1];
                    array[j-1] = array[j];
                    array[j] = clipboard;
                }
            }
        }
    }
}

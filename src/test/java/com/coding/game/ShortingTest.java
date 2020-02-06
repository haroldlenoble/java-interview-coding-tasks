package com.coding.game;


import com.coding.game.shorting.BubbleShorting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortingTest {

    @Test
    public void bubbleEmptyArray(){
        BubbleShorting.sort(null);
        BubbleShorting.sort(new int[0]);
    }

    @Test
    public void bubbleOneElementArray(){
        final  int[] array = {20};
        BubbleShorting.sort(array);
        assertEquals(20, array[0]);
    }

    @Test
    public void bubbleManyElementArray(){
        final int[] array = {20,16,14,12,10,6,4,8,2};
        BubbleShorting.sort(array);
        assertEquals(20, array[8]);
        assertEquals(16, array[7]);
        assertEquals(14, array[6]);
        assertEquals(12, array[5]);
        assertEquals(10, array[4]);
        assertEquals(8, array[3]);
        assertEquals(6, array[2]);
        assertEquals(4, array[1]);
        assertEquals(2, array[0]);
    }
}

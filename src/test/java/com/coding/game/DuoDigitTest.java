package com.coding.game;

import static org.junit.Assert.*;

import org.junit.Test;

import com.coding.game.duodigit.DuoDigit;
/**
 * 12, 110, -33333 are duodigits, but 192 is not
 */

public class DuoDigitTest {
    
    @Test
    public void AllTests(){
        assertTrue(DuoDigit.isDuoDigit(12));
        assertTrue(DuoDigit.isDuoDigit(110));
        assertTrue(DuoDigit.isDuoDigit(-33333));
        assertFalse(DuoDigit.isDuoDigit(192));
    }
    
}

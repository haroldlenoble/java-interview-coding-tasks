package com.coding.game;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.coding.game.reverse.StringReverse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringReverseTest {
    @Parameters(name = "({index}): reverse({1})={0}")
    public static Collection data(){
        return Arrays.asList(new Object[][]{
            {"",null},
            {"",""},
            {"a","a"},
            {"1234567890","0987654321"},
            {"aBbA","AbBa"}
        });
    }
    @Parameter(value = 0)
    public String expected;

    @Parameter(value = 1)
    public String input;
    
    @Test
    public void reverse(){
        assertEquals(expected, StringReverse.reverse(input));
    }
    
}
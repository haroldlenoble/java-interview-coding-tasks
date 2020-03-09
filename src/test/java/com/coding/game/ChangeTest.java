package com.coding.game;

import com.coding.game.change.Change;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ChangeTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidArgument(){
        Change.optimalChange(1);
    }

    @Parameterized.Parameters(name = "({index}): change({1})={0}")
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {2,2},
                {3,0},
                {4,4},
                {5,5},
                {6,6},
                {7,7},
                {8,8},
                {9,9},
                {10,10},
                {11,11},
                {12,12},
                {13,13},
                {14,14},
                {15,15},
                {16,16},
                {17,17},
                {18,18},
                {19,19},
                {20,20},
                {21,21}
        });
    }
    @Parameterized.Parameter(value = 1)
    public long expected;

    @Parameterized.Parameter(value = 0)
    public long input;

    @Test
    public void change(){
        Assert.assertEquals(expected, Change.optimalChange(input));
    }

}

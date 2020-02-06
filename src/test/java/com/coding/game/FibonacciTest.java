package com.coding.game;

import static org.junit.Assert.assertEquals;

import com.coding.game.fibonacci.Fibonacci;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FibonacciTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void fibonacci(){
        assertEquals(Fibonacci.recuFib(1), Fibonacci.itFib(1));
        assertEquals(Fibonacci.recuFib(2), Fibonacci.itFib(2));
        assertEquals(Fibonacci.recuFib(3), Fibonacci.itFib(3));
        assertEquals(Fibonacci.recuFib(4), Fibonacci.itFib(4));
        assertEquals(Fibonacci.recuFib(5), Fibonacci.itFib(5));
        assertEquals(Fibonacci.recuFib(6), Fibonacci.itFib(6));
        assertEquals(Fibonacci.recuFib(7), Fibonacci.itFib(7));
        assertEquals(Fibonacci.recuFib(8), Fibonacci.itFib(8));
    }
}

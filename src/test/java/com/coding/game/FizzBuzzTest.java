package com.coding.game;

import com.coding.game.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturn1IfNumberIs1(){
        assertEquals("1", FizzBuzz.evaluate(1, 1));
    }

    @Test
    public void shouldReturn2IfNumberIs2(){
        assertEquals("12", FizzBuzz.evaluate(1, 2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3(){
        assertEquals("12Fizz", FizzBuzz.evaluate(1, 3));
    }

    @Test
    public void shouldReturnFizzIsNumberIs6(){
        assertEquals("12Fizz4BuzzFizz", FizzBuzz.evaluate(1, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5(){
        assertEquals("12Fizz4Buzz", FizzBuzz.evaluate(1, 5));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15(){
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", FizzBuzz.evaluate(1, 15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30(){
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz", FizzBuzz.evaluate(1, 30));
    }

    @Test
    public void shouldReturnFizzBuzz1IfNumbersAre15And1(){
        assertEquals("FizzBuzz1", FizzBuzz.evaluate(15, 1));
    }

}

package com.coding.game.fizzbuzz;

public class FizzBuzz {

    public static String evaluate(int min, int max){
        return evaluateNumbers(min, max);
    }

    private static String evaluateNumbers(int min, int max) {
        String result = evaluateNumber(min);
        if(min > max )
            result += evaluateNumber(max);
        while(min < max){
            result += evaluateNumber(++min);
        }
        return result;
    }

    private static String evaluateNumber(int number) {
        if(number % 15 == 0)
            return  "FizzBuzz";
        if(number % 3 == 0)
            return  "Fizz";
        if(number % 5 == 0)
            return  "Buzz";
        return String.valueOf(number);
    }
}

package com.coding.game.duodigit;

import java.util.HashSet;
import java.util.Set;

public class DuoDigit {
    

    public static boolean isDuoDigit(int number){

        number  = Math.abs(number);

        if (number < 10) {
            return false;
        }
    
        Set<Character> digitSet = new HashSet<>();
        
        for (char digit : String.valueOf(number).toCharArray()) {
            digitSet.add(digit);
            if (digitSet.size() > 2) {
                return false;
            }
        }
    
        return true;
    }
    
}

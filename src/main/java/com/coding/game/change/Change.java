package com.coding.game.change;

/**
 * Rendre la monnaie de manière optimal suivant un systeme de
 * Bill 10
 * Bill 5
 * Coin 2
 */

public class Change {

    static long coin2 = 0;
    static long bill5 = 0;
    static long bill10 = 0;

    public Change(){
        coin2 = 0;
        bill5 = 0;
        bill10 = 0;
    }

    public static long optimalChange(long amount){
        if(amount < 2) {
            throw new IllegalArgumentException("The amount must be >= 2");
        }
        Change c = new Change();
        long rest = amount;
        c.bill10 = amount / 10;
        rest = amount % 10;

        if(rest < 5 && rest %2 != 0){
            if(c.bill10 > 0){
                c.bill10--;
                rest = rest + 10;
            }
        }
        c.bill5 = rest / 5;
        rest = rest % 5;

        if(rest != 0 && rest % 2 != 0){
            if(c.bill5 > 0 ){
                c.bill5--;
                rest = rest + 5;
            }
        }
        if(rest % 2 == 0){
            c.coin2 = rest / 2 ;
        }
        System.out.println(c.toString() + " => "+amount);
        return c.sum();
    }

    private static long sum(){
        return 2*coin2 + 5*bill5 + 10*bill10;
    }

    @Override
    public String toString(){
        return "[coin2="+coin2+"; bill5="+bill5+"; bill10="+bill10+"]";
    }
}

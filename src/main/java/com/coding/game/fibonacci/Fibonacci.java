package com.coding.game.fibonacci;

/**
 * Fibonacci
 */
public class Fibonacci {

    /**
     * This algorithm can be slow and lead ti StackOverFlow error
     * @param n
     * @return
     */
    public static int recuFib(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The parameter must be >= 1.");
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return recuFib(n - 1) + recuFib(n - 2);
        }
    }
    /**
     * This algorithm is more safe and fast than the first one
     * @param n
     * @return
     */
    public static int itFib(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The parameter must be >= 1.");
        }
        int n1 = 1, n2 = 1, n3 = 1;
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

}
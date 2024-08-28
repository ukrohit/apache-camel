package org.problemsolving;

import java.time.LocalTime;

public class SumNNaturalNumber {

    public static void main(String[] args) {

        System.out.println("This is my first demo brnach  name changes ");

        int n = 9;

        System.out.println("Start time " + LocalTime.now());
        int sum = sum(n);

        System.out.println("Sum using for loop " + sum);
        System.out.println("End  time " + LocalTime.now());

        System.out.println("Start time " + LocalTime.now());
        int sum2 = sumFormula(n);

        System.out.println("sum using formula " + sum2);

        System.out.println("Start time " + LocalTime.now());
    }

    private static int sumFormula(int n) {
         return n * ((n + 1) / 2);

    }


    private static int sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

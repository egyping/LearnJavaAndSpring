package org.amigoscode;

import java.math.BigDecimal;

public class MoneyInAction {
    public static void main(String[] args) {

        double num1 = 0.80;
        double num2 = 0.79;
        System.out.println(num1 - num2);
        // instead of 0.01 it print 0.010000000000000009

        Double num3 = 0.80;
        Double num4 = 0.79;
        System.out.println(num1 - num2);
        // instead of 0.01 it print 0.010000000000000009

        BigDecimal num5 = new BigDecimal("0.80");
        BigDecimal num6 = new BigDecimal("0.79");
        // System.out.println(num5 - num6); // this wont work
        System.out.println(num5.subtract(num6));
        // 0.01

        System.out.println(num5.compareTo(num6));
        // 1 as num5 > num6 , -1 less , 0 equal

    }
}

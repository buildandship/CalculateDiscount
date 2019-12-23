package com.cdkglobal;

import com.cdkglobal.calculator.DiscountCalculator;
import com.cdkglobal.criteria.DiscountSlab;
import com.cdkglobal.enums.CustomerType;

import java.util.List;

/***
 * Created by praveen on 14/12/19 for CalculateDiscount
 * Driver class to run the program
 */
public class Main {

    public static void main(String[] args) {

        // Slabs
        List<DiscountSlab> slabs = List.of(
                new DiscountSlab(CustomerType.REGULAR, 10000, 0.2),
                new DiscountSlab(CustomerType.REGULAR, 5000, 0.1)
        );



/*
        List<DiscountSlab> slabs = List.of(
                new DiscountSlab(CustomerType.REGULAR, 5000, 0.1),
                new DiscountSlab(CustomerType.REGULAR, 10000, 0.2)

        );
*/


        DiscountCalculator calculator = new DiscountCalculator(slabs);

        System.out.println(calculator.calculateBillingAmount(5000));
        System.out.println(calculator.calculateBillingAmount(10000));
        System.out.println(calculator.calculateBillingAmount(15000));
    }
}

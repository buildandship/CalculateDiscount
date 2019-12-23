package com.cdkglobal.calculator;

import com.cdkglobal.criteria.DiscountSlab;
import com.cdkglobal.enums.CustomerType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Created by praveen on 15/12/19 for CalculateDiscount
 * This test class is used to calculate the Billing Amount depending on the various discount slabs
 */
class DiscountCalculatorTest {

    private DiscountCalculator calculator = null;
    @BeforeEach
    void init(){

        List<DiscountSlab> slabs = List.of(
                new DiscountSlab(CustomerType.REGULAR, 10000, 0.2),
                new DiscountSlab(CustomerType.REGULAR, 5000, 0.1)
        );
        calculator = new DiscountCalculator(slabs);
    }

    @Test
    @DisplayName("Calculate Billing Amount based on discount slab")
    void testCalculateBillingAmount() {
        assertAll(
                () -> assertEquals(0, calculator.calculateBillingAmount(-1)),
                () -> assertEquals(0, calculator.calculateBillingAmount(0)),
                () -> assertEquals(1000, calculator.calculateBillingAmount(1000)),
                () -> assertEquals(5000, calculator.calculateBillingAmount(5000)),
                () -> assertEquals(9500, calculator.calculateBillingAmount(10000)),
                () -> assertEquals(13500, calculator.calculateBillingAmount(15000)),
                () -> assertEquals(17500, calculator.calculateBillingAmount(20000))

        );
    }

    @AfterEach
    void cleanup(){
        calculator=null;
    }

}
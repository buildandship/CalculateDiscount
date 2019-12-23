package com.cdkglobal.criteria;

import com.cdkglobal.enums.CustomerType;

/***
 * Created by praveen on 15/12/19 for CalculateDiscount
 */
public class DiscountSlab {

    private CustomerType customerType;
    private long discountMinimumAmount;
    private double discountPercentage;

    public CustomerType getCustomerType() {
        return customerType;
    }

    public long getDiscountMinimumAmount() {
        return discountMinimumAmount;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public DiscountSlab(CustomerType customerType, long discountMinimumAmount, double discountPercentage) {
        this.customerType = customerType;
        this.discountMinimumAmount = discountMinimumAmount;
        this.discountPercentage = discountPercentage;
    }
}

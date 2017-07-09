package com.crow.Beverages;

/**
 * Created by CrowHawk on 17/7/10.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

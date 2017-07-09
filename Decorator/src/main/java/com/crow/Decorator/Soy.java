package com.crow.Decorator;

import com.crow.Beverages.Beverage;

/**
 * Created by CrowHawk on 17/7/10.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    public double cost() {
        return .25 + beverage.cost();
    }
}

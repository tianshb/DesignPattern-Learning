package com.crow.Decorator;

import com.crow.Beverages.Beverage;

/**
 * Created by CrowHawk on 17/7/10.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return .18 + beverage.cost();
    }
}

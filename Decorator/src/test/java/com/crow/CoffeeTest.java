package com.crow;

import com.crow.Beverages.Beverage;
import com.crow.Beverages.Espresso;
import com.crow.Beverages.HouseBlend;
import com.crow.Decorator.Mocha;
import com.crow.Decorator.Soy;
import com.crow.Decorator.Whip;

/**
 * Created by CrowHawk on 17/7/10.
 */
public class CoffeeTest {
    public static void main(String args[]) {//计算不同饮料加不同调料的价格
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);//Espresso里加双份Mocha
        beverage = new Whip(beverage);//再加Whip
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}

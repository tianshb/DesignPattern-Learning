package com.crow.Decorator;

import com.crow.Beverages.Beverage;

/**
 * Created by CrowHawk on 17/7/10.
 */
public class Mocha extends CondimentDecorator {//Mocha是一个装饰者
    Beverage beverage;//用实例变量记录饮料，也就是被装饰者

    public Mocha(Beverage beverage) {//将饮料当作构造器参数，使被装饰者记录到实例变量中
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {//计算带Mocha饮料的价钱
        return .20 + beverage.cost();
    }
}

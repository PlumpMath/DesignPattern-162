package yzs.designpattern.strategy;

import yzs.designpattern.strategy.impl.FlyNoWay;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  19:25
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }
}

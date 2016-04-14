package yzs.designpattern.strategy;

import yzs.designpattern.strategy.impl.FlyingStragety;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  19:16
 */
public class Duck {
    private FlyingStragety flyingStragety;

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }

    public void fly(){
        flyingStragety.performFly();
    }
}

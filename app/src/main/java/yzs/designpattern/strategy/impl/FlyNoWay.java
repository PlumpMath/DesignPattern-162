package yzs.designpattern.strategy.impl;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  19:24
 */
public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("No fly");
    }
}

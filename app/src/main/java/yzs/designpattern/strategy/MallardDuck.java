package yzs.designpattern.strategy;

import yzs.designpattern.strategy.impl.FlyWithWin;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  19:19
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }
}

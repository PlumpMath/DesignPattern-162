package yzs.designpattern.Templage;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  20:48
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入牛奶");
    }
}

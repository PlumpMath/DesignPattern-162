package yzs.designpattern.strategy;

/**
 * Des：策略模式
 * 注：   组合 优先于继承
 * 使用场景：    1.许多相关的类仅仅是行为差异
 *             2.行为仅需要一种算法变体
 *             3.if else 的替代
 * creat by Zishu.Ye on 2016/4/14  19:17
 */
public class Test {
    public static void main(String[] args){
        new MallardDuck().fly();
        new RubberDuck().fly();
    }
}

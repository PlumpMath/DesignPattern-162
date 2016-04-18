package yzs.designpattern.proxy;

/**
 * Des：继承方式 实现静态代理
 * creat by Zishu.Ye on 2016/4/14  10:29
 */
public class Car2 extends Car {

    @Override
    public void move() {
        long strTime=System.currentTimeMillis();
        System.out.println("start");

        super.move();

        long endTime=System.currentTimeMillis();
        System.out.println("end  cost"+(endTime-strTime)+"ms");
    }
}

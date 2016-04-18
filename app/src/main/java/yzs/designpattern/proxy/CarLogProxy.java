package yzs.designpattern.proxy;

/**
 * Des：聚合方式 实现静态代理
 * creat by Zishu.Ye on 2016/4/14  10:41
 */
public class CarLogProxy implements Moveable {

    private Moveable moveable;


    public CarLogProxy(Moveable moveable){
        super();
        this.moveable=moveable;
    }

    @Override
    public void move() {
        long strTime=System.currentTimeMillis();
        System.out.println("log start");

        moveable.move();

        long endTime=System.currentTimeMillis();
        System.out.println("log end  cost"+(endTime-strTime)+"ms");
    }
}

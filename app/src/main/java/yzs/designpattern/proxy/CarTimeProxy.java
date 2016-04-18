package yzs.designpattern.proxy;

/**
 * Des：聚合方式 实现静态代理
 * creat by Zishu.Ye on 2016/4/14  10:32
 */
public class CarTimeProxy implements Moveable {
    private Moveable moveable;



    public CarTimeProxy(Moveable moveable){
        super();
        this.moveable=moveable;
    }

    @Override
    public void move() {
        long strTime=System.currentTimeMillis();
        System.out.println("start");

        moveable.move();

        long endTime=System.currentTimeMillis();
        System.out.println("end  cost"+(endTime-strTime)+"ms");
    }
}

package yzs.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import yzs.designpattern.proxy.jdkproxy.TimeHandler;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  10:26
 */
public class Client {

    public static void main(String[] args) {

        //静态代理

//        继承方式
//        new Car2().move();
//        聚合方式
//        new CarTimeProxy(new Car()).move();
//        Car car =new Car();
//        CarTimeProxy ctp=new CarTimeProxy(car);
//        CarLogProxy clp=new CarLogProxy(ctp);
//        clp.move();

        //jdk 动态代理
        InvocationHandler timeHandler=new TimeHandler(new Car());
        Class<?> cls=Car.class;
        Moveable moveable=(Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),timeHandler);
        moveable.move();


    }
}

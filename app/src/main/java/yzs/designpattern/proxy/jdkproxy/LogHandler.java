package yzs.designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  11:16
 */
public class LogHandler implements InvocationHandler {

    private Object object;

    public LogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        long strTime=System.currentTimeMillis();
        System.out.println("log start");

        method.invoke(object);

        long endTime=System.currentTimeMillis();
        System.out.println("log end  cost"+(endTime-strTime)+"ms");

        return null;
    }
}

package yzs.designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  11:01
 */
public class TimeHandler implements InvocationHandler {

    private Object object;

    public TimeHandler(Object object) {
        this.object = object;
    }

    /**
     * @param o         被代理对象
     * @param method    被代理方法
     * @param objects   方法的参数
     * @return 方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        long strTime=System.currentTimeMillis();
        System.out.println("start");

        method.invoke(object);

        long endTime=System.currentTimeMillis();
        System.out.println("end  cost"+(endTime-strTime)+"ms");
        return null;
    }
}

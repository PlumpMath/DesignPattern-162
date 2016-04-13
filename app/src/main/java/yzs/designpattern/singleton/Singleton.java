package yzs.designpattern.singleton;

/**
 * 单例模式  恶汉模式
 * 加载慢，运行快      线程安全
 * Created by 叶子叔 on 2016/4/13.
 */
public class Singleton {

    private static Singleton singleton=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }


}

package yzs.designpattern.singleton;



/**
 * 单例模式 懒汉模式
 * 加载比较快，运行比较慢
 * Created by 叶子叔 on 2016/4/13.
 */
public class SingletonLay {

    private static SingletonLay singletonLay;

    private SingletonLay(){}

    // synchornized 标记为线程安全
    public static synchronized SingletonLay getInstance(){
        if(singletonLay==null){
            singletonLay=new SingletonLay();
        }
        return singletonLay;
    }
}

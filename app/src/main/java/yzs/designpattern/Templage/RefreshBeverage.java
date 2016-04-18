package yzs.designpattern.Templage;

/**
 * Des：抽象积累，为所有子类提供算法框架
 *      提神饮料
 * creat by Zishu.Ye on 2016/4/14  20:35
 */
public abstract class RefreshBeverage {

    /**
     * 制备饮料的模版方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplage(){
        bilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 将水煮沸
     */
    private void bilWater(){
        System.out.println("将水煮沸");
    }

    /**
     * 把饮料倒入杯中
     */
    private void pourInCup(){
        System.out.println("把饮料倒入杯中");
    }

    /**
     *  制作饮料
     */
    protected abstract void brew();

    /**
     * 加入调味料
     */
    protected abstract void addCondiments();

}

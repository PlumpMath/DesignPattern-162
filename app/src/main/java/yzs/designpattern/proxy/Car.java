package yzs.designpattern.proxy;

import java.util.Random;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  10:15
 */
public class Car implements Moveable {
    @Override
    public void move() {

        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

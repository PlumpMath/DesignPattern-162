package yzs.designpattern.factory.abs;

/**
 * Created by 叶子叔 on 2016/4/13.
 */
public class McFactory implements PersonFactory{
    @Override
    public Boy getBoy() {
        return new McBoy();
    }

    @Override
    public Girl getGirl() {
        return new McGirl();
    }
}

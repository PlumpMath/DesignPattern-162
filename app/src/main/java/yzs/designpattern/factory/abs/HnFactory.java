package yzs.designpattern.factory.abs;

/**
 * Created by 叶子叔 on 2016/4/13.
 */
public class HnFactory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HnBoy();
    }

    @Override
    public Girl getGirl() {
        return new HnGirl();
    }
}

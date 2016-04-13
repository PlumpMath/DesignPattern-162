package yzs.designpattern.factory;

import yzs.designpattern.factory.abs.Girl;
import yzs.designpattern.factory.abs.HnFactory;
import yzs.designpattern.factory.abs.McFactory;
import yzs.designpattern.factory.abs.PersonFactory;

/**
 * Created by 叶子叔 on 2016/4/13.
 */
public class Test {
    public static void main(String[] args){
        PersonFactory factory=new McFactory();
        Girl girl=factory.getGirl();
        girl.drawGirl();

        new HnFactory().getBoy().drawBoy();
    }
}

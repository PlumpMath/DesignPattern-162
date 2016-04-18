package yzs.designpattern.cor;

import yzs.designpattern.cor.handler.PriceHandlerFactory;

/**
 * Des：责任链 模式 测试类
 * creat by Zishu.Ye on 2016/4/14  16:34
 */
public class Test {

    public static void main(String[] args){
        Customer customer=new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        customer.requestDiscount(0.01f);
    }

}

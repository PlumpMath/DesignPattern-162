package yzs.designpattern.cor;

import yzs.designpattern.cor.handler.PriceHandler;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  16:36
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    /**
     * 发起打折请求
     * @param discount   折扣
     */
    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }
}

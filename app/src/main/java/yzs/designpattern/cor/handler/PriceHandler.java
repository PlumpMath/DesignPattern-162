package yzs.designpattern.cor.handler;

/**
 * Des：价格处理器
 * creat by Zishu.Ye on 2016/4/14  16:22
 */
public abstract class PriceHandler {


    /**
     * 直接后继 用于传递处理
     */
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理结构申请
     * @param discount  折扣
     */
    public abstract void processDiscount(float discount);



}

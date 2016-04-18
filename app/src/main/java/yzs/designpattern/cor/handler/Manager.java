package yzs.designpattern.cor.handler;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  16:30
 */
public class Manager extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if(discount<=0.2)
            System.out.format("%s批准了折扣：%.2f%n"
                    ,this.getClass().getName(),discount);
        else
            successor.processDiscount(discount);
    }
}

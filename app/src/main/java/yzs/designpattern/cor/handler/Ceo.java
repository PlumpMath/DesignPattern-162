package yzs.designpattern.cor.handler;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  16:30
 */
public class Ceo extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount<=0.5)
            System.out.format("%s批准了折扣：%.2f%n"
                    ,this.getClass().getName(),discount);
        else
            System.out.format("%s拒绝了折扣：%.2f%n"
                    ,this.getClass().getName(),discount);
    }
}

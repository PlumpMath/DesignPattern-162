package yzs.designpattern.cor.handler;

/**
 * Des：
 * creat by Zishu.Ye on 2016/4/14  16:51
 */
public class PriceHandlerFactory {

    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler ceo = new Ceo();

        sales.setSuccessor(manager);
        manager.setSuccessor(ceo);
        return sales;
    }
}
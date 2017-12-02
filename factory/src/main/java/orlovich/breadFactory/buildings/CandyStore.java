package orlovich.breadFactory.buildings;

import orlovich.breadFactory.produces.Produce;


public class CandyStore {

    public int getMoneyAfterSellProduce(Produce produce) {

        return produce.getCost();
    }
}

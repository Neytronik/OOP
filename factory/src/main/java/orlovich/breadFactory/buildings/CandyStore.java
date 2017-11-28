package orlovich.breadFactory.buildings;

import orlovich.breadFactory.produces.Produce;

public class CandyStore {


    public int sellProduce(Produce produce) {

        return produce.cost();

    }

}

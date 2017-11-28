package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.wheatFlWeight;


public class WheatFlour extends Flour {

    private static final int PURCHASE_PRISE = 1;


    @Override
    public int purchasePrise() {
        return PURCHASE_PRISE;
    }

    public WheatFlour() {
        super(2);
    }

    @Override
    public void addFlour(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal argument for add weight flour");
        wheatFlWeight += piece;
    }

    @Override
    public void takeFlour(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal weight flour");
        if (piece > wheatFlWeight)
            throw new IllegalArgumentException("Not enough flour");
        wheatFlWeight -= piece;
    }

}


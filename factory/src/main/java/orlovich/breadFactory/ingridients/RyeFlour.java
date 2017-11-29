package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.ryeFlWeight;

public class RyeFlour extends Flour {
    private static final int PURCHASE_PRISE = 2;

    @Override
    public int getPurchasePrise() {
        return PURCHASE_PRISE;
    }

    public RyeFlour() {
        super(4);
    }

    @Override
    public void addFlour(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal argument for add weight flour");
        ryeFlWeight += piece;
    }

    public void takeFlour(int piece) {

        if (piece < 0)
            throw new IllegalArgumentException("Illegal weight flour");
        if (piece > ryeFlWeight)
            throw new IllegalArgumentException("Not enough flour");
        ryeFlWeight -= piece;
    }

}

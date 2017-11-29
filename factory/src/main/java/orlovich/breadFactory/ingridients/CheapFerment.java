package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.cheapFerWeight;

public class CheapFerment extends Ferment {
    private static final int PURCHASE_PRISE = 1;

    @Override
    public int getPurchasePrise() {
        return PURCHASE_PRISE;
    }

    public CheapFerment() {
        super(2);
    }

    @Override
    public void addFerment(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal argument for add weight ferment");
        cheapFerWeight += piece;
    }

    @Override
    public void takeFerment(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal weight Ferment");
        if (piece > cheapFerWeight)
            throw new IllegalArgumentException("Not enough Ferment");
        cheapFerWeight -= piece;
    }

}

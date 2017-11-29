package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.expensiveFerWeight;

public class ExpensiveFerment extends Ferment {


    private static final int PURCHASE_PRISE = 2;

    @Override
    public int getPurchasePrise() {
        return PURCHASE_PRISE;
    }

    public ExpensiveFerment() {
        super(4);
    }

    @Override
    public void addFerment(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal argument for add weight ferment");
        expensiveFerWeight += piece;
    }

    @Override
    public void takeFerment(int piece) {
        if (piece < 0)
            throw new IllegalArgumentException("Illegal weight Ferment");
        if (piece > expensiveFerWeight)
            throw new IllegalArgumentException("Not enough Ferment");
        expensiveFerWeight -= piece;
    }

}

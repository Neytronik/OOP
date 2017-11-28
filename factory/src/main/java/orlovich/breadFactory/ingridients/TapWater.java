package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.tapWaterVolume;

public class TapWater extends Water {
    private static final int PURCHASE_PRISE = 1;


    @Override
    public int purchasePrise() {
        return PURCHASE_PRISE;
    }

    public TapWater() {
        super(2);
    }


    @Override
    public void addWater(int ml) {
        if (ml < 0)
            throw new IllegalArgumentException("Illegal argument for add water");
        tapWaterVolume += ml;
    }

    @Override
    public void pourWater(int ml) {
        if (ml < 0)
            throw new IllegalArgumentException("Illegal volume water");
        if (ml > tapWaterVolume)
            throw new IllegalArgumentException("Not enough water");
        tapWaterVolume -= ml;

    }

}

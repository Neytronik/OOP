package orlovich.breadFactory.ingridients;

import static orlovich.breadFactory.buildings.Storage.wellWaterVolume;


public class WellWater extends Water {

    private static final int PURCHASE_PRISE = 2;

    @Override
    public int getPurchasePrise() {
        return PURCHASE_PRISE;
    }

    public WellWater() {
        super(4);
    }

    @Override
    public void addWater(int ml) {
        if (ml < 0)
            throw new IllegalArgumentException("Illegal argument for add water");
        wellWaterVolume += ml;
    }

    @Override
    public void pourWater(int ml) {
        if (ml < 0)
            throw new IllegalArgumentException("Illegal volume water");
        if (ml > wellWaterVolume)
            throw new IllegalArgumentException("Not enough water");
        wellWaterVolume -= ml;

    }

}

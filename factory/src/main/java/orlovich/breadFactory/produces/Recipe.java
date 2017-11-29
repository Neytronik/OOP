package orlovich.breadFactory.produces;

import orlovich.breadFactory.ingridients.*;

public enum Recipe {

    RECIPE_ONE(new WheatFlour(), new CheapFerment(), new TapWater()),
    RECIPE_TWO(new WheatFlour(), new ExpensiveFerment(), new WellWater()),
    RECIPE_THREE(new RyeFlour(), new CheapFerment(), new TapWater()),
    RECIPE_FOUR(new RyeFlour(), new CheapFerment(), new WellWater()),
    RECIPE_FIVE(new RyeFlour(), new ExpensiveFerment(), new WellWater());

    Flour fl;
    Water wtr;
    Ferment frm;

    Recipe(Flour fl, Ferment frm, Water wtr) {
        this.fl = fl;
        this.frm = frm;
        this.wtr = wtr;
    }

    public int getCostDough() {
        return fl.price + wtr.price + frm.price;
    }

}

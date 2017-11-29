package orlovich.breadFactory.gameShop;


import orlovich.breadFactory.equipment.BreadMaker;
import orlovich.breadFactory.ingridients.Ferment;
import orlovich.breadFactory.ingridients.Flour;
import orlovich.breadFactory.ingridients.Water;
import orlovich.breadFactory.workers.Baker;
import orlovich.property.gamer.User;
import orlovich.property.userException.UnitExceedingLimitException;

import static orlovich.breadFactory.buildings.Factory.*;

public class GameShop {

    public static void hireBaker(String name) {
        try {
            bakers.put(name, new Baker(name));
        } catch (UnitExceedingLimitException r) {
            System.out.println("maximum amount units");
        }
    }

    public static void buyBreadMaker() {
        String id = "BM" + (countBreadMakers + 1);
        try {
            breadMakers.put(id, new BreadMaker(id));
        } catch (UnitExceedingLimitException r) {
            System.out.println("maximum amount units");
        }
    }


    public static void buyFerment(Ferment ferment, int tale) {
        User.Purse.MONEY.takeMoney(ferment.getPurchasePrise() * tale);
        ferment.addFerment(tale);
    }

    public static void buyFlour(Flour flour, int tale) {
        User.Purse.MONEY.takeMoney(flour.getPurchasePrise() * tale);
        flour.addFlour(tale);
    }

    public static void buyWater(Water water, int liter) {
        User.Purse.MONEY.takeMoney(water.getPurchasePrise() * liter);
        water.addWater(liter);
    }


}

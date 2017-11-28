package orlovich.breadFactory.equipment;

import orlovich.breadFactory.produces.Bread;
import orlovich.breadFactory.produces.Dough;
import orlovich.property.userException.UnitExceedingLimitException;

import static orlovich.breadFactory.buildings.Factory.MAX_BREAD_MAKER;
import static orlovich.breadFactory.buildings.Factory.countBreadMakers;

public class BreadMaker {

    public int bakingTime = 200;

    public BreadMaker(String id) {
        if (countBreadMakers == MAX_BREAD_MAKER) {
            throw new UnitExceedingLimitException();
        }
        countBreadMakers++;
    }

    public Bread bake(Dough dough) {
        return new Bread(dough);
    }
}

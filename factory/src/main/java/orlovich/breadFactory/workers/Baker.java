package orlovich.breadFactory.workers;

import orlovich.breadFactory.produces.Dough;
import orlovich.breadFactory.produces.Recipe;
import orlovich.property.userException.UnitExceedingLimitException;

import static orlovich.breadFactory.buildings.Factory.MAX_WORKERS;
import static orlovich.breadFactory.buildings.Factory.countBakers;

public class Baker {

    String name;

    public int timeKnead = 15;

    public Baker(String name) {
        if (countBakers == MAX_WORKERS) {
            throw new UnitExceedingLimitException();
        }
        countBakers++;
    }

    public Dough kneadDough(Recipe r) {
        return new Dough(r);
    }

}
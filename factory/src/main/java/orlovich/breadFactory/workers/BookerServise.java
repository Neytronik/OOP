package orlovich.breadFactory.workers;

import orlovich.property.gamer.User;

import static orlovich.breadFactory.buildings.Factory.BAKER_SALARY;
import static orlovich.breadFactory.buildings.Factory.countBakers;

public class BookerServise {

    public static void salaryDay() {
        User.Purse.MONEY.takeMoney(countBakers * BAKER_SALARY);
    }
}

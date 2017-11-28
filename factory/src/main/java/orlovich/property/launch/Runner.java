package orlovich.property.launch;

import orlovich.breadFactory.buildings.Storage;
import orlovich.breadFactory.gameShop.GameShop;
import orlovich.breadFactory.ingridients.ExpensiveFerment;
import orlovich.breadFactory.ingridients.RyeFlour;
import orlovich.breadFactory.ingridients.WheatFlour;
import orlovich.property.gamer.User;

public class Runner {

    public static void main(String[] args) {

        User user = User.createUser("Artem");

        User.Purse.MONEY.addMoney(87);

        System.out.println("userName :" + user.getUserName() + "\nmoney : " +
                User.Purse.MONEY.showMoney());


        GameShop.SERVICE.buyFlour(new WheatFlour(), 15);
        GameShop.SERVICE.buyFlour(new RyeFlour(), 20);
        GameShop.SERVICE.buyFerment(new ExpensiveFerment(), 10);

        Storage.showStorage();


    }
}

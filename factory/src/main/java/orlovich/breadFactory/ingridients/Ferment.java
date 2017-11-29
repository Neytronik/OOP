package orlovich.breadFactory.ingridients;

/**
 * @author Orlovich_Artem
 */

//метод добавление будет использоваться в сервисе магазина
//методы взятия в замесе теста пекарем

public abstract class Ferment implements Ingridient {

    public int price;

    Ferment(int price) {
        this.price = price;
    }

    public abstract void addFerment(int piece);

    public abstract void takeFerment(int piece);

    public abstract int getPurchasePrise();

}

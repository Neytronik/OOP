package orlovich.breadFactory.ingridients;

public abstract class Flour implements Ingridient {

    public int price;

    public Flour(int price) {
        this.price = price;
    }

    public abstract void addFlour(int piece);

    public abstract void takeFlour(int piece);

    public abstract int getPurchasePrise();

}

package orlovich.breadFactory.ingridients;

public abstract class Water implements Ingridient {
    public int price;

    public Water(int price) {
        this.price = price;
    }

    public abstract void addWater(int ml);

    public abstract void pourWater(int ml);

    public abstract int purchasePrise();

}

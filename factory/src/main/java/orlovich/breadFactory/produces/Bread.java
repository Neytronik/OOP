package orlovich.breadFactory.produces;

public class Bread implements Produce {

    Dough dough;

    public Bread(Dough dough) {
        this.dough = dough;
    }

    public int getCost() {
        return dough.getCost() + 10;
    }


}

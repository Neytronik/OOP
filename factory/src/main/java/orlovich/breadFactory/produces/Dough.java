package orlovich.breadFactory.produces;

public class Dough implements Produce {

    private Recipe r;

    public Dough(Recipe r) {
        this.r = r;
    }

    public int getCost() {
        return r.getCostDough();
    }


}

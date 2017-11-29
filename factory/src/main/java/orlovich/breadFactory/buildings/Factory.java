package orlovich.breadFactory.buildings;

import orlovich.breadFactory.equipment.BreadMaker;
import orlovich.breadFactory.workers.Baker;

import java.util.HashMap;

public class Factory {

    private Factory() {
    }

    public final static int MAX_WORKERS = 4;
    public final static int MAX_BREAD_MAKER = 4;
    public final static int BAKER_SALARY = 40;
    public static int countBakers = 0;
    public static int countBreadMakers = 0;

    public static HashMap<String, Baker> bakers = new HashMap<>(MAX_WORKERS);
    public static HashMap<String, BreadMaker> breadMakers = new HashMap<>(MAX_BREAD_MAKER);

}
package orlovich.breadFactory.buildings;

import orlovich.breadFactory.produces.Produce;

import java.util.ArrayList;

public class Storage {

    public static ArrayList<Produce> produces = new ArrayList<>();

    public static int wheatFlWeight = 0;
    public static int ryeFlWeight = 0;
    public static int tapWaterVolume = 0;
    public static int wellWaterVolume = 0;
    public static int cheapFerWeight = 0;
    public static int expensiveFerWeight = 0;


    public static void showStorage() {

        System.out.println("wheatFlWeight = " + wheatFlWeight +
                "\nryeFlWeight = " + ryeFlWeight +
                "\ntapWaterVolume = " + tapWaterVolume +
                "\nwellWaterVolume = " + wellWaterVolume +
                "\ncheapFerWeight = " + cheapFerWeight +
                "\nexpensiveFerWeight = " + expensiveFerWeight
        );
    }
}


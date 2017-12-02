package orlovich.breadFactory.buildings;

import orlovich.breadFactory.myUtility.Conservator;
import orlovich.breadFactory.produces.Produce;

public class Storage {

    public static Conservator<Produce> produces = new Conservator<>();

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


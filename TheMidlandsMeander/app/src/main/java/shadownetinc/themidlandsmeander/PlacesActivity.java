package shadownetinc.themidlandsmeander;

import java.util.Random;

public class PlacesActivity
{

    private static final Random RANDOM = new Random();

    public static int getRandomPlacesDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.the_bend;
            case 1:
                return R.drawable.the_bend;
            case 2:
                return R.drawable.the_bend;
            case 3:
                return R.drawable.the_bend;
            case 4:
                return R.drawable.the_bend;
        }
    }

    public static final String[] sPlacesStrings =
            {
            "The Bend", "Something Super Fuckinhg Awesome"
    };

}

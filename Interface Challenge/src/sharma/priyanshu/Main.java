package sharma.priyanshu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        List<Mappable> mappables = new ArrayList<> ();

        mappables.add (new Building ("Muzaffarpur Nagar Nigam", UsageType.GOVERNMENT));
        mappables.add (new Building ("Cinepolis", UsageType.ENTERTAINMENT));
        mappables.add (new Building ("JLN Stadium", UsageType.SPORTS));

        mappables.add (new UtilityLine ("BSNL", UtilityType.FIBER_OPTIC));
        mappables.add (new UtilityLine ("Nal Jal Yojna", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt (m);
        }
    }
}

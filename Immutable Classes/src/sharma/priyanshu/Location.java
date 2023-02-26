package sharma.priyanshu;

import java.util.HashMap;
import java.util.Map;

public record Location(int locationID, String description, Map<String, Integer> exits) {

    public Location (int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<> (exits);
        this.exits.put ("Q", 0);
    }

    @Override
    public Map<String, Integer> exits () {
        return new HashMap<> (exits);
    }
}

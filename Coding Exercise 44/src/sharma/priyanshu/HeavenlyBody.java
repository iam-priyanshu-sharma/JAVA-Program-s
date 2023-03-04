package sharma.priyanshu;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody (String name, double orbitalPeriod, BodyTypes bodyType) {
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<> ();
        this.key = new Key (name, bodyType);
    }

    public enum BodyTypes {
        PLANET,
        DWARF_PLANET,
        MOON
    }

    public Key getKey () {
        return key;
    }

    public double getOrbitalPeriod () {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites () {
        return new HashSet<> (this.satellites);
    }

    public boolean addSatellite (HeavenlyBody moon) {
        return this.satellites.add (moon);
    }

    @Override
    public final boolean equals (Object obj) {
        if ( this == obj ) {
            return true;
        }
        if ( obj instanceof HeavenlyBody heavenlyBody ) {
            return this.key.equals (heavenlyBody.getKey ());
        }
        return false;
    }

    @Override
    public final int hashCode () {
        return this.key.hashCode ();
    }

    public static Key makeKey (String name, BodyTypes bodyType) {
        return new Key (name, bodyType);
    }

    @Override
    public String toString () {
        return key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private final String name;
        private final BodyTypes bodyType;

        private Key (String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName () {
            return name;
        }

        public BodyTypes getBodyType () {
            return bodyType;
        }

        @Override
        public boolean equals (Object obj) {
            Key key = (Key) obj;
            if ( this.name.equals (key.getName ()) ) {
                return (this.bodyType == key.getBodyType ());
            }
            return false;
        }

        @Override
        public int hashCode () {
            return this.name.hashCode () + 13 + this.bodyType.hashCode ();
        }

        @Override
        public String toString () {
            return this.name + ": " + this.bodyType;
        }
    }
}

package sharma.priyanshu;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

    @Override
    public String toString () {
        return String.format ("%s (%d)", name, distance);
    }
}

//final class Place {
//    private final String name;
//    private final int distance;
//
//    Place (String name, int distance) {
//        this.name = name;
//        this.distance = distance;
//    }
//
//    @Override
//    public String toString () {
//        return String.format ("%s (%d)", name, distance);
//    }
//
//    public String name () {
//        return name;
//    }
//
//    public int distance () {
//        return distance;
//    }
//
//    @Override
//    public boolean equals (Object obj) {
//        if ( obj == this ) return true;
//        if ( obj == null || obj.getClass () != this.getClass () ) return false;
//        var that = (Place) obj;
//        return Objects.equals (this.name, that.name) &&
//                this.distance == that.distance;
//    }
//
//    @Override
//    public int hashCode () {
//        return Objects.hash (name, distance);
//    }
//
//}

public class Main {

    public static void main (String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<> ();

        Place adelaide = new Place ("Adelaide", 1374);
        addPlace (placesToVisit, adelaide);
        addPlace (placesToVisit, new Place ("adelaide", 1374));
        addPlace (placesToVisit, new Place ("Brisbane", 917));
        addPlace (placesToVisit, new Place ("Perth", 3923));
        addPlace (placesToVisit, new Place ("Alice Springs", 2771));
        addPlace (placesToVisit, new Place ("Darwin", 3972));
        addPlace (placesToVisit, new Place ("Melbourne", 877));

        placesToVisit.addFirst (new Place ("Sydney", 0));
        System.out.println (placesToVisit);

        var iterator = placesToVisit.listIterator ();
        Scanner scanner = new Scanner (System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu ();

        while (!quitLoop) {
            if ( !iterator.hasPrevious () ) {
                System.out.println ("Originating : " + iterator.next ());
                forward = true;
            }
            if ( !iterator.hasNext () ) {
                System.out.println ("Final : " + iterator.previous ());
                forward = false;
            }
            System.out.print ("Enter Value: ");
            String menuItem = scanner.nextLine ().toUpperCase ().substring (0, 1);

            switch (menuItem) {
                case "F" -> {
                    System.out.println ("User wants to go forward");
                    if ( !forward ) {           // Reversing Direction
                        forward = true;
                        if ( iterator.hasNext () ) {
                            iterator.next ();  // Adjust position forward
                        }
                    }
                    if ( iterator.hasNext () ) {
                        System.out.println (iterator.next ());
                    }
                }
                case "B" -> {
                    System.out.println ("User wants to go backwards");
                    if ( forward ) {           // Reversing Direction
                        forward = false;
                        if ( iterator.hasPrevious () ) {
                            iterator.previous ();  // Adjust position backwards
                        }
                    }
                    if ( iterator.hasPrevious () ) {
                        System.out.println (iterator.previous ());
                    }
                }
                case "M" -> printMenu ();
                case "L" -> System.out.println (placesToVisit);
                default -> quitLoop = true;
            }
        }

    }

    private static void addPlace (LinkedList<Place> list, Place place) {

        if ( list.contains (place) ) {
            System.out.println ("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if ( p.name ().equalsIgnoreCase (place.name ()) ) {
                System.out.println ("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace : list) {
            if ( place.distance () < listPlace.distance () ) {
                list.add (matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add (place);
    }

    private static void printMenu () {

        System.out.println ("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}

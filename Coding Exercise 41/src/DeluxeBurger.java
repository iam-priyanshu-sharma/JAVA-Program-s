public class DeluxeBurger extends Hamburger {

    public DeluxeBurger () {
        super ("Deluxe", "Sausage & Beacon", 14.54, "White Roll");
    }

    @Override
    public void addHamburgerAddition1 (String name, double price) {
        System.out.println ("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2 (String name, double price) {
        System.out.println ("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3 (String name, double price) {
        System.out.println ("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4 (String name, double price) {
        System.out.println ("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger () {
        System.out.println ("Added chips for an extra 2.75");
        double chips = 2.75;
        System.out.println ("Added drinks for an extra 1.81");
        double drinks = 1.81;
        return chips + drinks + super.itemizeHamburger ();
    }
}

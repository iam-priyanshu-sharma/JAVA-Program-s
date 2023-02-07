public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger (String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println (this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", " +
                "price is " + this.price);
    }

    public void addHamburgerAddition1 (String name, double price) {
        addition1Name = name;
        addition1Price = price;
        System.out.println ("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    }

    public void addHamburgerAddition2 (String name, double price) {
        addition2Name = name;
        addition2Price = price;
        System.out.println ("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    }

    public void addHamburgerAddition3 (String name, double price) {
        addition3Name = name;
        addition3Price = price;
        System.out.println ("Added " + this.addition3Name + " for an extra " + this.addition3Price);
    }

    public void addHamburgerAddition4 (String name, double price) {
        addition4Name = name;
        addition4Price = price;
        System.out.println ("Added " + this.addition4Name + " for an extra " + this.addition4Price);
    }

    public double itemizeHamburger () {
        return this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
    }
}

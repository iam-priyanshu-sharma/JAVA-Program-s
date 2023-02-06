public class Car {

    protected String description;

    public Car (String description) {
        this.description = description;
    }

    public void startEngine () {
        System.out.println (description);
        System.out.println ("Car -> startEngine");
    }

    protected void runEngine () {
        System.out.println ("Car -> runEngine");
    }

    public void drive () {
        System.out.println ("Car -> driving, type is " + getClass ().getSimpleName ());
        runEngine ();
    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private double topSpeed;

    public GasPoweredCar (String description) {
        super (description);
    }

    public GasPoweredCar (String description, double avgKmPerLiter, int cylinders, double topSpeed) {
        super (description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.topSpeed = topSpeed;
    }

    @Override
    public void startEngine () {
        System.out.println (description);
        System.out.printf ("Gas -> All %d cylinders are fired up and Ready to achieve it's Top Speed of %f Km/h%n", cylinders, topSpeed);
    }

    @Override
    protected void runEngine () {
        System.out.printf ("Gas -> usage exceeds the average: %.2f Km/l %n", avgKmPerLiter);
    }
}

class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize = 6;
    private double topSpeed;

    public ElectricCar (String description) {
        super (description);
    }

    public ElectricCar (String description, double avgKmPerCharge, int batterySize, double topSpeed) {
        super (description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.topSpeed = topSpeed;
    }

    @Override
    public void startEngine () {
        System.out.println (description);
        System.out.printf ("BEV -> switch %d kWh battery on and Ready to achieve it's Top Speed of %f Km/h%n", batterySize, topSpeed);
    }

    @Override
    protected void runEngine () {
        System.out.printf ("BEV -> usage under the average: %.2f Kilometers %n", avgKmPerCharge);
    }
}

class HybridCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;
    private double topSpeed;

    public HybridCar (String description) {
        super (description);
    }

    public HybridCar (String description, double avgKmPerLiter, int cylinders, int batterySize, double topSpeed) {
        super (description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
        this.topSpeed = topSpeed;
    }

    @Override
    public void startEngine () {
        System.out.println (description);
        System.out.printf ("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf ("Hybrid -> switch %d kWh battery on and Ready to achieve it's Top Speed of %f Km/h%n", batterySize, topSpeed);
    }

    @Override
    protected void runEngine () {
        System.out.printf ("Hybrid -> usage below average: %.2f Km/l %n", avgKmPerLiter);
    }
}
public class Main {

    public static void main (String[] args) {

        Car car = new Car ("2023 Lamborghini Urus Performante");
        runRace (car);

        Car bugatti = new GasPoweredCar ("2023 Orange & Black Bugatti Chiron Super Sport 300+", 4.4444, 16, 490.484);
        runRace (bugatti);

        Car rimac = new ElectricCar ("2023 Red Rimac Nevera", 490, 120, 411.9552);
        runRace (rimac);

        Car ferrariHybrid = new HybridCar ("2023 Rosso Red Ferrari SF90 Stradale Asseto Fiorano", 16.39, 8, 8, 339.5412);
        runRace (ferrariHybrid);
    }

    public static void runRace (Car car) {
        car.startEngine ();
        car.drive ();
    }
}

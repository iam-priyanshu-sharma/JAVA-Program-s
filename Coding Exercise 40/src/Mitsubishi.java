public class Mitsubishi extends Car {

    public Mitsubishi (int cylinders, String name) {
        super(cylinders, name);
    }

     @Override
     public String startEngine() {
         // return "Car Mitsubishi -> startEngine()";
         return getClass().getSimpleName() + " -> startEngine()";
     }

     @Override
     public String accelerate() {
         // return "Car Mitsubishi -> accelerate()";
         return getClass().getSimpleName() + " -> accelerate()";
     }

     @Override
     public String brake() {
         // return "Car Mitsubishi -> brake()";
         return getClass().getSimpleName() + " -> brake()";
     }
}

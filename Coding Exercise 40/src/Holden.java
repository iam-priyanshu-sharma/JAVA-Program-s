public class Holden extends Car {

    public Holden (int cylinders, String name) {
        super(cylinders, name);
    }

     @Override
     public String startEngine() {
         // return "Car Holden -> startEngine()";
         return getClass().getSimpleName() + " -> startEngine()";
     }

     @Override
     public String accelerate() {
         // return "Car Holden -> accelerate()";
         return getClass().getSimpleName() + " -> accelerate()";
     }

     @Override
     public String brake() {
         // return "Car Holden -> brake()";
         return getClass().getSimpleName() + " -> brake()";
     }
}

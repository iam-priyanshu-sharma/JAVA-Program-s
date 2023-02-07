public class Ford extends Car {

    public Ford (int cylinders, String name) {
        super(cylinders, name);
    }

     @Override
     public String startEngine() {
         // return "Car Ford -> startEngine()";
         return getClass().getSimpleName() + " -> startEngine()";
     }

     @Override
     public String accelerate() {
         // return "Car Ford -> accelerate()";
         return getClass().getSimpleName() + " -> accelerate()";
     }

     @Override
     public String brake() {
         // return "Car Ford -> brake()";
         return getClass().getSimpleName() + " -> brake()";
     }
}
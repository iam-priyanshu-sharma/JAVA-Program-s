public class Ford extends Car {

    public Ford (int cylinders, String name) {
        super(cylinders, name);
    }

     @Override
     public String startEngine() {
         // return " Ford -> startEngine()";
         return getClass().getSimpleName() + " -> startEngine()";
     }

     @Override
     public String accelerate() {
         // return "Ford -> accelerate()";
         return getClass().getSimpleName() + " -> accelerate()";
     }

     @Override
     public String brake() {
         // return "Ford -> brake()";
         return getClass().getSimpleName() + " -> brake()";
     }
}
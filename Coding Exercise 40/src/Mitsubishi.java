public class Mitsubishi extends Car {

    public Mitsubishi (int cylinders, String name) {
        super(cylinders, name);
    }

     @Override
     public String startEngine() {
         // return " Mitsubishi -> startEngine()";
         return getClass().getSimpleName() + " -> startEngine()";
     }

     @Override
     public String accelerate() {
         // return "Mitsubishi -> accelerate()";
         return getClass().getSimpleName() + " -> accelerate()";
     }

     @Override
     public String brake() {
         // return "Mitsubishi -> brake()";
         return getClass().getSimpleName() + " -> brake()";
     }
}

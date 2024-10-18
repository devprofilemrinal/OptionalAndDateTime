package Optional.code;

import Optional.domain.Car;
import Optional.domain.Engine;

public class ReturningValues {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", null);
//        System.out.println("Engine Type: " + car.getEngine().get().getType());
        Engine defaultEngine = new Engine("V6");
        Engine engine = car.getEngine().orElse(defaultEngine);
        System.out.println("Engine Type: " + engine.getType());

        /*
        OrElseGet()
         */
//        Engine engine = car.getEngine().orElseGet(() -> new Engine("V4"));  // Compute the default
//        System.out.println("Engine Type: " + engine.getType());


    }
}

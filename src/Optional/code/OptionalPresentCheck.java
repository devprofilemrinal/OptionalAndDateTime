package Optional.code;

import Optional.domain.Car;
import Optional.domain.Engine;

public class OptionalPresentCheck {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", null);
        if ((car.getEngine().isPresent())) {
            System.out.println("Engine Type: " + car.getEngine().get().getType());
        } else {
            System.out.println("No Engine found!");
        }

        if(car.getEngine().isEmpty()) {
            System.out.println("No Engine found!");
        }else {
            System.out.println("Engine Type: " + car.getEngine().get().getType());
        }

    }
}

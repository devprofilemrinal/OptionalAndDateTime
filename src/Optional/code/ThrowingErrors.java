package Optional.code;

import Optional.domain.Car;
import Optional.domain.Engine;

public class ThrowingErrors {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", null);
//        car.getEngine().orElseThrow();
        car.getEngine().orElseThrow(() -> new IllegalArgumentException("pass a valid engine"));

    }
}

package Optional.code;

import Optional.domain.Car;

public class FetchOptionalValues {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", null);
        //Getting the value from optional
        System.out.println(car.getEngine().get());

    }
}

package Optional.domain;

import java.util.Optional;

public class Car {
    private String make;
    private String model;
    private Optional<Engine> engine;  // Optional Engine object

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = Optional.ofNullable(engine);  // Use of Optional
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Optional<Engine> getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", engine=" + (engine.isPresent() ? engine.get().getType() : "No Engine") + "]";
    }
}


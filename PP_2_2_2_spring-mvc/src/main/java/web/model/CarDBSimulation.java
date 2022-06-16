package web.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class CarDBSimulation {
    private final List<Car> allCars = new ArrayList<>();

    public CarDBSimulation() {
        allCars.add(new Car(1, "ford", "red"));
        allCars.add(new Car(2, "mazda", "white"));
        allCars.add(new Car(3, "opel", "green"));
        allCars.add(new Car(4, "toyota", "black"));
        allCars.add(new Car(5, "bmw", "blue"));
    }

    public void addCar(Car car) {
        this.allCars.add(car);
    }

}

package web.DAO;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.model.Car;
import web.model.CarDBSimulation;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.min;

@Component
@NoArgsConstructor

public class DAOCarsDBSimulation implements DAO<Car>{
    private CarDBSimulation cars;
    @Autowired
    public void setCars(CarDBSimulation cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getItemsByCount(int count) {
        int rightBound = min(count, cars.getAllCars().size());
        return rightBound <= 0 ? new ArrayList<>() : cars.getAllCars().subList(0, rightBound);
    }

    @Override
    public List<Car> getAllItems() {
        return cars.getAllCars();
    }
}

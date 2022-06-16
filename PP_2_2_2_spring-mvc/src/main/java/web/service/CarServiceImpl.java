package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.DAO.DAOCarsDBSimulation;
import web.model.Car;
import java.util.List;
import java.util.Optional;

import static java.lang.Integer.parseInt;

@Component
public class CarServiceImpl implements Service<Car> {
    @Autowired
    @Qualifier("daoCars")
    DAOCarsDBSimulation daoCarsDDSimulation;

    @Override
    public List<Car> getItemsByCount(String count) {
        //int validCount = parseInt(Optional.ofNullable(count).orElse("0"));
        return count == null ? daoCarsDDSimulation.getAllItems() : daoCarsDDSimulation.getItemsByCount(parseInt(count));
    }

    @Override
    public List<Car> getAllItems() {
        return daoCarsDDSimulation.getAllItems();
    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.DAOCarsDBSimulation;
import web.model.Car;
import java.util.List;

import static java.lang.Integer.parseInt;

@Component
public class CarServiceImpl implements Service<Car> {

    DAOCarsDBSimulation daoCarsDBSimulation;
    @Autowired
    public void setDaoCarsDBSimulation(DAOCarsDBSimulation daoCarsDBSimulation) {
        this.daoCarsDBSimulation = daoCarsDBSimulation;
    }

    @Override
    public List<Car> getItemsByCount(String count) {
        return count == null ? daoCarsDBSimulation.getAllItems() : daoCarsDBSimulation.getItemsByCount(parseInt(count));
    }

    @Override
    public List<Car> getAllItems() {
        return daoCarsDBSimulation.getAllItems();
    }
}

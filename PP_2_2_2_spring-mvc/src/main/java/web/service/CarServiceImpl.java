package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.DAO.DAOCarsDBSimulation;
import web.model.Car;
import java.util.List;

import static java.lang.Integer.parseInt;

@Component
public class CarServiceImpl implements Service<Car> {

    DAOCarsDBSimulation daoCarsDDSimulation;
    @Autowired
    public void setDaoCarsDDSimulation(DAOCarsDBSimulation daoCarsDDSimulation) {
        this.daoCarsDDSimulation = daoCarsDDSimulation;
    }

    @Override
    public List<Car> getItemsByCount(String count) {
        return count == null ? daoCarsDDSimulation.getAllItems() : daoCarsDDSimulation.getItemsByCount(parseInt(count));
    }

    @Override
    public List<Car> getAllItems() {
        return daoCarsDDSimulation.getAllItems();
    }
}

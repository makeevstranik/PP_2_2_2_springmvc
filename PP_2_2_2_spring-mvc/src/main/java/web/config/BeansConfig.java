package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.DAO.DAOCarsDBSimulation;
import web.model.CarDBSimulation;
import web.service.CarServiceImpl;

@Configuration
public class BeansConfig {

    @Bean
    CarDBSimulation cars() {
        return new CarDBSimulation();
    }

    @Bean
    DAOCarsDBSimulation daoCars() {
        return new DAOCarsDBSimulation();
    }

    @Bean
    CarServiceImpl carService() {
        return new CarServiceImpl();
    }

}

package web.dao;

import java.util.List;
import web.model.Car;

public interface CarDao {
    void addCar(Car car);

    List<Car> getAllCars();

    List<Car> getCountCars(Integer count);

    void clearListCars();
}

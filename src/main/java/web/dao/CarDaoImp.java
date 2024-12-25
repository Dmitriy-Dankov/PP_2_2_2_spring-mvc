package web.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import web.data.CarData;
import web.model.Car;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars;

    public CarDaoImp() {
        cars = new CarData().getCars();
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return cars.subList(0, count);
    }

    @Override
    public void clearListCars() {
        cars.clear();
    }
}

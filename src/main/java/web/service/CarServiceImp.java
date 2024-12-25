package web.service;

import java.util.List;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

@Service
public class CarServiceImp implements CarService {
    private final CarDaoImp carDaoImp;

    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public void addCar(Car car) {
        carDaoImp.addCar(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carDaoImp.getAllCars();
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return carDaoImp.getCountCars(count);
    }

    @Override
    public void clearListCars() {
        carDaoImp.clearListCars();
    }
}

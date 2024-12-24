package web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import web.model.Car;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;
    public CarServiceImp() {
        this.cars = new ArrayList<>();
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

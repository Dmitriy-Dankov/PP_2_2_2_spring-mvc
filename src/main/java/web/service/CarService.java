package web.service;

import java.util.List;

import web.model.Car;

public interface CarService {
    void addCar(Car car);
    List<Car> getAllCars();
    List<Car> getCountCars(Integer count);
    void clearListCars();
}
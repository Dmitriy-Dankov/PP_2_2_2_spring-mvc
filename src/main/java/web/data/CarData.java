package web.data;

import java.util.ArrayList;
import java.util.List;
import web.model.Car;

public class CarData {
    private List<Car> cars = new ArrayList<>();

    public CarData() {
        cars.add(new Car("model1", "series1", "blue"));
        cars.add(new Car("model2", "series2", "green"));
        cars.add(new Car("model3", "series3", "red"));
        cars.add(new Car("model4", "series4", "black"));
        cars.add(new Car("model5", "series5", "white"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}

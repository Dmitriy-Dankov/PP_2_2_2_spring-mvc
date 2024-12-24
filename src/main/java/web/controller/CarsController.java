package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;

@Controller
public class CarsController {
    private final CarService carService;
    
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("/cars")
    public String getCars(@RequestParam(required = false, value = "count") Integer count, Model model) {
        carService.clearListCars();
        carService.addCar(new Car("model1", "series1", "blue"));
        carService.addCar(new Car("model2", "series2", "green"));
        carService.addCar(new Car("model3", "series3", "red"));
        carService.addCar(new Car("model4", "series4", "black"));
        carService.addCar(new Car("model5", "series5", "white"));

        if (count > 0 && count < 5) {
            model.addAttribute("cars", carService.getCountCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }        
        
        return "cars";
    }
}

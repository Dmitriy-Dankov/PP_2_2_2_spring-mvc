package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping
    public String getCars(@RequestParam(required = false, value = "count") Integer count, Model model) {
        if (count != null && (count > 0 && count < 5)) {
            model.addAttribute("cars", carService.getCountCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }
        return "cars";
    }
}

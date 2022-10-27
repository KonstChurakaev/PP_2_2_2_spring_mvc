package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
@RequestMapping(value = "/car")
public class CarsController {

    private final CarService carservice;

    @Autowired
    public CarsController(CarService carservice) {
        this.carservice = carservice;
    }

    @RequestMapping(value = "")
    public String getCarList(@RequestParam(required = false) Integer count, Model model) {
        model.addAttribute("cars", carservice.getCarList(10));
        return "cars";
    }
}





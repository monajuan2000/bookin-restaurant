package com.ias.bookingrestaurantapi.aplication.controllers;

import com.ias.bookingrestaurantapi.core.models.RestaurantModel;
import com.ias.bookingrestaurantapi.core.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/find-all")
    public List<RestaurantModel> findAllRestaurants(){
        return restaurantService.findAllRestaurants();
    }

}

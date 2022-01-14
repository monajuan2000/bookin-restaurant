package com.ias.bookingrestaurantapi.aplication.controllers;
import com.ias.bookingrestaurantapi.core.models.RestaurantModel;
import com.ias.bookingrestaurantapi.core.services.RestaurantService;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/find-all")
    public List<RestaurantModel> findAllRestaurants(){
        return restaurantService.findAllRestaurants();
    }
}

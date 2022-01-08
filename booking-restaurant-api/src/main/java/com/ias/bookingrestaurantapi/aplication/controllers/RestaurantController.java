package com.ias.bookingrestaurantapi.aplication.controllers;


import com.ias.bookingrestaurantapi.aplication.services.RestaurantService;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping(value = "/api/v1/restaurants/find-all")
    public List<RestaurantEntity> findAll(){
        return restaurantService.findAll();
    }
}

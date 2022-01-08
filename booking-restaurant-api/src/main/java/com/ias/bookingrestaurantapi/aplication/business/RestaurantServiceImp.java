package com.ias.bookingrestaurantapi.aplication.business;

import com.ias.bookingrestaurantapi.aplication.services.RestaurantService;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImp implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public List<RestaurantEntity> findAll() {
        return restaurantRepository.findAll();
    }
}

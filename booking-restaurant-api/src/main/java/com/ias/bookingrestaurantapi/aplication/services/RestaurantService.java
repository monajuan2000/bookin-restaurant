package com.ias.bookingrestaurantapi.aplication.services;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;

import java.util.List;

public interface RestaurantService {

    List<RestaurantEntity> findAll();
}

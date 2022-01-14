package com.ias.bookingrestaurantapi.core.services;

import com.ias.bookingrestaurantapi.core.models.RestaurantModel;

import java.util.List;

public interface RestaurantService {

    List<RestaurantModel> findAllRestaurants();
}

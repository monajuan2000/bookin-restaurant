package com.ias.bookingrestaurantapi.core.business;

import com.ias.bookingrestaurantapi.core.mappers.RestaurantMapper;
import com.ias.bookingrestaurantapi.core.models.RestaurantModel;
import com.ias.bookingrestaurantapi.core.services.RestaurantService;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantServiceImp extends RestaurantMapper implements RestaurantService{

    @Autowired
    RestaurantRepository restaurantRepository;

    public List<RestaurantModel> findAllRestaurants() {
       final List<RestaurantEntity> restaurantEntities = this.restaurantRepository.findAllRestaurants();
       return this.convertToModels(restaurantEntities);
    }
}

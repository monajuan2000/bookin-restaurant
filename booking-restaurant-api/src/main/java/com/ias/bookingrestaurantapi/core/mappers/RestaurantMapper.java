package com.ias.bookingrestaurantapi.core.mappers;

import com.ias.bookingrestaurantapi.core.models.RestaurantModel;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMapper {

    protected List<RestaurantModel> convertToModels(List<RestaurantEntity> restaurantEntities) {
        List<RestaurantModel> restaurantModels = new ArrayList<RestaurantModel>();
        restaurantEntities.forEach(e -> {
            RestaurantModel model = new RestaurantModel();
            model.setId(e.getId());
            model.setName(e.getName());
            model.setDescription(e.getDescription());
            model.setAddress(e.getAddress());
            model.setImage(e.getImage());
            restaurantModels.add(model);
        });
        return restaurantModels;
    }
}

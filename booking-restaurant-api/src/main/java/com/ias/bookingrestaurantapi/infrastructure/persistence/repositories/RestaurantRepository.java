package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    @Query(value = "SELECT * FROM booking_restaurant.restaurant", nativeQuery = true)
    List<RestaurantEntity> findAllRestaurants();
}

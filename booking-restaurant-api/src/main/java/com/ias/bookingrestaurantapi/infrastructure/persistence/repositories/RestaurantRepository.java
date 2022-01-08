package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {


}

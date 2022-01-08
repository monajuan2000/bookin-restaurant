package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class RestaurantRepositoryTest {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Test
    @DisplayName("test jpa findAll")
    void findAll() {

    }
}
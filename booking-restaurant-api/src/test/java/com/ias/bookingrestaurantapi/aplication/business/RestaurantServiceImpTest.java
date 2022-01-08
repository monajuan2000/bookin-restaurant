package com.ias.bookingrestaurantapi.aplication.business;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RestaurantServiceImpTest {

    @Autowired
    RestaurantServiceImp restaurantServiceImp;

    @Test
    @DisplayName("method findAll Jpa")
    void findAll() {
        assertAll(() -> assertEquals(restaurantServiceImp.findAll().size(), 0)
        );
    }
}
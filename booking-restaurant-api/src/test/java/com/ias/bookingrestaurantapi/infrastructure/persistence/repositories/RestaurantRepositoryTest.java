package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.BoardEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.ReservationEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.TurnEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class RestaurantRepositoryTest {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Test
    @DisplayName("test jpa findAll")
    void findAll() {
        List<RestaurantEntity> restaurantEntities = restaurantRepository.findAll();
        RestaurantEntity restaurant = restaurantEntities.stream().
                filter(e -> e.getId() == 1).findFirst().orElseThrow();
        assertAll(
                () -> assertEquals(restaurantEntities.size(), 3),
                () ->
                {
                    assertEquals(restaurant.getName(), "KFC");

                },
                () ->
                {
                    List<ReservationEntity> reservations = restaurant.getReservations();
                    assertEquals(reservations.size(), 2);
                },
                () ->
                {
                    List<BoardEntity> boards = restaurant.getBoards();
                    assertEquals(boards.size(), 5);
                },
                () ->
                {
                    List<TurnEntity> turns = restaurant.getTurns();
                    assertEquals(turns.size(), 4);
                }
        );
    }
}
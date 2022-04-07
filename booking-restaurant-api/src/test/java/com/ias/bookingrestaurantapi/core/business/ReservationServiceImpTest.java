package com.ias.bookingrestaurantapi.core.business;

import com.ias.bookingrestaurantapi.core.models.ReservationCreateModel;
import com.ias.bookingrestaurantapi.core.models.ReservationModel;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.ReservationEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.ReservationRepository;
import javassist.NotFoundException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReservationServiceImpTest {

    @Autowired
    ReservationServiceImp reservationServiceImp;

    @Autowired
    ReservationRepository reservationRepository;

    @Test
    void contextLoads() {
    }

    @Test
    @DisplayName("test for method createReservation")
    void createReservationTest() throws NotFoundException {
        ReservationCreateModel model = new ReservationCreateModel();
        model.setPerson(3);
        model.setTurnId(1L);
        model.setRestaurantId(1L);
        this.reservationServiceImp.createReservation(model);
        assertAll(
                () -> {
                    List<ReservationModel> reservations = this.reservationServiceImp.findAll();
                    assertEquals(reservations.size(), 5);
                },
                () -> {
                    Optional<ReservationEntity>
                            reservation = this.reservationRepository.findById(5L);
                    assertAll(
                            () -> assertTrue(reservation.isPresent()),
                            () -> assertEquals(reservation.orElseThrow().getLocator(),"KFC1")
                    );
                }
        );

    }

    @Test
    @DisplayName("test fot method deleteReservation")
    void deleteReservation() throws NotFoundException {
        this.reservationServiceImp.deleteReservation(5L);
        assertAll(
                ()-> assertThrows(NotFoundException.class,()-> System.out.println("test")));
    }
}
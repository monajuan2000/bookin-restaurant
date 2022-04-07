package com.ias.bookingrestaurantapi.aplication.controllers;

import com.ias.bookingrestaurantapi.core.models.ReservationCreateModel;
import com.ias.bookingrestaurantapi.core.models.ReservationModel;
import com.ias.bookingrestaurantapi.core.services.ReservationService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/reservations")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping(value = "/find-all")
    public List<ReservationModel> findAllRestaurants() {
        return reservationService.findAll();
    }
    @PostMapping(value = "/create-reservation")
    public void createReservation(@RequestBody ReservationCreateModel model) throws NotFoundException {
        this.reservationService.createReservation(model);
    }
}

package com.ias.bookingrestaurantapi.core.services;

import com.ias.bookingrestaurantapi.core.models.ReservationCreateModel;
import com.ias.bookingrestaurantapi.core.models.ReservationModel;
import javassist.NotFoundException;

import java.util.List;

public interface ReservationService {

    List<ReservationModel> findAll();
    void createReservation(ReservationCreateModel reservationModel) throws NotFoundException;
    void findById(Long id);
    void updateReservation(ReservationModel reservationModel);
}

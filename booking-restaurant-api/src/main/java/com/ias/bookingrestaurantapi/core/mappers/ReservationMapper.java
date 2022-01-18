package com.ias.bookingrestaurantapi.core.mappers;

import com.ias.bookingrestaurantapi.core.models.ReservationCreateModel;
import com.ias.bookingrestaurantapi.core.models.ReservationModel;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.ReservationEntity;

import java.util.ArrayList;
import java.util.List;

public class ReservationMapper {

    protected List<ReservationModel> convertToModels(List<ReservationEntity> reservationEntities) {
        List<ReservationModel> reservationModels = new ArrayList<ReservationModel>();
        reservationEntities.forEach(e -> {
            ReservationModel model = new ReservationModel();
            model.setId(e.getId());
            model.setDate(e.getDate());
            model.setPerson(e.getPerson());
            model.setTurn(e.getTurn());
            model.setLocator(e.getLocator());
            model.setRestaurantId(e.getRestaurant().getId());
            reservationModels.add(model);
        });
        return reservationModels;
    }
    protected ReservationEntity convertToEntity(ReservationCreateModel reservationModel){
        ReservationEntity reservationEntity = new ReservationEntity();
        reservationEntity.setDate(reservationModel.getDate());
        reservationEntity.setPerson(reservationModel.getPerson());
        return reservationEntity;
    }
}

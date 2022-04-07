package com.ias.bookingrestaurantapi.core.business;

import com.ias.bookingrestaurantapi.core.mappers.ReservationMapper;
import com.ias.bookingrestaurantapi.core.models.ReservationCreateModel;
import com.ias.bookingrestaurantapi.core.models.ReservationModel;
import com.ias.bookingrestaurantapi.core.services.ReservationService;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.ReservationEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.RestaurantEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.TurnEntity;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.ReservationRepository;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.RestaurantRepository;
import com.ias.bookingrestaurantapi.infrastructure.persistence.repositories.TurnRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImp extends ReservationMapper implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    TurnRepository turnRepository;


    @Override
    public List<ReservationModel> findAll() {
        final List<ReservationEntity> reservationEntities = reservationRepository.findAll();
        return this.convertToModels(reservationEntities);
    }

    @Override
    public void createReservation(ReservationCreateModel reservationModel) throws NotFoundException {
        ReservationEntity reservationEntity = this.convertToEntity(reservationModel);
        this.assignRestaurant(reservationModel, reservationEntity);
        this.assignTurn(reservationModel, reservationEntity);
        this.assignLocator(reservationModel, reservationEntity);
        this.reservationRepository.save(reservationEntity);
    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void updateReservation(ReservationModel reservationModel) {

    }

    @Override
    public String deleteReservation(Long id)  {
        String message = "";
        try{
            this.reservationRepository.findById(id)
                    .orElseThrow(()-> new NotFoundException("RESERVATION_NOT_FOUND"));
            this.reservationRepository.deleteById(id);
            message = "RESERVATION_DELETE_SUCCESS";
        }catch (NotFoundException e){
            e.printStackTrace();
            message = "RESERVATION_DELETE_ERROR";
        }
        return message;
    }

    private void assignRestaurant(ReservationCreateModel reservationModel, ReservationEntity reservationEntity) throws NotFoundException {
        RestaurantEntity restaurantEntity = this.restaurantRepository.
                findById(reservationModel.getRestaurantId()).orElseThrow(() -> new NotFoundException("RESTAURANT_NOT_FOUND"));
        reservationEntity.setRestaurant(restaurantEntity);
    }

    private void assignLocator(ReservationCreateModel reservationModel, ReservationEntity reservationEntity) {
        String locator = reservationEntity.getRestaurant().getName() + reservationModel.getTurnId();
        reservationEntity.setLocator(locator);
    }

    private void assignTurn(ReservationCreateModel reservationModel, ReservationEntity reservationEntity) throws NotFoundException {
        TurnEntity turnEntity = this.turnRepository.
                findById(reservationModel.getTurnId()).orElseThrow(() -> new NotFoundException("TURN_NOT_FOUND"));
        reservationEntity.setTurn(turnEntity.getName());
    }
}

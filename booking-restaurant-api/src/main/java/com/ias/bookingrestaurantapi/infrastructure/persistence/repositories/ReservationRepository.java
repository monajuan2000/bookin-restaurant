package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}

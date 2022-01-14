package com.ias.bookingrestaurantapi.infrastructure.persistence.repositories;

import com.ias.bookingrestaurantapi.infrastructure.persistence.entities.TurnEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurnRepository extends JpaRepository<TurnEntity, Long> {
}

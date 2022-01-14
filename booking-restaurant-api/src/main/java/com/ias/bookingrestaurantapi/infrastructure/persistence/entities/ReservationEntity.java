package com.ias.bookingrestaurantapi.infrastructure.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "locator")
    private String locator;

    @Column(name = "person")
    private int person;

    @Column(name = "date")
    private Date date;

    @Column(name = "turn")
    private String turn;

    @JsonIgnore
    @JoinColumn(name = "restaurant_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private RestaurantEntity restaurant;
}

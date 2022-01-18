package com.ias.bookingrestaurantapi.core.models;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationModel {

    private Long id;
    private String locator;
    private int person;
    private Date date;
    private String turn;
    private Long restaurantId;
}

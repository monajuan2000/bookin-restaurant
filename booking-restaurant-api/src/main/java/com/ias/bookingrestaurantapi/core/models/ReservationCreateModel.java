package com.ias.bookingrestaurantapi.core.models;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationCreateModel {
    private Long id;
    private String locator;
    private int person;
    private Date date;
    private Long turnId;
    private Long restaurantId;
}

package com.ias.bookingrestaurantapi.core.models;

import lombok.Data;

@Data
public class RestaurantModel {

    private Long id;
    private String name;
    private String description;
    private String address;
    private String image;
}

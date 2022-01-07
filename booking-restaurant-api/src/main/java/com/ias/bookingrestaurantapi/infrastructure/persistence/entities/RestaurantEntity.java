package com.ias.bookingrestaurantapi.infrastructure.persistence.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    public RestaurantEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = true)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "IMAGE")
    private String image;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<ReservationEntity> reservations;

}

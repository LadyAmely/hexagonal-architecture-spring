package org.shop.computer.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue
    private Long address_id;

    @Column
    private String street;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String zip_code;

    @Column
    private String country;

}

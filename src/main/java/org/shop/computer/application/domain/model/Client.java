package org.shop.computer.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Client")
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue
    private Long client_id;

    @Column
    private String phone_number;

    @Column
    private String email;

    @Column
    private Boolean regular_client;

}

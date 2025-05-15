package org.shop.computer.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="User")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean owner;

    @Column
    private Boolean seller;

    @Column
    private Boolean serviceman;

    @Column
    private Boolean activeAccount;
}

package org.shop.computer.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Supplier")
@Getter
@Setter
public class Deliverer {

    @Id
    @GeneratedValue
    private Long supplier_id;

    @Column
    private String form_delivery;

    @Column
    private String company_name;

    @Column
    private String fax;

    @Column
    private Integer NIP;

    @Column
    private Integer REGON;
}

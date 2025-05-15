package org.shop.computer.application.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="Complaint")
@Getter
@Setter
public class Complaint {

    @Id
    @GeneratedValue
    private Long complaintId;

    @Column
    private String productName;

    @Column
    private String damageDescription;

    @Column
    private Date dateComplaint;

}

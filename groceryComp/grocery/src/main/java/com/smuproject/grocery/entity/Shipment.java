package com.smuproject.grocery.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue
    private int shipment_id;
    private Date shipment_date;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}

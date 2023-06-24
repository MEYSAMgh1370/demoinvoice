package com.example.demoinvoice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Item extends BaseEntity {

    private String title;
    private String description;
    private int price;
    @ManyToOne
    private Invoice invoice;
}

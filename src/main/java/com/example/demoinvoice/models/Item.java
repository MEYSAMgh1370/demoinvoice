package com.example.demoinvoice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Item extends BaseEntity {
    @NotEmpty
    @Size(max = 50)
    @Column(length = 50)
    private String title;
    @Size(max = 255)
    private String description;
    @NotEmpty
    private int price;
    @ManyToOne
    private Invoice invoice;
}

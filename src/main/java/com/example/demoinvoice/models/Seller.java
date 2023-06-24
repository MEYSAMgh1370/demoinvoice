package com.example.demoinvoice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Seller extends BaseEntity {
    private String companyName;
    private String sellDepartment;
    private String telephoneNumber;
    @OneToOne(mappedBy = "seller")
    private Invoice invoice;

}

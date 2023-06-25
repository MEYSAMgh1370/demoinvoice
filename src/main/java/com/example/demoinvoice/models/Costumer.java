package com.example.demoinvoice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Costumer extends BaseEntity {
    @NotNull
    @OneToMany
    private List<Invoice> invoices;
    @NotEmpty
    @Size(max = 50)
    @Column(length = 50)
    private String name;
    @NotEmpty
    @Size(max = 255)
    private String address;
}

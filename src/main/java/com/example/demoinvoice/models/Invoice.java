package com.example.demoinvoice.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Invoice extends BaseEntity {

    @NotNull
    private Long invoiceNumber;
    @NotNull
    @OneToMany
    private List<Item> items;
    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private Costumer costumer;

    private LocalDate date;

}

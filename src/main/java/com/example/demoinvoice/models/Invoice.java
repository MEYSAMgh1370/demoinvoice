package com.example.demoinvoice.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.Date;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "invoice_number", nullable = false)
    private Long invoiceNumber;
    @OneToMany
    private List<Item> item;
/*    @OneToOne(cascade = CascadeType.)
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    private Buyer buyer;*/
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    private Seller seller;
    private Date date;

}

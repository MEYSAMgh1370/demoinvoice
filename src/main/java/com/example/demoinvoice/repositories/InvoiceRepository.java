package com.example.demoinvoice.repositories;

import com.example.demoinvoice.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Optional<Invoice> findByInvoiceNumber(Long invoiceNumber);
}
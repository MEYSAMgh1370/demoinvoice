package com.example.demoinvoice.repositories;

import com.example.demoinvoice.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}

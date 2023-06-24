package com.example.demoinvoice.repositories;

import com.example.demoinvoice.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepositories extends JpaRepository<Invoice, Long> {
}

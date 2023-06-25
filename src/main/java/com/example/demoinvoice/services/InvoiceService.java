package com.example.demoinvoice.services;

import com.example.demoinvoice.dto.InvoiceDTO;
import com.example.demoinvoice.models.Invoice;

public interface InvoiceService {
    Invoice saveInvoice(InvoiceDTO invoice);

    InvoiceDTO findInvoiceByInvoiceNumber(Long invoiceNumber);
}

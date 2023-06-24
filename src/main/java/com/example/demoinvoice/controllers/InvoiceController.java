package com.example.demoinvoice.controllers;

import com.example.demoinvoice.models.Invoice;
import com.example.demoinvoice.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/Invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    //@GetMapping("/{invoicenumber}")
   // public Invoice getInvoiceByInvoiceNumber(@PathVariable("invoicenumber") Long invoiceNumber) {
        //return invoiceService.find
    //}

    //public
}

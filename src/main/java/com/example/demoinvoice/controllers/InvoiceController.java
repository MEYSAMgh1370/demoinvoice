package com.example.demoinvoice.controllers;

import com.example.demoinvoice.dto.InvoiceDTO;
import com.example.demoinvoice.mappers.InvoiceMapper;
import com.example.demoinvoice.models.Invoice;
import com.example.demoinvoice.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/Invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;
    private final InvoiceMapper invoiceMapper;


    @GetMapping("/{invoiceNumber}")
    public InvoiceDTO getInvoiceByInvoiceNumber(@PathVariable("invoiceNumber") Long invoiceNumber) {

        return invoiceService.findInvoiceByInvoiceNumber(invoiceNumber);
    }

    @PostMapping
    public ResponseEntity handlePost(@Validated @RequestBody InvoiceDTO invoiceDTO) {

        Invoice savedInvoice = invoiceService.saveInvoice(invoiceDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/Invoice" + "/" + savedInvoice.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
}

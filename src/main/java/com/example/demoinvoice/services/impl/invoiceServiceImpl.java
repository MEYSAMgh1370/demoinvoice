package com.example.demoinvoice.services.impl;

import com.example.demoinvoice.mappers.InvoiceMapper;
import com.example.demoinvoice.repositories.InvoiceRepository;
import com.example.demoinvoice.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class invoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceMapper invoiceMapper;
}

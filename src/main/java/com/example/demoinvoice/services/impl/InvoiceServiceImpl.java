package com.example.demoinvoice.services.impl;

import com.example.demoinvoice.dto.InvoiceDTO;
import com.example.demoinvoice.exeptionhandlers.NotFoundException;
import com.example.demoinvoice.mappers.InvoiceMapper;
import com.example.demoinvoice.models.Invoice;
import com.example.demoinvoice.models.Item;
import com.example.demoinvoice.repositories.InvoiceRepository;
import com.example.demoinvoice.services.InvoiceService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final InvoiceMapper invoiceMapper;

    @Override
    public Invoice saveInvoice(InvoiceDTO invoiceDTO) {
        Invoice invoice = invoiceMapper.invoiceDTOToInvoice(invoiceDTO);
        invoice.setDate(LocalDate.now());
        return invoiceRepository.save(invoice);
    }

    public InvoiceDTO findInvoiceByInvoiceNumber(Long invoiceNumber) {
        Invoice invoice = invoiceRepository.findByInvoiceNumber(invoiceNumber).orElseThrow(NotFoundException::new);
        InvoiceDTO invoiceDTO = invoiceMapper.invoiceToInvoiceDTO(invoice);
        invoiceDTO.setSum(
                invoice.getItems().stream().mapToInt(Item::getPrice).reduce(0, Integer::sum)
        );
        return invoiceDTO;
    }

}

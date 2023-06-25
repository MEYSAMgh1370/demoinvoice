package com.example.demoinvoice.mappers;

import com.example.demoinvoice.dto.InvoiceDTO;
import com.example.demoinvoice.models.Invoice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring", uses = {CostumerMapper.class, ItemMapper.class})
public interface InvoiceMapper {
    @Mapping(target = "sum", ignore = true)
    InvoiceDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOToInvoice(InvoiceDTO invoiceDTO);
}

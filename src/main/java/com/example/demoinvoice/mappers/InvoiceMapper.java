package com.example.demoinvoice.mappers;


import com.example.demoinvoice.dto.InvoiceDTO;
import com.example.demoinvoice.models.Invoice;
import org.mapstruct.Mapper;



@Mapper(componentModel="spring")
public interface InvoiceMapper {

    //@Mapping(target ="invoiceDTO.itemTitle" , source = "invoice.item.title")
    InvoiceDTO invoiceToInvoiceDTO(Invoice invoice);
    Invoice invoiceDTOToInvoice(InvoiceDTO invoiceDTO);
}

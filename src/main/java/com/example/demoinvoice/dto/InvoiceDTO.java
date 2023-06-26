package com.example.demoinvoice.dto;



import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Builder
@Data
public class InvoiceDTO {
    private int sum;
    @NotEmpty
    private List<ItemDTO> items;
    @NotEmpty
    private VendorDTO vendorDTO;
    @NotEmpty
    private CostumerDTO costumerDTO;
    @NotEmpty(message = "date can not be null.")
    private Date date;
    @NotEmpty(message = "invoiceNumber can not be null.")
    private Long invoiceNumber;
}
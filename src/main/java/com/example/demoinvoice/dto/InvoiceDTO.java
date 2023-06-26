package com.example.demoinvoice.dto;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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
    private String vendorPhoneNumber;
    @NotEmpty
    @Size(max = 11, min = 11)
    private String vendorUnit;
    @NotEmpty
    @Size(max = 50)
    private String vendorCompanyName;
    @NotEmpty
    @Size(max = 400, min = 50)
    private String vendorAddress;
    @NotEmpty
    private CostumerDTO costumerDTO;
    @NotEmpty(message = "date can not be null.")
    private Date date;
    @NotEmpty(message = "invoiceNumber can not be null.")
    private Long invoiceNumber;

}
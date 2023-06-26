package com.example.demoinvoice.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record VendorDTO(
        @NotEmpty
        @Size(max = 50)
        @Column(length = 50)
        String companyName,
        @NotEmpty
        @Size(max = 255)
        String address,
        @NotEmpty
        @Size(max = 50)
        @Column(length = 50)
        String salesUnit
) { }

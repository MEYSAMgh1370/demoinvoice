package com.example.demoinvoice.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ItemDTO(@NotNull int price, String description, @NotEmpty String title) {

}

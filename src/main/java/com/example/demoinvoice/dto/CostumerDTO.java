package com.example.demoinvoice.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record CostumerDTO (@NotEmpty String name, @NotEmpty @Size String address){
}

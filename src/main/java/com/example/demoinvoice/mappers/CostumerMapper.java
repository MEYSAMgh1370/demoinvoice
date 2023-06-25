package com.example.demoinvoice.mappers;

import com.example.demoinvoice.dto.CostumerDTO;
import com.example.demoinvoice.models.Costumer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CostumerMapper {
    CostumerDTO costumerTOCostumerDTO(Costumer costumer);
    @Mapping(target = "invoices", ignore = true )
    Costumer costumerDTOToCostumer(CostumerDTO costumerDTO);
}

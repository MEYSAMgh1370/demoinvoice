package com.example.demoinvoice.mappers;

import com.example.demoinvoice.dto.ItemDTO;
import com.example.demoinvoice.dto.VendorDTO;
import com.example.demoinvoice.models.Item;
import com.example.demoinvoice.models.Vendor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VendorMapper {
    VendorDTO vendorTOVendorDTO(Vendor vendor);
    Vendor vendorDTOToVendor(VendorDTO vendorDTO);
}
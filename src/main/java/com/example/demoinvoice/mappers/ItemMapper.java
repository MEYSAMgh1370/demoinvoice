package com.example.demoinvoice.mappers;

import com.example.demoinvoice.dto.ItemDTO;
import com.example.demoinvoice.models.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDTO itemTOItemDTO(Item item);
    Item itemDTOToItem(ItemDTO itemDTO);
}

package dev.java10x.MagicFrigdeIA.mapper;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemRequestDTO;
import dev.java10x.MagicFrigdeIA.model.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface FoodItemUpdate {

    void updateFoodItem(FoodItemRequestDTO dto, @MappingTarget FoodItem foodItem);
}

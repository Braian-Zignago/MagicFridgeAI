package dev.java10x.MagicFrigdeIA.mapper;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemRequestDTO;
import dev.java10x.MagicFrigdeIA.DTO.FoodItemResponseDTO;
import dev.java10x.MagicFrigdeIA.model.FoodItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface FoodItemMapper {

    @Mapping(target = "id", ignore = true)
    FoodItem forFoodItemModel(FoodItemRequestDTO foodItemRequestDTO);

    FoodItemResponseDTO forFoodItemResponseDTO(FoodItem foodItem);

    List<FoodItemResponseDTO> forFoodItemResponseDTOList(List<FoodItem> foodItemList);

    Optional<FoodItemResponseDTO> forFoodItemResponseDTO(Optional<FoodItem> foodItemOptional);

    FoodItem forFoodItemModel(Optional<FoodItemRequestDTO> foodItemRequestDTOOptional);
}

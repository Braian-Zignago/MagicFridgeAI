package dev.java10x.MagicFrigdeIA.service;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemRequestDTO;
import dev.java10x.MagicFrigdeIA.DTO.FoodItemResponseDTO;
import dev.java10x.MagicFrigdeIA.mapper.FoodItemMapper;
import dev.java10x.MagicFrigdeIA.mapper.FoodItemUpdate;
import dev.java10x.MagicFrigdeIA.model.FoodItem;
import dev.java10x.MagicFrigdeIA.repository.FoodItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodItemService {

    private final FoodItemRepository foodItemRepository;
    private final FoodItemMapper foodItemMapper;
    private final FoodItemUpdate foodItemUpdate;

    public FoodItemResponseDTO createFoodItem(FoodItemRequestDTO requestDTO) {
        FoodItemResponseDTO responseDTO = foodItemMapper.forFoodItemResponseDTO(
                foodItemRepository.save(
                        foodItemMapper.forFoodItemModel(
                                requestDTO)));
        return responseDTO;
    }

    public List<FoodItemResponseDTO> getAllFoodItems(){
        List<FoodItemResponseDTO> foodItemResponseDTOS = foodItemMapper.forFoodItemResponseDTOList(foodItemRepository.findAll());
        if (foodItemResponseDTOS.isEmpty()){
            return null;
        }
        return foodItemResponseDTOS;
    }

    public FoodItemResponseDTO patchFoodItem(Long id, FoodItemRequestDTO requestDTO) {
        FoodItem foodItem = foodItemRepository.findById(id).orElse(null);
        if (foodItem == null) {
            return null;
        }
        foodItemUpdate.updateFoodItem(requestDTO, foodItem);
        return foodItemMapper.forFoodItemResponseDTO(foodItemRepository.save(foodItem));
    }

    public FoodItemResponseDTO deleteFoodItem(Long id) {
        FoodItemResponseDTO responseDTO = foodItemMapper.forFoodItemResponseDTO(foodItemRepository.findById(id).orElse(null));
        if (responseDTO == null) {
            return null;
        }
        foodItemRepository.deleteById(id);
        return responseDTO;
    }
}

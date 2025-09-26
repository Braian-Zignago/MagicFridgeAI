package dev.java10x.MagicFrigdeIA.controller;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemRequestDTO;
import dev.java10x.MagicFrigdeIA.DTO.FoodItemResponseDTO;
import dev.java10x.MagicFrigdeIA.service.FoodItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
@RequiredArgsConstructor
public class FoodItemController {

    private final FoodItemService foodItemService;

    // POST
    @PostMapping("/create")
    public ResponseEntity<?> createFoodItem(@RequestBody FoodItemRequestDTO foodItemRequestDTO) {
        FoodItemResponseDTO responseDTO = foodItemService.createFoodItem(foodItemRequestDTO);
        if (responseDTO == null) {
            return ResponseEntity.badRequest().body("Error creating food item");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    // GET
    @GetMapping("/get")
    public ResponseEntity<?> getAllFoodItems() {
        List<FoodItemResponseDTO> responseDTOS = foodItemService.getAllFoodItems();
        if (responseDTOS == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No food items found");
        }
        return ResponseEntity.status(HttpStatus.FOUND).body(responseDTOS);
    }

    // PATCH
    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateFoodItem(@PathVariable Long id, @RequestBody FoodItemRequestDTO foodItemRequestDTO) {
        FoodItemResponseDTO responseDTO = foodItemService.patchFoodItem(id, foodItemRequestDTO);
        if (responseDTO == null) {
            return ResponseEntity.badRequest().body("Error updating food item");
        }
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFoodItem(@PathVariable Long id) {
        FoodItemResponseDTO responseDTO = foodItemService.deleteFoodItem(id);
        if (responseDTO == null) {
            return ResponseEntity.badRequest().body("Error deleting food item");
        }
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO.getName() + " with ID " + responseDTO.getId() + " has been deleted.");
    }
}

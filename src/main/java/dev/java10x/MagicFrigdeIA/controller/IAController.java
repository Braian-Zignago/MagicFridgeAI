package dev.java10x.MagicFrigdeIA.controller;

import dev.java10x.MagicFrigdeIA.DTO.FoodItemResponseDTO;
import dev.java10x.MagicFrigdeIA.repository.FoodItemRepository;
import dev.java10x.MagicFrigdeIA.service.FoodItemService;
import dev.java10x.MagicFrigdeIA.service.IAService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class IAController {

    private final FoodItemService foodItemService;
    private final IAService iaService;

    public IAController(FoodItemService foodItemService, IAService iaService) {
        this.foodItemService = foodItemService;
        this.iaService = iaService;
    }

    @GetMapping("/generate")
    public Mono<ResponseEntity<String>> generateRecipe() {
        List<FoodItemResponseDTO> foodItems = foodItemService.getAllFoodItems();
        return iaService.generateRecipe(foodItems)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.noContent().build());
    }

}

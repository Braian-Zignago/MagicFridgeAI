package dev.java10x.MagicFrigdeIA.repository;

import dev.java10x.MagicFrigdeIA.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}

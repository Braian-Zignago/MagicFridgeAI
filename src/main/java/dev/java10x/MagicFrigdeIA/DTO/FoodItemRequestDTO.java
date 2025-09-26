package dev.java10x.MagicFrigdeIA.DTO;

import dev.java10x.MagicFrigdeIA.model.CategoryFood;

import java.time.LocalDate;

public class FoodItemRequestDTO {
    private String name;
    private CategoryFood category;
    private Integer quantity;
    private LocalDate expirationDate;

    public FoodItemRequestDTO(String name, CategoryFood category, Integer quantity, LocalDate expirationDate) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryFood getCategory() {
        return category;
    }

    public void setCategory(CategoryFood category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}

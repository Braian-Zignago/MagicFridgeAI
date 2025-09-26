package dev.java10x.MagicFrigdeIA.DTO;

import dev.java10x.MagicFrigdeIA.model.CategoryFood;

import java.time.LocalDate;

public class FoodItemResponseDTO {

    private Long id;
    private String name;
    private CategoryFood category;
    private Integer quantity;
    private LocalDate expirationDate;

    public FoodItemResponseDTO(Long id, String name, CategoryFood category, Integer quantity, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

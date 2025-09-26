package dev.java10x.MagicFrigdeIA.DTO;

import dev.java10x.MagicFrigdeIA.model.CategoryFood;

public class FoodItemResponseDTO {

    private Long id;
    private String name;
    private CategoryFood category;
    private int quantity;
    private String expirationDate;

    public FoodItemResponseDTO(Long id, String name, CategoryFood category, int quantity, String expirationDate) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}

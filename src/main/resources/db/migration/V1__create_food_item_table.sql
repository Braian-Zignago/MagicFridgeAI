-- V1__create_food_item_table --

CREATE TABLE food_items (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(100) NOT NULL,
    quantity INT,
    expiration_date DATE NOT NULL
);
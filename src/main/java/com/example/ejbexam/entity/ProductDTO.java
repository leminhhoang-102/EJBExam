package com.example.ejbexam.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private long dateOfManf;
    private double price;

    public ProductDTO(int id, String name, String description, long dateOfManf, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateOfManf = dateOfManf;
        this.price = price;
    }

    public ProductDTO() {
    }
}

package com.example.ejbexam.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private long dateOfManf;
    private double price;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "saleId")
    private Sale sale;
    @Column(insertable = false,updatable = false)
    private String saleId;

public Product(){

}
    public Product(ProductDTO productDTO){
        this.id = productDTO.getId();
        this.name =productDTO.getName();
        this.description=productDTO.getDescription();
        this.price=productDTO.getPrice();
        this.dateOfManf=productDTO.getDateOfManf();
    }
}

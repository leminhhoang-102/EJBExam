package com.example.ejbexam.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Sale {
    @Id
    private int slNo;
    private int salesManId;
    private String salesManName;
    private long DOS;
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> productSet;

    public void addCredential(Product product) {
        if(this.productSet == null){
            this.productSet = new HashSet<>();
        }
        this.productSet.add(product);
    }

    public Sale(){

    }

    public Sale(SaleDTO saleDTO){
        this.slNo=saleDTO.getSlNo();
        this.salesManName=saleDTO.getSalesManName();
        this.salesManId=saleDTO.getSalesManId();
        this.DOS=saleDTO.getDOS();
    }
}

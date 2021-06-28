package com.example.ejbexam.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleDTO {
    private int slNo;
    private int salesManId;
    private String salesManName;
    private long DOS;

    public SaleDTO() {
    }

    public SaleDTO(int slNo, int salesManId, String salesManName, long DOS) {
        this.slNo = slNo;
        this.salesManId = salesManId;
        this.salesManName = salesManName;
        this.DOS = DOS;
    }
}

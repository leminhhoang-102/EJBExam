package com.example.ejbexam.service;

import com.example.ejbexam.entity.Sale;
import com.example.ejbexam.entity.SaleDTO;
import com.example.ejbexam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public void createSale(SaleDTO saleDTO){
        Sale sale = new Sale(saleDTO);
        saleRepository.save(sale);
    }

    public List<SaleDTO> list(){
        List<Sale> list = saleRepository.findAll();
        List<SaleDTO> saleDTOList = null;
        for (int i = 0; i < list.size(); i++) {

        }
        return null;
    }
}

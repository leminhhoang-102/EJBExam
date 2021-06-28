package com.example.ejbexam.controller;

import com.example.ejbexam.entity.Product;
import com.example.ejbexam.entity.ProductDTO;
import com.example.ejbexam.entity.Sale;
import com.example.ejbexam.entity.SaleDTO;
import com.example.ejbexam.repository.ProductRepository;
import com.example.ejbexam.repository.SaleRepository;
import com.example.ejbexam.service.ProductService;
import com.example.ejbexam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SaleService saleService;

    @RequestMapping(value = "/generate")
    public void generateData(){
        SaleDTO saleDTO1 = new SaleDTO(1,1,"hoang",2);
        SaleDTO saleDTO2 = new SaleDTO(2,1,"hong",3);
        Sale sale1 = new Sale(saleDTO1);
        Sale sale2 = new Sale(saleDTO2);
        saleService.createSale(saleDTO1);
        saleService.createSale(saleDTO2);

        ProductDTO productDTO1 = new ProductDTO(1,"chuot","dai",2,3);
        ProductDTO productDTO2 = new ProductDTO(2,"loa","to",6,3);
        ProductDTO productDTO3 = new ProductDTO(3,"khoi","tro",9,3);
        ProductDTO productDTO4 = new ProductDTO(4,"bi","khoai",10,5);
        productService.createProduct(productDTO1,sale1);
        productService.createProduct(productDTO2,sale1);
        productService.createProduct(productDTO3,sale2);
        productService.createProduct(productDTO4,sale2);

    }

    @RequestMapping(value = "/productList")
    public List<ProductDTO> getProductList(){
        return productService.list();
    }

    @RequestMapping(value = "/saleList")
    public List<SaleDTO> getSaleList(){
        return saleService.list();
    }
}

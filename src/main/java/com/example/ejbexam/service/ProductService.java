package com.example.ejbexam.service;

import com.example.ejbexam.entity.Product;
import com.example.ejbexam.entity.ProductDTO;
import com.example.ejbexam.entity.Sale;
import com.example.ejbexam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductDTO productDTO, Sale sale){
        Product product =new Product(productDTO);
        product.setSale(sale);
        productRepository.save(product);
    }

    public List<ProductDTO> list(){
       List<Product> list1 = productRepository.findAll();
       List<ProductDTO> list = null;
        for (int i = 0; i < list1.size(); i++) {
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId( list1.get(i).getId());
            productDTO.setName(list1.get(i).getName());
            productDTO.setDescription(list1.get(i).getDescription());
            productDTO.setDateOfManf(list1.get(i).getDateOfManf());
            productDTO.setPrice(list1.get(i).getPrice());
            list.add(productDTO);
        }
    return list;
    }
}

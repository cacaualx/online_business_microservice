package com.productmicroservice.Product_MS.service;

import com.productmicroservice.Product_MS.entity.Product;
import com.productmicroservice.Product_MS.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //Metodo POST
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    //Metodo GET para um único produto pelo ID
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //Metodo GET para varios produtos
    public List<Product> getProducts() {
        return repository.findAll();
    }

    //Metodo GET para pegar um produto pelo nome
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    //Metodo DELETE
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Produto " + id + " removido";
    }

    //Metodo de update
    public Product updateProduct(Product product){
        Product existingProduct = (Product) repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}

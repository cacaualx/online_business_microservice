package com.productmicroservice.Product_MS.controller;

import com.productmicroservice.Product_MS.entity.Product;
import com.productmicroservice.Product_MS.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    //Metodo POST

    @Operation(description = "Adiciona uma lista de produtos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Adiciona uma lista de produtos"),
            @ApiResponse(responseCode = "500", description = "Erro de conexão")
    })
    @PostMapping("addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    //Metodo GET
    @Operation(description = "Retorna uma lista de produtos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna uma lsita de produtos"),
    })
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @Operation(description = "Busca um produto pelo id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o produto que tem o respectivo id"),
            @ApiResponse(responseCode = "400", description = "Produto não encontrado")
    })
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @Operation(description = "Busca um produto pelo nome")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retorna o produto que tem o respectivo nome"),
            @ApiResponse(responseCode = "400", description = "Produto não encontrado")
    })
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    //Metodo PUT
    @Operation(description = "Atualiza um produto")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Produto atualizado"),
            @ApiResponse(responseCode = "400", description = "Produto não encontrado")
    })
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    //Metodo DELETE
    @Operation(description = "Deleta um produto pelo id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Produto deletado"),
            @ApiResponse(responseCode = "400", description = "Produto não encontrado")
    })
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}

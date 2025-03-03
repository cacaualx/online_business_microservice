package com.productmicroservice.Product_MS;

import com.productmicroservice.Product_MS.entity.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void creatingAndGetingAProduct(){

        Product product = new Product();

        product.setId(4);
        product.setName("Computer");
        product.setPrice(512.99);
        product.setQuantity(1);

        assertEquals(4, product.getId());
        assertEquals("Computer", product.getName());
        assertEquals(512.99, product.getPrice());
        assertEquals(1, product.getQuantity());

    }

}

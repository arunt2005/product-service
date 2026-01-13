package com.apps.service;

import com.apps.utils.ProductUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public String getProduct(int productId) {
        return ProductUtils.getProduct(productId);
    }

    public static List<String> getAllProducts() {
        return ProductUtils.getAllProducts();
    }

}

package com.apps.utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductUtils {

    public static Map<Integer, String> productMap = Map.of(
            11, "Apple",
            12, "Orange",
            13, "Mango",
            14, "Grap",
            15, "Pineapple");

    public static String getProduct(int productId) {
        return productMap.get(productId);
    }

    public static List<String> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }

}

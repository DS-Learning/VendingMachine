package com.training.tdd.vendingmachine.repo;

import com.training.tdd.vendingmachine.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    // Database representation
    private List<Product> dataSet;

    public ProductRepository() {
        this.dataSet = new ArrayList<>();
        this.dataSet.add(new Product("Coke", 15L));
        this.dataSet.add(new Product("Instant Noodle", 6L));
        this.dataSet.add(new Product("Lay", 10L));
        this.dataSet.add(new Product("Coffee", 10L));
        this.dataSet.add(new Product("Tea", 12L));
    }

    public List<Product> getAllProducts() {
        return this.dataSet;
    }
}

package com.training.tdd.vendingmachine.repo;

import com.training.tdd.vendingmachine.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> getAllProducts();

}
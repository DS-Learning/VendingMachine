package com.training.tdd.vendingmachine.service;

import com.training.tdd.vendingmachine.model.Product;
import com.training.tdd.vendingmachine.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VendingMachineService {

    ProductRepository legacyProductRepo = new ProductRepository();

    public String getAllProducts() {

        List<Product> productList = legacyProductRepo.getAllProducts();
        String productListStr = "";

        if (productList.size() < 1) {
            productListStr = "ไม่มีสินค้าในเครื่อง";
        } else {
            for (Product product : productList) {
                productListStr += product.getName() + "(฿" + product.getPrice() + ") ";
            }
        }
        return productListStr;
    }
}

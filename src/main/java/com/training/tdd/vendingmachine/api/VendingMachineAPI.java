package com.training.tdd.vendingmachine.api;

import com.training.tdd.vendingmachine.service.VendingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/vending-machine")
public class VendingMachineAPI {
    @Autowired
    VendingMachineService vendingMachineService;

    @GetMapping("/product")
    public ResponseEntity<?> getAllProduct() {
        return ResponseEntity.ok(
                vendingMachineService.getAllProducts()
        );
    }
}

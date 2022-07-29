package com.atakanoguzdev.controller;

import com.atakanoguzdev.model.Purchase;
import com.atakanoguzdev.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController
{

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping //api/purchase
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping({"{userId}"}) //api/purchase/{userId}
    public ResponseEntity<?> getAllPurchaseOfUser(@PathVariable Long userId)
    {
        return ResponseEntity.ok(purchaseService.findAllPurchaseOfUser(userId));
    }

}

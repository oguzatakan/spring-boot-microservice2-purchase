package com.atakanoguzdev.service;

import com.atakanoguzdev.model.Purchase;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchaseOfUser(Long userId);
}

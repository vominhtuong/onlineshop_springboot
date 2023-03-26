package com.onlineshop.library.service;

import com.onlineshop.library.model.Customer;
import com.onlineshop.library.model.Product;
import com.onlineshop.library.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);

    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);

    ShoppingCart deleteItemFromCart(Product product, Customer customer);
}

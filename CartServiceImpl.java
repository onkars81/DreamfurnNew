package com.emusicstore.service.impl;


import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import com.emusicstore.service.CartService;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartDao cartDao;

    @Transactional
    public Cart getCartById(int cartId){
        return cartDao.getCartById(cartId);
    }
    @Transactional
    public void update(Cart cart){
        cartDao.update(cart);
    }

} // The End of Class;

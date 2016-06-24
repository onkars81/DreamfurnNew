package com.emusicstore.service.impl;


import com.emusicstore.dao.CartItemDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import com.emusicstore.model.Customer;
import com.emusicstore.service.CartItemService;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    @Autowired
    private SessionFactory sessionfactory;
    
    @Transactional
    public void addCartItem(CartItem cartItem){
    	
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		cartItemDao.addCartItem(cartItem);
		tx.commit();

    
    
    }
    @Transactional
    public void removeCartItem(CartItem cartItem){
    	Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();

    	cartItemDao.removeCartItem(cartItem);
   
		tx.commit();
    }
    @Transactional
    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }
    @Transactional
    public CartItem getCartItemByProductId(int productId){
        return cartItemDao.getCartItemByProductId(productId);
    }

} // The End of Class;
